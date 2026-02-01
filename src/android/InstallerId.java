package io.globules;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.pm.PackageManager;

public class InstallerId extends CordovaPlugin {
     @Override
     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
          if ("getInstaller".equals(action)) {
               PackageManager pm = cordova.getActivity().getPackageManager();
               String installer = pm.getInstallerPackageName(cordova.getActivity().getPackageName());
               callbackContext.success(installer == null ? "" : installer);
               return true;
          }
          return false;
     }
}