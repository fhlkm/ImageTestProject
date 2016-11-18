package com.example.hanlufeng.imagetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.nextView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewImageActivity();
            }
        });
    }

    public void startNewImageActivity(){
        Intent mIntent = new Intent();
        mIntent.setClass(MainActivity.this,ImageActivity.class);
        startActivity(mIntent);
    }
}
