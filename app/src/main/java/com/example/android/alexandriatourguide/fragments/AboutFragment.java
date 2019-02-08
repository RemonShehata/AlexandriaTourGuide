package com.example.android.alexandriatourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.alexandriatourguide.R;
import com.example.android.alexandriatourguide.customclass.Item;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //create a list of items
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.city_name,R.string.about_city,R.drawable.alex));


        TextView textView = new TextView(getActivity());
        textView.setText(R.string.city_name);
        return textView;
    }

}
