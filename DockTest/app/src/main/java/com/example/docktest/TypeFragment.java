package com.example.docktest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TypeFragment extends Fragment {

    private String[] data = { "Type1","Type1","Type1","Type1","Type1","Type1","Type1","Type1","Type1",
            "Type1","Type1","Type1","Type1","Type1","Type1","Type1","Type1","Type1"};


    public static Fragment newInstance() {
        TypeFragment fragment = new TypeFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.type_fragment, container, false);
        ListView listView = (ListView)view.findViewById(R.id.type_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);
        return view;
    }
}