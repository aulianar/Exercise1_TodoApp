package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView txTask,txJenis,txWaktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txTask=findViewById(R.id.textViewTaks);
        txJenis=findViewById(R.id.textViewJenis);
        txWaktu=findViewById(R.id.textViewTime);
        Bundle bundle=getIntent().getExtras();
        String tks=bundle.getString("Task");
        String jns=bundle.getString("Jenis");
        String wkt=bundle.getString("Waktu");
        txTask.setText(tks);
        txJenis.setText(jns);
        txWaktu.setText(wkt);
    }
}