package com.mrlonewolfer.example38;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    TextView txtName;
    Context context;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        txtName=view.findViewById(R.id.txtName);
        txtName.setText("!!! We Welcome You !!!");

        Drawable left=context.getResources().getDrawable(R.mipmap.ic_launcher);
        int h = left.getIntrinsicHeight();
        int w = left.getIntrinsicWidth();
        left.setBounds(0,0,w,h);

        Drawable top=context.getResources().getDrawable(R.mipmap.ic_launcher_round);
        int toph = top.getIntrinsicHeight();
        int topw = top.getIntrinsicWidth();
        top.setBounds(0,0,topw,toph);

        Drawable right=context.getResources().getDrawable(R.mipmap.ic_launcher);
        int righth = right.getIntrinsicHeight();
        int rightw = right.getIntrinsicWidth();
        right.setBounds(0,0,rightw,righth);

        Drawable bottom=context.getResources().getDrawable(R.mipmap.ic_launcher_round);
        int bottomh = bottom.getIntrinsicHeight();
        int bottomw = bottom.getIntrinsicWidth();
        bottom.setBounds(0,0,bottomw,bottomh);

        txtName.setCompoundDrawables(left,top,right,bottom);

        return  view;
    }

}
