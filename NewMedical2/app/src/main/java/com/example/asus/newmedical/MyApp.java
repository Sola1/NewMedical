package com.example.asus.newmedical;

import android.app.Application;

import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.controller.EaseUI;

/**
 * Created by liyan on 2017/5/10.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EaseUI.getInstance().init(this, null);
        EMClient.getInstance().setDebugMode(true);
    }
}
