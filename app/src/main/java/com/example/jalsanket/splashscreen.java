package com.example.jalsanket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread thread = new Thread(){

           public void run(){
               try {
                   sleep(1000);

               }
               catch (Exception e){
                   e.printStackTrace();
               }
               finally {
                   Intent intent = new Intent(splashscreen.this, MainActivity.class);
                   startActivity(intent);
               }
           }
        };thread.start();
    }
}