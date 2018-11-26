package com.rechao.mylibrary.reference;

import android.util.Log;

/**
 * Created by 王鹏程 on 2018/11/26.
 * 类(LogUtils)解释:
 */
public class LogUtils {


    public static boolean logDebug = false;
    private static String TAG = "Log日志";
    public static void e(String msg) {
        if (logDebug) {
            Log.e(TAG, msg);
        }
    }


    public static void i(String msg) {
        if (logDebug) {
            Log.i(TAG, msg);
        }
    }


}