var exec = require('cordova/exec');
exports.getInstaller = function (success, error) {
     exec(success, error, 'InstallerId', 'getInstaller', []);
};
