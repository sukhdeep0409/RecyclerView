package com.example.recyclercards;

public class ExampleItem {

    private int mImageResource;
    private String mText;

    public ExampleItem(int ImageResource, String text) {
        mImageResource = ImageResource;
        mText = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
