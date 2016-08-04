package com.jackson.zhimaxinyongdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private MyCustomView custom_view;
    private Button bt;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.btn);
        custom_view = (MyCustomView) findViewById(R.id.my_custom_view);
        edit= (EditText) findViewById(R.id.input);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a=Integer.valueOf(edit.getText().toString());
                if (a>100){
                    custom_view.setSocre(100);
                }else {
                    custom_view.setSocre(a);
                }
            }
        });
    }
}
