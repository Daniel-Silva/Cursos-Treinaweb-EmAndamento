var MYAPP = angular.module('MYAPP', []);

MYAPP.controller('firstController', ['$scope', 'NameService', function($scope, NameService){
    $scope.name = 'Daniel Silva';
    NameService.save($scope.name);
}]);

MYAPP.service('NameService', function(){
   this.save = function(name){
       console.log(name)
   } 
});
