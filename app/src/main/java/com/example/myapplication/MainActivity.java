package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

TextView vs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vs = (TextView) findViewById(R.id.textViewfecha2);
        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        int dia = today.monthDay;
        int mes = today.month;
        int año = today.year;
        vs.setText("-" + dia + "-"+  mes  + "-" + año );



    }



    @Override
    public void onClick(View v) {
        Intent intento = new Intent(this, MenuActivity.class);
        startActivity(intento);
    }
    public void Salir(View v) {
        Intent inten = new Intent(Intent.ACTION_MAIN);
        inten.addCategory(Intent.CATEGORY_HOME);
        inten.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(inten);
    }


}
