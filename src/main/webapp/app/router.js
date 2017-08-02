import Ember from 'ember';
import config from './config/environment';

const Router = Ember.Router.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('chapter', { path: 'chapter/:number' });
  this.route('chapters');
});

export default Router;
