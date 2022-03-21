package com.example.klasemensepakbola;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView vKlub;
    private ArrayList<Klub> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vKlub = findViewById(R.id.rview);

        list.addAll(dataKlub.getListData());
        show();

    }
    private void show(){
        vKlub.setLayoutManager(new ConstraintLayout(this));
        listAdapterKlub listAdapter= new listAdapterKlub(list);
        vKlub.setAdapter(listAdapter);
    }
}