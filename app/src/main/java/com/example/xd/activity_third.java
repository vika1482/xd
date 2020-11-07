package com.example.xd;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import android.widget.ImageView;

public class activity_third extends AppCompatActivity {
    private static final int REQUEST_CODE = 1313;
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

            ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
            imageView22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, REQUEST_CODE);
                }
            } );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (REQUEST_CODE == requestCode)
        {
            Bitmap bit = (Bitmap) data.getExtras().get("data");
        }
    }
}