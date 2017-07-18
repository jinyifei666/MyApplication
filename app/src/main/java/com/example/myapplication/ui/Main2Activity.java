package com.example.myapplication.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String values=bundle.getString("key");
        try {
            Thread.sleep(3000);
            Log.w("value",values);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Toast.makeText(Main2Activity.this,values,Toast.LENGTH_LONG).show();
    }
}
