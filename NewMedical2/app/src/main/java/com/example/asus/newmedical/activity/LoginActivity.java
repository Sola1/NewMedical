package com.example.asus.newmedical.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.asus.newmedical.R;
import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;

/**
 * Created by liyan on 2017/5/11.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EMClient.getInstance().login("ceshi2", "111111", new EMCallBack() {
                    @Override
                    public void onSuccess() {
                        Log.e( "onSuccess: ","success!" );
                        startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    }

                    @Override
                    public void onError(int i, String s) {
                        Log.e( "onError: ",i + " " + s + "登录失败");

                    }

                    @Override
                    public void onProgress(int i, String s) {

                    }
                });
            }
        });
    }
}
