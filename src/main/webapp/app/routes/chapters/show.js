import Ember from 'ember';

export default Ember.Route.extend({

	model(){
		return this.store.findAll('chapter');
	},
	
	setupController(controller, model){
		controller.set('chapters', model);
	}
	
});
