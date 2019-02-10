package com.example.android.alexandriatourguide.fragments;

/*
*resources from booking.com
*
 */

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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //create a list of items
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.four_seasons, R.string.four_seasons_detials,
                R.drawable.four_seasons_hotel_alexandria));
        items.add(new Item(R.string.tolip, R.string.tolip_details,R.drawable.tolip_hotel));
        items.add(new Item(R.string.hilton, R.string.hilton_details,R.drawable.hilton_alexandria_corniche));
        items.add(new Item(R.string.helnan, R.string.helnan_detials,R.drawable.helnan_palestine_hotel));
        items.add(new Item(R.string.sheraton, R.string.sheraton_details,R.drawable.sheraton_montazah_hotel));
        items.add(new Item(R.string.paradise, R.string.paradise_detials,R.drawable.paradise_inn_beach_resort));

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


