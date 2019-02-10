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
public class SightseeingFragment extends Fragment {


    public SightseeingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create a list of items
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.lighthouse, R.string.lighthouse_details, R.drawable.light_house));
        items.add(new Item(R.string.bibliotheca, R.string.bibliotheca_details,R.drawable.bibliotheca));
        items.add(new Item(R.string.citadel, R.string.citadel_details,R.drawable.citadel_of_qaitbay));
        items.add(new Item(R.string.montaza, R.string.montaza_details,R.drawable.montaza_palace));
        items.add(new Item(R.string.pillar, R.string.pillar_detials,R.drawable.pompey_pillar));
        items.add(new Item(R.string.royal_jewlry, R.string.roayl_jewlry_details,
                R.drawable.roayal_jewelry_museum));

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


