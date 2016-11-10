(function () {
    'use strict';

    angular
        .module('ehipsterApp')
        .factory('BlockService', BlockService);

    BlockService.$inject = ['$resource'];

    function BlockService ($resource) {
        var service = $resource('api/block', {}, {
            'getList': {method: 'GET', isArray: true},
            'add': { method:'POST' },
            'pop':{ method:'DELETE'}
        });

        return service;
    }
})();
