package com.example.docktest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CityFragment extends Fragment {

    private String[] data = { "City1","City1","City1","City1","City1","City1","City1","City1","City1","City1",
            "City1","City1","City1","City1","City1","City1","City1","City1","City1"};


    public static Fragment newInstance() {
        CityFragment fragment = new CityFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.city_fragment, container, false);
        ListView listView = (ListView)view.findViewById(R.id.city_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);
        return view;
    }
}