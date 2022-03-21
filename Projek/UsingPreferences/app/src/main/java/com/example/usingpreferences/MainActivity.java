package com.example.usingpreferences;

import android.content.ServiceConnection;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickLoad(View view) {
        Intent i = new Intent(MainActivity.this, AppPreferenceActivity.class);
        startActivity(i);
    }
}