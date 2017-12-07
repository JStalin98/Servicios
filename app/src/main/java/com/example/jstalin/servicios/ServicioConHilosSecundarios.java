package com.example.jstalin.servicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ServicioConHilosSecundarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio_con_hilos_secundarios);

        Intent servicio = new Intent(this, MiServicio2.class);

        startService(servicio);

    }
}
