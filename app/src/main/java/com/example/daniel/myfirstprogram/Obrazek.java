package com.example.daniel.myfirstprogram;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by daniel on 03.04.2017.
 */

public class Obrazek extends Activity {
    public void zmien(View v){
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.android2);}
    public void poprzedni(View v){
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setImageResource(R.drawable.android);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);

        Button button1 = (Button) findViewById(R.id.button1);

        final Context context;
        context = getApplicationContext();
        final Intent intent = new Intent(context, MainActivityApp.class);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
