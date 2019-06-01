package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends  AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }


    @Override
    public void onClick(View v) {

        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }
    public void fichatecnica(View v){
        Intent intento = new Intent(this, FichaTecnica.class);
        startActivity(intento);
    }
    public void pasatiempos(View v)
    {
        Intent intento = new Intent(this, PasaTiempos.class);
        startActivity(intento);

    }
    public void KARDEX(View v)
    {
        Intent intento = new Intent(this, Kardex.class);
        startActivity(intento);

    }
    public void fotos(View v){
        Intent intento = new Intent(this, Fotos.class);
        startActivity(intento);
    }


}
