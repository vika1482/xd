package com.example.xd;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import android.widget.ImageView;

public class activity_second extends AppCompatActivity {
private static final int REQUEST_CODE = 1313;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent( activity_second.this,MainActivity.class);
                startActivity(intent_1);
            }
        } );
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent( activity_second.this,activity_third.class);
                startActivity(intent_1);
            }
        } );

        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,REQUEST_CODE);
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