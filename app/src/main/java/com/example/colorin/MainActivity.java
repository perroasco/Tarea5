package com.example.colorin;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;

    private TextView hex;

    private SeekBar seekBar;
    private SeekBar seekBar2;
    private SeekBar seekBar3;

    private View color;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewSeek1);
        textView2 = findViewById(R.id.textViewSeek2);
        textView3 = findViewById(R.id.textViewSeek3);

        hex = findViewById(R.id.hex);

        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3 = findViewById(R.id.seekBar3);

        color = findViewById(R.id.view2);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean b) {
                textView.setText("R= " + progress);
                String colorin = "#" + ColorUtils.decimalToHex(seekBar.getProgress()) +
                        ColorUtils.decimalToHex(seekBar2.getProgress())+
                        ColorUtils.decimalToHex(seekBar3.getProgress());
                color.setBackgroundColor(Color.parseColor(colorin));
                hex.setText(colorin);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar22, int progress, boolean b) {
                textView2.setText("G= " + progress);
                String colorin = "#" + ColorUtils.decimalToHex(seekBar2.getProgress()) +
                        ColorUtils.decimalToHex(seekBar2.getProgress())+
                        ColorUtils.decimalToHex(seekBar3.getProgress());
                color.setBackgroundColor(Color.parseColor(colorin));
                hex.setText(colorin);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar33, int progress, boolean b) {
                textView3.setText("B= " + progress);
                String colorin = "#" + ColorUtils.decimalToHex(seekBar3.getProgress()) +
                        ColorUtils.decimalToHex(seekBar2.getProgress())+
                        ColorUtils.decimalToHex(seekBar3.getProgress());
                color.setBackgroundColor(Color.parseColor(colorin));
                hex.setText(colorin);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
