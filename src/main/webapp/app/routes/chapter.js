import Ember from 'ember';

export default Ember.Route.extend({
	
	model(){
		this.store.get('chapter', params.id);
	}
	
});
