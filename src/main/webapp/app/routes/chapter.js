import Ember from 'ember';

export default Ember.Route.extend({
	
	model(params){
		this.store.get('chapter', params.id);
	}
	
});
