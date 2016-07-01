package com.example.android.miwok;

/**
 * Created by arora on 26/6/16.
 */

public class word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int   mImageReseourceId;

    public word(String defaultTranslation, String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public word(String defaultTranslation, String miwokTranslation, int imageResouceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageReseourceId = imageResouceId;

    }

    public String getDefaultTranslation() {

        return  mDefaultTranslation;
    }


    public String getMiwokTranslation(){

        return  mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageReseourceId;
    }

}
