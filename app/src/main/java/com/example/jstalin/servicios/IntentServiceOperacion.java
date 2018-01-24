package com.example.jstalin.servicios;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JStalin on 16/12/2017.
 */

public class IntentServiceOperacion extends IntentService {

    public IntentServiceOperacion() {

        super("IntentServiceOperacion");

    }



    @Override
    protected void onHandleIntent(Intent intent) {

        double n = intent.getExtras().getDouble("numero");

        SystemClock.sleep(5000);

       // IntentServiceActivity.salida.append(n*n + "\n");

        Log.d("ERROR", "ENTRO INTENT SERVICE OPERATION ---------------");

        Intent i = new Intent();

        i.setAction(IntentServiceActivity.ReceptorOperacion.ACTION_RESP);

        i.addCategory(Intent.CATEGORY_DEFAULT);

        i.putExtra("resultado", n*n);

        sendBroadcast(i);


    }

}