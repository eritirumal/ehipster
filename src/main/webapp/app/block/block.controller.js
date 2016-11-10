(function() {
    'use strict';

    angular
        .module('ehipsterApp')
        .controller('BlockController', BlockController);

    BlockController.$inject = ['$scope', 'BlockService'];

    function BlockController($scope, blockService) {
        $scope.list = [];
        $scope.refresh = function() {
            $scope.list = blockService.getList();
        };
        $scope.refresh();

        $scope.pop = function() {
            blockService.pop();
        }

        $scope.add = function() {
            blockService.add({"value": $scope.newBlock});
        }


    }
})();