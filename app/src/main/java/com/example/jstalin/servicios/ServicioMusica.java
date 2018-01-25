package com.example.jstalin.servicios;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
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

    Notification myNotication;
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

        Intent intent = new Intent(this, MainActivity.class);

        PendingIntent intencionPendiente =PendingIntent.getActivity(this, 1, intent, 0);

        Notification.Builder builder=new Notification.Builder(this);


        builder.setAutoCancel(false);
        builder.setTicker("TICKER");
        builder.setContentTitle("Reproductor");
        builder.setContentText("ServicioMusica App");
        builder.setSmallIcon(R.drawable.icono_reporductor);
        builder.setContentIntent(intencionPendiente);
        builder.setOngoing(true);
        builder.setNumber(100);
        //builder.build();
        myNotication = builder.getNotification();
        nm.notify(ID_NOTIFICACION_CREAR, myNotication);

        reproductor.start();

        return START_STICKY;

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
