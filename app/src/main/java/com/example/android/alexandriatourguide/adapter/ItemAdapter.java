package com.example.android.alexandriatourguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.alexandriatourguide.R;
import com.example.android.alexandriatourguide.customclass.Item;

import java.util.ArrayList;

/**
 * {@link ItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Item} objects.
 */
public class ItemAdapter extends ArrayAdapter<Item> {

    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items   is the list of {@link Item}s to be displayed.
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
        //find the Textview in the listItemView with ID title_text_view
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        //get the title of the current item object and set it to the titleTextView
        titleTextView.setText(currentItem.getItemTitle());

        //find the TextView in the listItemView with ID info_text_view
        TextView infoTextView = listItemView.findViewById(R.id.item_info_text_view);
        //get the info of the current item object and set it to the infoTextView
        infoTextView.setText(currentItem.getItemInfo());

        //find the ImageView in the listItemView with ID image
        ImageView imageView = listItemView.findViewById(R.id.image);
        //check if there is an image provided for the word or not
        if (currentItem.hasImage()) {
            //if there is an image provided then display it based on the resource ID
            imageView.setImageResource(currentItem.getImageResourceID());
            //make sure that the image view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //if no image was provided, hide the image view
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
