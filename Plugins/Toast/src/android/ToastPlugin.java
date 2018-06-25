package com.pangustars.panguhybird.plugin;

public class ToastPlugin extends CordovaPlugin {

    public static final String  ACTION = "toast";

    @Override
    public boolean execute(String action,
                           JSONArray args,
                           CallbackContext callbackContext) throws JSONException {
        if (action.equals(ACTION)) {
            Toast.makeText(cordova.getActivity(),
                           args.getString(0),
                           Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
