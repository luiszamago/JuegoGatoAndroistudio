package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PasaTiempos extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasa_tiempos);
    }

    @Override
    public void onClick(View v) {
        Intent intento = new Intent(this, MenuActivity.class);
        startActivity(intento);
    }
}
