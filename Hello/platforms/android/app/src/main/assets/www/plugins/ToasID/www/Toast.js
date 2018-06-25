cordova.define("ToasID.Toast", function(require, exports, module) {
var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'Toast', 'coolMethod', [arg0]);
};

});
