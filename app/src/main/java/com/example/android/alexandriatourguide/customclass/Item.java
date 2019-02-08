package com.example.android.alexandriatourguide.customclass;

/**
 * @{link Item} represents an item to show to the user about Alex City
 * it contains info about each item to display
 */
public class Item {

    /**
     * String Item Title to represent the title for each item
     */
    private int mItemTitle;
    /**
     * String Item Info to represent the extra info  item
     */
    private int mItemInfo;
    /**
     * int Item Image res ID  to represent the image id for each item
     */
    private int mImageResourceID;

    /**
     * public constructor to create an Item object
     *
     * @param itemTitle title for each item
     * @param itemInfo  the extra info for each item
     * @param imageResourceID the image for each item
     */
    public Item(int itemTitle, int itemInfo, int imageResourceID) {
        mItemTitle = itemTitle;
        mItemInfo = itemInfo;
        mImageResourceID = imageResourceID;
    }

    public int getmItemTitle(){
        return mItemTitle;
    }
    public int getmItemInfo(){
        return mItemInfo;
    }
    public int getmImageResourceID(){
        return mImageResourceID;
    }
}
