package com.example.android.alexandriatourguide.customclass;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;

/**
 * @{link Item} represents an item to show to the user about Alex City
 * it contains info about each item to display
 */
public class Item {

    /**
     * int Item Title for the string resource IDto represent the title for each item
     */
    private int mItemTitle;

    /**
     * int Item Info for the string resource ID to represent the extra info  item
     */
    private int mItemInfo;

    /**
     * int food Info for the string resource ID to represent the extra info  item
     */
    private int mEatItHereInfo;

    /**
     * int Item Image res ID  to represent the image id for each item
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * int Item Image res ID  to represent the image for eat it here
     */
    private int mImageResourceIDEatItHere = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents that no image was provided for this item
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * public constructor to create an Item object
     *
     * @param itemTitle       title for each item
     * @param itemInfo        the extra info for each item
     * @param imageResourceID the image for each item
     */
    public Item(int itemTitle, int itemInfo, int imageResourceID) {
        mItemTitle = itemTitle;
        mItemInfo = itemInfo;
        mImageResourceID = imageResourceID;
    }

    /**
     * public constructor to create an Item object
     *
     * @param itemTitle title for each item
     * @param itemInfo  the extra info for each item
     */
    public Item(int itemTitle, int itemInfo) {
        mItemTitle = itemTitle;
        mItemInfo = itemInfo;
    }

    /**
     * public constructor to create an Item object
     *
     * @param itemTitle                title for each item
     * @param itemInfo                 the extra info for each item
     * @param imageResourceID          the image for each item
     * @param imageResourceIDEatItHere the image for eat it here at the food fragment
     */
    public Item(int itemTitle, int itemInfo, int imageResourceID,
                int imageResourceIDEatItHere, int eatItHereInfo) {
        mItemTitle = itemTitle;
        mItemInfo = itemInfo;
        mImageResourceID = imageResourceID;
        mImageResourceIDEatItHere = imageResourceIDEatItHere;
        mEatItHereInfo = eatItHereInfo;
    }

    public int getItemTitle() {
        return mItemTitle;
    }

    public int getItemInfo() {
        return mItemInfo;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getmImageResourceIDEatItHere() {
        return mImageResourceIDEatItHere;
    }

    public int getmEatItHereInfo() {
        return mEatItHereInfo;

    }

    /**
     * @return a boolean value whether there is an image or not for this item
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * @return a boolean value whether there is an image or not for  eat it here
     */
    public boolean hasEatItHere() {
        return mImageResourceIDEatItHere != NO_IMAGE_PROVIDED;
    }


}
