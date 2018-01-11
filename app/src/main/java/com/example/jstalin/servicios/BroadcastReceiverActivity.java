package com.example.jstalin.servicios;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BroadcastReceiverActivity extends AppCompatActivity {

    private OutgoinCallBroadcastReceiver outgoinCallBroadcastReceiver = new OutgoinCallBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);



    }

    protected void onResume(){
        super.onResume();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_NEW_OUTGOING_CALL);
        registerReceiver(outgoinCallBroadcastReceiver, filter);

    }

    protected void onPause(){
        super.onPause();
        unregisterReceiver(outgoinCallBroadcastReceiver);
    }


}
