package com.example.xd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent( activity_third.this,MainActivity.class);
                startActivity(intent_2);
            }
        } );

        ImageView imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_3 = new Intent( activity_third.this,activity_second.class);
                startActivity(intent_3);
            }
        } );
    }
}