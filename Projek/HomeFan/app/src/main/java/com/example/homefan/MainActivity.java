package com.example.homefan;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.*;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ImageView imageView;
    ObjectAnimator rotateAnimator;
    Switch switchButton;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    GradientDrawable gd = new GradientDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchButton = findViewById(R.id.switchButton);
        imageView = (ImageView) findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        rotateAnimator=ObjectAnimator.ofFloat(imageView, "rotation", 0,360);
        rotateAnimator.setDuration(500);
        rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimator.setInterpolator(new LinearInterpolator());
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    rotateAnimator.setDuration(1000);
                    rotateAnimator.start();
                    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                rotateAnimator.setDuration(600);
                                rotateAnimator.start();
                            }else{
                                rotateAnimator.end();
                            }


                        }
                    });
                    checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                rotateAnimator.setDuration(300);
                                rotateAnimator.start();
                            }else{
                                rotateAnimator.end();
                            }


                        }
                    });
                    checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            if(isChecked){
                                rotateAnimator.setDuration(100);
                                rotateAnimator.start();
                            }else{
                                rotateAnimator.end();
                            }


                        }
                    });
                }else {
                    rotateAnimator.end();
                }
            }
        });


        gd.setShape(GradientDrawable.RECTANGLE);
        gd.setGradientType(GradientDrawable.RADIAL_GRADIENT);
        gd.setGradientRadius(330);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    gd.setColors(new int[]{ Color.BLUE , Color.TRANSPARENT });
                    imageView.setBackground(gd);
                }
                else{
                    imageView.setBackgroundColor(Color.TRANSPARENT);
                }
            }

        });

    }
}