package com.example.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailScreen extends AppCompatActivity {
    TextView countryText;
    TextView landmarkText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        countryText=findViewById(R.id.countryNameText);
        landmarkText=findViewById(R.id.landmarkNameText);
        imageView=findViewById(R.id.imageView);
        Intent intent=getIntent();
        String landmarkName= intent.getStringExtra("landmarkName");
        String countryName=intent.getStringExtra("countryName");
        Singleton singleton=Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
        landmarkText.setText(landmarkName);
        countryText.setText(countryName);
    }
}