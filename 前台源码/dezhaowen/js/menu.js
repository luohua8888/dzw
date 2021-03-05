var menuApi = {
	findMenuByUserId : function(roleid,callback){
		$.ajax({
			url:top.baseUrl+"sysMenu/"+roleid,
			type:"get",
			dataType:"json",
			success:function(result){
				callback(result);
			},error:function(error){
				console.log(error);
			}
		});
	},
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
	},
	findPermss : function(roleid,callback){
		$.ajax({
			url:top.baseUrl+"sysMenu/sss/"+roleid,
			type:"get",
			dataType:"json",
			success:function(result){
				callback(result);
			},error:function(error){
				console.log(error);
			}
		});
	},
	findpap : function (ul,callback){
		$.ajax({
			url:top.baseUrl+"user/sys/"+ul,
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