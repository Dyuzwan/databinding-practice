package com.loket.yzw.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Place extends BaseObservable {
    String name;
    String rating;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
        notifyPropertyChanged(BR.rating);
    }

}
