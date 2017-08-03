import Ember from 'ember';

export default Ember.Route.extend({
	
	model(params){
		return this.store.find('chapter', params.number);
	},
	
	setupController(controller, model){
		controller.set('chapter', model);
	}
	
	
});
