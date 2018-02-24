package com.kcufow.easylife.app;

import android.app.Application;
import android.content.Context;

import com.mob.MobSDK;

/**
 * Created by ldw on 2018/1/5.
 */

public class MyApp extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        MobSDK.init(this);

    }

    public static Context getAppContext(){
        return mContext;
    }
}
