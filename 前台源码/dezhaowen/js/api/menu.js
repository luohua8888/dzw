var menuApi = {
	findPerms : function(roleid,callback){
		$.ajax({
			url:top.baseUrl+"sysMenu/sys/"+roleid,
			type:"get",
			dataType:"json",
			success:function(result){
				callback(result);
			},error:function(error){
				console.log(error);
			}
		});
	}
}