import Ember from 'ember';

export default Ember.Route.extend({
	
	model(params){
		this.store.findRecord('chapter', params.number);
	}
	
});
