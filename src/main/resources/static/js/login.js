angular.module('login', []).controller('login', function($http) {
    var self = this;
    $http.get('login/').then(function(response) {
        self.greeting = response.data;
    })
});