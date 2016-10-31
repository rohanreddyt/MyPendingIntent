package com.rohan.user.mypendingintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        v1 = (TextView)findViewById(R.id.text);
        Intent intent = getIntent();
        String data= intent.getStringExtra(MainActivity.DATA1);
        System.out.println("Heelo" + data);

        v1.setText(data);
    }


}
