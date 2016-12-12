(function (angular) {
  'use strict';

  function WpInputController($attrs, $log){
    this.wpLabel = $attrs.wpLabel;
    this.wpType = $attrs.wpType;
    this.wpRequired = $attrs.wpRequired;
    $log.debug($attrs);
  }

  WpInputController.$inject = ['$attrs', '$log'];

  angular
    .module('wp-angular-starter')
    .component('wpInput', {
      templateUrl: "app/components/wp-input/wp-input.component.html",
      controller: WpInputController,
      bindings: {
        wpModel: '=',
        wpFocus: '='
      }
    });

})(angular);
