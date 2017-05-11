package com.example.asus.newmedical.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;


import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.newmedical.R;
import com.hyphenate.easeui.EaseConstant;


/**
 * Created by ${liyan} on 2017/5/8.
 */

public class HelperFragment extends Fragment {
    private static final String TAG = "HelperFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_helper,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       // ChatFragment chatFragment = new ChatFragment();
//        Bundle args = getArguments();
//        Log.e("eeeeeeeee",args.toString());
//        //传入参数
//        chatFragment.setArguments(args);
 //       getChildFragmentManager().beginTransaction().add(R.id.fragment_helper_ask_linearLayout, chatFragment).commit();


    }
    public void getContent(String userName,String userId,String type,int single){
        Log.e(TAG, userName + "  "+ userId + "  " + type + "  " + single);
        Bundle bundle = new Bundle();
        bundle.putString("userName",userName);
        bundle.putString("userId",userId);
        bundle.putString("type",type);
        bundle.putInt("single",single);
        ChatFragment chatFragment = new ChatFragment();
        chatFragment.setArguments(bundle);
        getChildFragmentManager().beginTransaction().replace(R.id.fragment_helper_ask_linearLayout, chatFragment).commit();


    }
}
