package com.example.jstalin.servicios;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by JStalin on 24/01/2018.
 */

public class ServicioMusica extends Service {

    MediaPlayer reproductor;

    private NotificationManager nm;

    private static final int ID_NOTIFICACION_CREAR = 1;

    @Override
    public void onCreate() {

        Toast.makeText(this,"Servicio creado",
                Toast.LENGTH_SHORT).show();

        reproductor = MediaPlayer.create(this, R.raw.dukirockstar);

        nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

    }



    @Override
    public int onStartCommand(Intent intenc, int flags, int idArranque) {

        Toast.makeText(this,"Servicio arrancado "+ idArranque,
                Toast.LENGTH_SHORT).show();

        reproductor.start();

        return START_STICKY;

        Notification notificacion = new Notification(R.drawable.icono_reporductor, "Creando Servicio de Música",System.currentTimeMillis());

    }



    @Override
    public void onDestroy() {

        Toast.makeText(this,"Servicio detenido",
                Toast.LENGTH_SHORT).show();

        reproductor.stop();

    }



    @Override
    public IBinder onBind(Intent intencion) {

        return null;

    }
}
