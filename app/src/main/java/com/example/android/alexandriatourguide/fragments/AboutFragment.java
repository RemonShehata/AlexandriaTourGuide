package com.example.android.alexandriatourguide.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.alexandriatourguide.R;
import com.example.android.alexandriatourguide.adapter.ItemAdapter;
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

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create a list of items
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.city_name, R.string.about_city));
        items.add(new Item(R.string.area, R.string.area_info));
        items.add(new Item(R.string.weather, R.string.weather_info));
        items.add(new Item(R.string.postal_code, R.string.postal_code_info));
        items.add(new Item(R.string.time_zone, R.string.time_zone_info));
        items.add(new Item(R.string.population, R.string.population_info));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s.
        // The adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list_view);
        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
