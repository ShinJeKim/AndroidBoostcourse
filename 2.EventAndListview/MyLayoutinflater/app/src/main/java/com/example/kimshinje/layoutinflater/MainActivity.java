package com.example.kimshinje.layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });

        //레이아웃 인플레이션으로 인해 아래 코드를 button 객체를 만들기 이전에 두어야만 에러가 나지 않음.
        //setContentView(R.layout.activity_main);
    }
}
