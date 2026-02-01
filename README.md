# cordova-plugin-installer-id
Cordova plugin for Android to detect installer id

## Installation
```bash
cordova plugin add @globules-io/cordova-plugin-installer-id
cordova plugin rm @globules-io/cordova-plugin-installer-id
```
## Supported Platforms
Android

## JS API
Get the installer id
```bash
InstallerId.getInstaller(function(installerId) {
    console.log("Installer ID:", installerId);
    if (!installerId || installerId === "") {
        console.log("App was sideloaded");
    } else if (installerId === "com.android.vending") {
        console.log("Installed from Google Play");
    } else {
        console.log("Installed from:", installerId);
    }
}, function(err) {
    console.error("Error retrieving installer ID:", err);
});
```

Check if app was sideloaded
```bash
InstallerId.sideLoaded(function(bool) {
     console.log("App sideLoaded ?", bool);
}, function(err) {});
```

