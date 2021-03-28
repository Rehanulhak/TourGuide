package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Location> {
    public ListAdapter(@NonNull Context context, @NonNull ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.main_list_item,
                    parent, false);
        }

        Location currentObj = getItem(position);

        TextView name = (TextView)listItemView.findViewById(R.id.lName);
        TextView desc = (TextView)listItemView.findViewById(R.id.lDesc);

        name.setText(currentObj.getName());
        desc.setText(currentObj.getDescription());

        return listItemView;
    }
}
