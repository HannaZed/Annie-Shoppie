package com.king.mystorageapp;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mPhoneNumber,mImageUrl, key;

    public Upload(String mName, String mImageUrl) {
        if (mName.trim().equals("")){
            mName = "0700000000";
        }
        this.mPhoneNumber = mName;
        this.mImageUrl = mImageUrl;
    }

    public Upload() {
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    @Exclude
    public String getKey() {
        return key;
    }

    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
