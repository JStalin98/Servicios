package com.example.jstalin.servicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void accionBoton1(View v){

        Intent i = new Intent(this, PruebaServicio.class);
        startActivity(i);

    }

    public void accionBoton2(View v){

        Intent i = new Intent(this, ServicioConHilosSecundarios.class);
        startActivity(i);

    }


}
