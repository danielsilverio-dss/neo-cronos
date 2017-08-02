import Ember from 'ember';

export function initialize(){
	Ember.Inflector.inflector.irregular('chapter','chapter');
}

export default{
	name: 'inflections',
	initialize
}