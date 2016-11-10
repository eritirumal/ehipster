(function () {
    'use strict';

    angular
        .module('ehipsterApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig ($stateProvider) {
        $stateProvider.state('block', {
            parent: 'entity',
            url: '/block',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Block managment'
            },
            views: {
                'content@': {
                    templateUrl: 'app/block/block.html',
                    controller: 'BlockController',
                    controllerAs: 'vm'
                }
            }
        });
    }
})();
