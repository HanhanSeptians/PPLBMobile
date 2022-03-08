package com.example.moneytoringapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class detailPendapatan extends AppCompatActivity implements View.OnClickListener {
    ImageButton callFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pendapatan);
        callFragment = findViewById(R.id.plusDetailPendapatan);
        callFragment.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if (v.getId()==R.id.plusDetailPendapatan){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new pendapatanFragment()).commit();
            callFragment.setVisibility(View.GONE);
        }
    }

}