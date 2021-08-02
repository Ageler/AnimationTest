package com.example.animationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isBatmanVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setBatmanInvisible(View view) {
        if(isBatmanVisible) {
            ImageView batmanImageView = findViewById(R.id.BatmanimageView);
            batmanImageView.animate().alpha(0).setDuration(3000);
            ImageView jokerImageView = findViewById(R.id.JokerimageView);
            jokerImageView.animate().alpha(1).setDuration(3000);
        } else {
            ImageView batmanImageView = findViewById(R.id.BatmanimageView);
            batmanImageView.animate().alpha(1).setDuration(3000);
            ImageView jokerImageView = findViewById(R.id.JokerimageView);
            jokerImageView.animate().alpha(0).setDuration(3000);
        }
    }
}