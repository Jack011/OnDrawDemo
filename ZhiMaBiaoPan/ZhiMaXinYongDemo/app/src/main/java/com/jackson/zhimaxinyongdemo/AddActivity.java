package com.jackson.zhimaxinyongdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/24.
 */
public class AddActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void init() {

        Toast.makeText(AddActivity.this, "ssss", Toast.LENGTH_LONG).show();
    }


    public void initData() {
        for (int i = 0; i < 10; i++) {

        }
        Toast.makeText(AddActivity.this, "ssss", Toast.LENGTH_LONG).show();
    }


    public void initView() {
        Toast.makeText(this, "ssssss", Toast.LENGTH_SHORT).show();
    }

}
