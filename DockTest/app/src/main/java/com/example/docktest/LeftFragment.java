package com.example.docktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class LeftFragment extends Fragment {
    private Button mSubmitButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.left_fragment, container, false);
        mSubmitButton = (Button) view.findViewById(R.id.button);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                                 // TODO Auto-generated method stub
              }
         });
        return view;
    }

    }
