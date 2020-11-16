package com.example.quakereportupdate;

public class Word {
    private double mMagnitude;
    private String mPlace;
    private Long mTime;
    private String mUrl;

    public Word(double magnitude, String place, Long time, String url){
        mMagnitude = magnitude;
        mPlace = place;
        mTime = time;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }
    public String getPlace(){
        return mPlace;
    }
    public Long getTime(){
        return mTime;
    }
    public String getUrl(){
        return mUrl;
    }
}

