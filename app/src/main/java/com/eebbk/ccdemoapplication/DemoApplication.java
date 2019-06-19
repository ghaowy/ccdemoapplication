package com.eebbk.ccdemoapplication;

import android.app.Application;

import com.billy.cc.core.component.CC;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CC.enableDebug(BuildConfig.DEBUG);
        CC.enableVerboseLog(BuildConfig.DEBUG);
        CC.enableRemoteCC(BuildConfig.DEBUG);
    }
}
