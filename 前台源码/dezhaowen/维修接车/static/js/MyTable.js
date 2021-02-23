Vue.component("mytable", {
	props: ["data"],
	render: function(createElement) {
		//获取当前组建中的默认卡槽内容
		var columns = this.$slots.default;
		//根据获取到卡槽节点进行遍历创建表格头部
		var labels = columns.map(item => {
			if(item.tag) {
				return createElement("td", item.data.attrs.label);
			}
		});
		//定义将要创建行到数组
		var rows = [];
		//创建头部行
		var labelsRow = createElement("tr", labels);
		//将头部行放入到数组中
		rows.push(labelsRow);
		//根据传递进来数据构建行
		let dataRows = this.data.map((item, index) => {
			//根据组建中到卡槽节点构建行中的列(td)
			let dataColumns = columns.map(column => {
				//判别是否为标签,并且是否有prop属性(是否直接显示数据中的值)
				if(column.tag && column.data.attrs.prop) {
					let prop = column.data.attrs.prop;
					return createElement("td", item[prop]);
				} else if(column.tag) { //如果不直接显示值则表示显示当前标签中的内容(卡槽)
					//column.data.scopedSlots.default:获取当前卡槽中的作用域卡槽,将数据传递给作用域卡槽
					return createElement("td", column.data.scopedSlots.default({
						item: item,
						row: index
					}));
				}
			});
			return createElement("tr", dataColumns);
		});
		//将创建好的数据行添加到数组中
		rows.push(dataRows);
		//构建表格,放入数组中到行
		return createElement("table", rows);
	}
});