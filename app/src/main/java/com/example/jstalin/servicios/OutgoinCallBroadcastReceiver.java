package com.example.jstalin.servicios;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by JStalin on 11/01/2018.
 */

public class OutgoinCallBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        Toast.makeText(context, phoneNumber, Toast.LENGTH_SHORT).show();
    }
}
