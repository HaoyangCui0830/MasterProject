package com.example.docktest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuburbFragment extends Fragment {

    private String[] data = { "Suburb1","Suburb1","Suburb1","Suburb1","Suburb1","Suburb1",
            "Suburb1","Suburb1","Suburb1","Suburb1","Suburb1","Suburb1","Suburb1",
            "Suburb1","Suburb1","Suburb1","Suburb1"};


    public static Fragment newInstance() {
        SuburbFragment fragment = new SuburbFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.suburb_fragment, container, false);
        ListView listView = (ListView)view.findViewById(R.id.suburb_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);
        return view;
    }
}
