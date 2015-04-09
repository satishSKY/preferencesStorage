package sky.phonegap.preferencesStorage;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;

public class PreferencesStorage extends CordovaPlugin{
	public static  Editor editor = null;
	public	static  SharedPreferences sharedPrefs = null;


	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);	
	}

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext)  throws JSONException{

		if(sharedPrefs == null){
			sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this.cordova.getActivity());
			editor = sharedPrefs.edit();
		}

		if(action.equals("getAll")){
			this.getAll(callbackContext);
			return true;
		}else if (action.equals("storeMsg")) {
			this.storeMsg(args,callbackContext);
			return true;
		}else if (action.equals("getMsg")) {
			this.getMsg(args,callbackContext);
			return true;
		}else if (action.equals("removeMsg")) {
			this.removeMsg(args,callbackContext);
			return true;
		}else if (action.equals("removeAll")) {
			this.removeAll(args,callbackContext);
			return true;
		}
		return false;
	}
	private void removeAll(JSONArray args, CallbackContext callbackContext) {
		// TODO Auto-generated method stub
		try{
			editor.clear();
			callbackContext.success("success");
		}catch(Exception e){
			e.printStackTrace();
			callbackContext.error("Error");
		}
	}

	private void removeMsg(JSONArray args, CallbackContext callbackContext) {
		// TODO Auto-generated method stub
		try {
			if(sharedPrefs.getString(args.getString(0),null) != null){
				editor.remove(args.getString(0));
				editor.commit();
				callbackContext.success("success");
			}else {
				callbackContext.error("Error");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	private void getMsg(JSONArray args, CallbackContext callbackContext) {
		// TODO Auto-generated method stub
		String key = "";
		try {
			key = args.getString(0);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(key.length() > 0 && sharedPrefs.getString(key,null) != null){
		//	Log.i("sharedPrefs get key : "+key, " : "+sharedPrefs.getString(key,"invalid key"));
			callbackContext.success(sharedPrefs.getString(key,null));
		}else {
			callbackContext.error("Error");
		}

	}
	private void storeMsg(JSONArray args,  CallbackContext callbackContext) {
		Log.i("key", ""+args);
		String key = "";
		String value = "";
		try {
			key = args.getString(0);
			value = args.getString(1);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(key.length() > 0 ){
			editor.putString(key, value);
			editor.commit();
		//	Log.i("success store key : ", key +"------"+ value);
			callbackContext.success("success");
		}else{
			callbackContext.error("Error");
		}
	}
	private void getAll(CallbackContext callbackContext) {
		try {
		//	Log.i("success  getAll : ", ""+sharedPrefs.getAll());
			callbackContext.success(""+sharedPrefs.getAll());

		} catch (Exception e) {
			// TODO: handle exception
			callbackContext.error("Error");
		}
					
		

	}

}

