/**
 *
 * @author Dimple S Mahtani
 * created on 13/03/2022
 */

package com.example.apod_gs.classes;

public class ExampleItem {
    private String mImageUrl;
    private String mTitle;
    private String mDate;


    public ExampleItem(String mImageUrl, String mTitle, String mDate) {
        this.mImageUrl = mImageUrl;
        this.mTitle = mTitle;
        this.mDate = mDate;

    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

}