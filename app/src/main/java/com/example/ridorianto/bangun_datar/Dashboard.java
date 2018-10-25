package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(dashboard.this, Segitiga.class);
        startActivity(sgt);
    }

    public void btn_jjg(View view) {
        Intent jjg = new Intent(dashboard.this, jajargenjang.class);
        startActivity(jjg);

    public void btn_psg(View view) {
        Intent psg = new Intent(dashboard.this, persegipanjang.class);
        startActivity(psg);
        }
    }
}
