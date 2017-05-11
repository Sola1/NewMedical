package com.example.asus.newmedical.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.newmedical.HandMessage;
import com.example.asus.newmedical.R;
import com.example.asus.newmedical.fragment.HelperFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

//    @Override
//    public void sendMsg(String userName,String userId,String type,int single) {
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        HelperFragment helperFragment = new HelperFragment();
//        Bundle bundle = new Bundle();
//        bundle.putString("userName", userName);
//        bundle.putString("userId",userId);
//        bundle.putString("type",type);
//        bundle.putInt("single",single);
//        //在主Activity中要通过被实例化的Fragment对象的setArguments(Bundle args)方法
//        //向Fragment传值
//        helperFragment.setArguments(bundle);
//        transaction.replace(R.id.helper,helperFragment);
//        transaction.commit();
//    }


}
