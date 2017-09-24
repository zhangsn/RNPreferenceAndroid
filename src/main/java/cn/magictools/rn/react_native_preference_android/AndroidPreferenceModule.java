package cn.magictools.rn.react_native_preference_android;

import android.content.SharedPreferences;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by zhangsn on 17/9/24.
 */

public class AndroidPreferenceModule extends ReactContextBaseJavaModule {
    public AndroidPreferenceModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @ReactMethod
    public void set(String key,String value){
        getCurrentActivity().getSharedPreferences(getName(), 0).edit().putString(key,value).apply();
    }
    @ReactMethod
    public void get(String key, Promise promise){
        promise.resolve(getCurrentActivity().getSharedPreferences(getName(), 0).getString(key,""));
    }
    @Override
    public String getName() {
        return "RNPreferenceAndroid";
    }
}
