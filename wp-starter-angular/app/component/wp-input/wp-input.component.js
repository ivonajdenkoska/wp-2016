(function (angular) {
  'use strict';

  function WpInputController($attrs, $log){
    this.wpLabel = $attrs.wpLabel;
    this.wpType = $attrs.wpType;
    this.wpFocus = $attrs.wpFocus;
    this.wpRequired = $attrs.wpRequired;
    $log.debug($attrs);
  }

  WpInputController.$inject = ['$attrs', '$log'];

  angular
    .module('wp-angular-starter')
    .component('wpInput', {
      templateUrl: "app/component/wp-input/wp-input.component.html",
      controller: WpInputController,
      bindings: {
        wpModel: '=',
        wpFocus: '='
      }
    }).directive('focusMe', function () {
         return {
           restrict: 'A',
           scope: {
             focusMe: '='
           },
           link: function (scope, elt) {
             scope.$watch('focusMe', function (val) {
               if (val) {
                 elt[0].focus();
               }
             });
           }
         };
       });

})(angular);
