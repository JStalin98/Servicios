package com.example.jstalin.servicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ServiciosHiloSecundario01Activity extends AppCompatActivity {
   Intent servicio;
   boolean serviceRun = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_hilo_secundario01);
        servicio = new Intent(this,MiServicioAsynTask.class);


    }

    public void accionIniciar(View v) {
        boolean isServiceRun = MiServicioAsynTask.isRunService;
        Log.d("ERROR", isServiceRun+"---------------");
        if(isServiceRun){
            Toast.makeText(getBaseContext(), "No se puede inicar servicio, servicio ya iniciado", Toast.LENGTH_SHORT);
        }else{
            startService(servicio);
            MiServicioAsynTask.isRunService = true;

        }


    }

    public void accionParar(View v) {
        boolean isServiceRun = MiServicioAsynTask.isRunService;
        Log.d("ERROR", isServiceRun+"---------------");
        if(isServiceRun){
           stopService(servicio);
            MiServicioAsynTask.isRunService = false;
        }else{
            Toast.makeText(getBaseContext(), "No se puede parar servicio, no hay servicio iniciado", Toast.LENGTH_SHORT);
        }
    }
}
