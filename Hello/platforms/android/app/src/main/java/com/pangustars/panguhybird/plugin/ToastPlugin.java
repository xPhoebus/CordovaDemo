package com.pangustars.panguhybird.plugin;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ToastPlugin extends CordovaPlugin {

    public static final String  ACTION = "toast";
    public static final String  ACTION_OPEN = "OPEN";
    public static final String  ACTION_LOG = "LOG";

    @Override
    public boolean execute(String action,
                           JSONArray args,
                           CallbackContext callbackContext) throws JSONException {
        LOG.i("ToastPlugin", "ACTION: " + action);

        if (action.equals(ACTION)) {
            Toast.makeText(cordova.getActivity(),
                           args.getString(0),
                           Toast.LENGTH_SHORT).show();

            JSONObject oldjson1=new JSONObject();

            oldjson1.put("name", "zhangsan");

            JSONObject oldjson2=new JSONObject();

            oldjson2.put("name", "lisi");
            oldjson2.put("age", "20");

            JSONObject newjson=new JSONObject();

            newjson.put("a", oldjson1);
            newjson.put("b", oldjson2);

            callJS(callbackContext, newjson);
        } else if (action.equals(ACTION_OPEN)) {
            CordovaActivity activity = (CordovaActivity)cordova.getActivity();
            activity.loadUrl(args.getString(0));
        } else if (action.equals(ACTION_LOG)) {
            LOG.i("ToastPlugin", "LOG: " + args.getString(0));
        }


        return true;
    }

    @Override
    public Boolean shouldAllowBridgeAccess(String url) {
        return true;
    }

    public static void callJS(CallbackContext callbackContext, String message) {
        if (callbackContext != null) {
            PluginResult dataResult = new PluginResult(PluginResult.Status.OK, message);
//            dataResult.setKeepCallback(true);// 非常重要
            callbackContext.sendPluginResult(dataResult);
        }
    }

    public static void callJS(CallbackContext callbackContext, JSONObject message) {
        if (callbackContext != null) {
            PluginResult dataResult = new PluginResult(PluginResult.Status.OK, message);
//            dataResult.setKeepCallback(true);// 非常重要
            callbackContext.sendPluginResult(dataResult);
        }
    }
}
