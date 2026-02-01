var exec = require('cordova/exec');
exports.getInstaller = function (success, error) {
     exec(success, error, 'InstallerId', 'getInstaller', []);
};
exports.sideLoaded = function(success, error) {
     exec((res)=>{
          success(!res || res === '');          
     }, error, 'InstallerId', 'getInstaller', []);
};
