cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "ToasID.Toast",
    "file": "plugins/ToasID/www/Toast.js",
    "pluginId": "ToasID",
    "clobbers": [
      "cordova.plugins.Toast"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.3",
  "ToasID": "1.0.0"
};
// BOTTOM OF METADATA
});