cordova.define("ToasID.Toast", function(require, exports, module) {
var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'Toast', 'toast', [arg0]);
};

exports.openURL = function (arg0) {
    exec(null, null, 'Toast', 'OPEN', [arg0]);
};

exports.log = function (arg0) {
    exec(null, null, 'Toast', 'LOG', [arg0]);
};

});
