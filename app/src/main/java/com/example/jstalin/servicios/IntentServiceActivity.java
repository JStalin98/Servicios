package com.example.jstalin.servicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IntentServiceActivity extends AppCompatActivity {

    private EditText entrada;
    public static TextView salida;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intent_service);

        entrada = (EditText) findViewById(R.id.entrada);

        salida = (TextView) findViewById(R.id.salida);

    }


    public void calcularOperacion(View view) {

        double n = Double.parseDouble(entrada.getText().toString());

        salida.append(n + "^2 = ");

        Intent i = new Intent(this, IntentServiceActivity.class);

        i.putExtra("numero", n);

        startService(i);

    }

}
