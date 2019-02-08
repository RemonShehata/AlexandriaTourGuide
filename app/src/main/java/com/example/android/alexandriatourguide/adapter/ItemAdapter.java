package com.example.android.alexandriatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.alexandriatourguide.R;
import com.example.android.alexandriatourguide.customclass.Item;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items is the list of {@link Item}s to be displayed.
     */
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        // Check if an existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        // Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        TextView titleTextView =listItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentItem.getmItemTitle());

        return super.getView(position, convertView, parent);
    }
}
