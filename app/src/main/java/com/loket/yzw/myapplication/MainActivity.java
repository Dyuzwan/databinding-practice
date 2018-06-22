package com.loket.yzw.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loket.yzw.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Place place;
    private ClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        place = new Place();
        place.setName("Sierra");
        place.setRating("5.0");

        handlers = new ClickHandlers(this);

        mainBinding.setPlace(place);
        mainBinding.setHandlers(handlers);
    }
}
