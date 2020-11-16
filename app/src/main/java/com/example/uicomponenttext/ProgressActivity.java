package com.example.uicomponenttext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProgressActivity extends AppCompatActivity {
    private ProgressBar pbHor;
    private SeekBar seekBar;
    private TextView tv_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        initView();
    }

    private void initView() {
        pbHor = findViewById(R.id.pb_horizontal);
        seekBar = findViewById(R.id.seekBar);
        tv_progress = findViewById(R.id.tv_progress);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // 将进度条和手动拖动保持一致
                pbHor.setProgress(progress);
                tv_progress.setText("当前进度为"+progress+"%");
            }

            /**
             * 用户触碰到seekBar被触发，可不做任何处理
             * @param seekBar
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            /**
             *  用户停止了seekBar时触发
             * @param seekBar
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
               // 希望进度条进度达到100%时,进度条消失
                if(pbHor.getProgress() >=pbHor.getMax()){
                    pbHor.setVisibility(View.INVISIBLE);
                }else {
                    pbHor.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}