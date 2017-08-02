import Ember from 'ember';

export default Ember.Route.extend({

	model(){
		return this.store.findAll('chapter');
	}
	
	/*
	didRender(){
		$.ajax({
		      url     : context + "/api/_default/logo",
		      type    : "get",
		      processData : false,
		      contentType : false
		    }).done(function(resp){
		    	if(resp){
		    		$("#logo").attr("src", resp);	
		    	}else{
		    		$("#logo").attr("src", context + "/img/logo-metasix-white.png");
			    	$("#logo").css("width" , "60%");
		    	}
		    }).fail(function(erro){
		    	$("#logo").attr("src", context + "/img/logo-metasix-white.png");
		    	$("#logo").css("width" , "60%")
	});


	}
	*/

});