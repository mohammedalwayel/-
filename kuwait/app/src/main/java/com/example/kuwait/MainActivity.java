package com.example.kuwait;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent x = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(x);


           }
       });












    }
}