package com.example.jstalin.servicios;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by JStalin on 07/12/2017.
 */

public class MiServicio extends Service {
    private static final String TAG = "MiServicio";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {



        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "Servicio Iniciado");
                // El servicio se finaliza a sí mismo cuando finaliza su trabajo.
                try {
                    Log.d(TAG, "Servicio a dormir");
                    Thread.sleep((int) (Math.random() * 15000));
                    Log.d(TAG, "Servicio despertado");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d(TAG, "Servicio Destruido");
    }


}

