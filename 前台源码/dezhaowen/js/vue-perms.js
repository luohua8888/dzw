Vue.directive("perms",{
	inserted:function(el,binding,vnode,oldnode){
		//获取整个系统中拥有的所有权限
		var perms = top.data.perms;
		console.log(perms);
		var verfiy = binding.value;//当前验证的权限
		var flag = perms.some(item=>item.men2==verfiy);
		if(!flag){
			el.remove();
		}
	},
})