package com.rechao.modulelibray;

import android.app.Application;

/**
 * Created by 王鹏程 on 2018/11/29.
 * 类(BaseApplication)解释:
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        Stetho.initializeWithDefaults(this);
    }
}
