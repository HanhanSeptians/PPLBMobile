package com.example.moneytoringapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class detailPengeluaran extends AppCompatActivity implements View.OnClickListener{
    ImageButton callFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pengeluaran);
        callFragment = findViewById(R.id.plusDetailPengeluaran);
        callFragment.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
       if (v.getId()==R.id.plusDetailPengeluaran){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new pengeluaranFragment()).commit();
            callFragment.setVisibility(View.GONE);
        }
    }

}