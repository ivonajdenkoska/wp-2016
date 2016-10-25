(function (angular) {
  'use strict';

  function GroupSelectController($log, GroupService){
  var vm = this;
    vm.groups = [];

     GroupService.getAll().then(function (data) {
               $log.debug(data);
               vm.groups = data;
             });
      $log.debug(vm.groups);
  }

  GroupSelectController.$inject = ['$log', 'GroupService'];

  angular
    .module('wp-angular-starter')
    .component('groupSelect', {
      templateUrl: "app/component/group-select/group-select.component.html",
      controller: GroupSelectController,
      bindings: {
        wpModel: '='
      }
    });

})(angular);
