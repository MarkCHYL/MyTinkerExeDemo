package com.exe.mark.mytinkerexedemo;

import android.app.Application;

import com.tencent.bugly.Bugly;

/**
 *
 * Created by mark on 2018/3/6.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Bugly
        Bugly.init(getApplicationContext(), "55904d570f", false);
    }
}
