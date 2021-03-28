package com.example.tourguide;

import android.icu.util.ULocale;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Flag extends Fragment {

    private static Location location;
    public Flag() {
        // Required empty public constructor
    }


    public static Flag newInstance(Location obj) {
        Flag fragment = new Flag();
        location = obj;
        Bundle args = new Bundle();
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
        View view = inflater.inflate(R.layout.list_item, container, false);
        TextView nameView = view.findViewById(R.id.locationName);
        TextView descView = view.findViewById(R.id.locationDescription);
        ImageView imageView = view.findViewById(R.id.locationImage);
        nameView.setText(location.getName());
        descView.setText(location.getDescription());
        int res = getResources().getIdentifier(location.getImage(), "drawable", this.getActivity().getPackageName());
        imageView.setImageResource(res);

        return view;
    }
}