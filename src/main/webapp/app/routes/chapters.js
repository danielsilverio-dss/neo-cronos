import Ember from 'ember';

export default Ember.Route.extend({
	
	model(){
		return Ember.$.getJSON('http://localhost:8080/api/chapter');
		//return this.store.findAll('chapter');
	}
	
});
