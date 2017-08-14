import Ember from 'ember';

export default Ember.Route.extend({

	model(){
		return Ember.RSVP.hash({
			chapters: this.store.findAll('chapter'),
			//newChapter: this.store.createRecord('chapter')
		}) 
		
		
		
	},
	
	setupController(controller, model){
		controller.set('chapters', model.chapters);
		//controller.set('newChapter', model.newChapter)
	},
	
	actions: {
		saveChapter(number, title, description){
			//let chapter = model.newChapter;
			//let chapter = this.get('controller.model.newChapter');
			
			console.log('number: ' + number)
			console.log('title: ' + title)
			console.log('description: ' + description)
			
			let chapter = this.store.createRecord('chapter', {number, title, description})
			
			console.log('------------------------------')
			console.log('number: ' + chapter.number)
			console.log('title: ' + chapter.title)
			console.log('description: ' + chapter.description)
			
			
			chapter.save().then(function(){
				console.log('salvo com sucesso!')
			}).catch()
		}
	}
	
});
