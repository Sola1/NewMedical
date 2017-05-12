package com.example.asus.newmedical.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.newmedical.R;
import com.example.asus.newmedical.RecyclerClick;
import com.example.asus.newmedical.adapter.DoctorAdapter;
import com.example.asus.newmedical.bean.HelperBean;
import com.hyphenate.easeui.EaseConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${liyan} on 2017/5/8.
 */

public class DoctorFragment extends Fragment {

    private String[] name=new String[]{"张三","李四","王五"};
    private String[] sex=new String[]{"男","女","男"};
    private int[] age=new int[]{22,40,55};
    private String[] content=new String[]{"头痛","嗓子痛","感冒"};
    private RecyclerView recyclerView;
    private DoctorAdapter doctorAdapter;
    private List<HelperBean> data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_doctor,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        data=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            HelperBean helperBean=new HelperBean(name[i],sex[i],content[i],age[i]);
            data.add(helperBean);
        }
        recyclerView= (RecyclerView) getActivity().findViewById(R.id.fragment_doctor_recycleView);
        doctorAdapter=new DoctorAdapter(getContext());
        doctorAdapter.setList(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(doctorAdapter);

        doctorAdapter.setRecyclerClick(new RecyclerClick() {
            @Override
            public void onItemClick(int position) {
                Log.e("ssssssss", "onItemClick: ");
                //TODO 传UserId
                //启动会话列表
                HelperFragment helperFragment = (HelperFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.helper);
                helperFragment.getContent(EaseConstant.EXTRA_USER_ID,
                        "ceshi2",
                        EaseConstant.EXTRA_CHAT_TYPE,
                        EaseConstant.CHATTYPE_SINGLE);
            }
        });
    }
}
