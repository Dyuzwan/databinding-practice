package com.loket.yzw.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandlers {
    Context context;

    public ClickHandlers(Context context) {
        this.context = context;
    }

    public void onImageClick(View view) {
        Toast.makeText(context, "Image clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onClickWithParam(View view, Place place) {
        Toast.makeText(context, "Item clicked! Name: " + place.name, Toast.LENGTH_SHORT).show();
    }

    public boolean onButtonLongPressed(View view) {
        Toast.makeText(context, "Button long pressed!", Toast.LENGTH_SHORT).show();
        return false;
    }
}
