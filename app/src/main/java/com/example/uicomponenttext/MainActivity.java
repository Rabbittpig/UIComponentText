package com.example.uicomponenttext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnSimple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnSimple = findViewById(R.id.btn_simple_uicomponent);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //UI组件Activity
//                startActivity(new Intent(MainActivity.this,SimpleComponentActivity.class));
                //ProgressBar进度条Activity
                startActivity(new Intent(MainActivity.this,ProgressActivity.class));
            }
        });
    }
}
