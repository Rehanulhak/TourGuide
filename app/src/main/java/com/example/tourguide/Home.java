package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {
private static ArrayList<Location> object;


    public Home() {
        // Required empty public constructor
    }

    public static Home newInstance(ArrayList<Location> obj) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        object = obj;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ListView list = rootView.findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(getActivity(), object);
        list.setAdapter(adapter);

        return rootView;
    }
}