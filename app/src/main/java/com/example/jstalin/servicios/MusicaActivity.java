package com.example.jstalin.servicios;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicaActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity__musica);



        Button arrancar = (Button) findViewById(R.id.boton_arrancar);

        arrancar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                startService(new Intent(MusicaActivity.this,

                        ServicioMusica.class));

            }

        });

        Button detener = (Button) findViewById(R.id.boton_detener);

        detener.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                stopService(new Intent(MusicaActivity.this,

                        ServicioMusica.class));

            }

        });

    }
}
