package com.example.docktest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TimeFragment extends Fragment {

    private String[] data = { "00:00", "01:00", "02:00", "03;00","04:00", "05:00", "06:00", "07;00",
            "08:00", "09:00", "10:00", "11;00","12:00", "13:00", "14:00", "15;00"};


    public static Fragment newInstance() {
        TimeFragment fragment = new TimeFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.time_fragment, container, false);
        ListView listView = (ListView)view.findViewById(R.id.time_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);
        return view;
    }
}
