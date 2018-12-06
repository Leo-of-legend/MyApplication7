package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACTIVITY_LC","onCreate호출됨");
        Toast.makeText(getApplicationContext(),"onCreate호출됨", Toast.LENGTH_SHORT).show();

        Button button = (Button) findViewById(R.id.newActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LeoActivity.class);
                startActivity(intent);
            }
        });




    }
}