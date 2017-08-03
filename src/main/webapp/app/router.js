import Ember from 'ember';
import config from './config/environment';

const Router = Ember.Router.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('chapters', function() {
    this.route('new');
    this.route('show');
    this.route('find', {path: '/:number'});
  });
});

export default Router;
