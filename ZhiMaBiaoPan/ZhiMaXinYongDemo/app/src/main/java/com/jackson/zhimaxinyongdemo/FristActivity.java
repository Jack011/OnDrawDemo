package com.jackson.zhimaxinyongdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/25.
 */
public class FristActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView text1,text2,text3,text4;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        text1= (TextView) findViewById(R.id.text1);
        text2= (TextView) findViewById(R.id.text2);
        text3= (TextView) findViewById(R.id.text3);
        text4= (TextView) findViewById(R.id.text4);
        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.text1 :
                Toast.makeText(this,"text1",Toast.LENGTH_LONG).show();
                break;
            case R.id.text2 :
                Toast.makeText(this,"text2",Toast.LENGTH_LONG).show();
                break;
            case R.id.text3 :
                Toast.makeText(this,"text3",Toast.LENGTH_LONG).show();
                break;
            case R.id.text4 :
                Toast.makeText(this,"text4",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
