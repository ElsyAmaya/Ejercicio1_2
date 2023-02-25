package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityPrint extends AppCompatActivity {
    private TextView txtnombre, txtapellido, txtedad, txtcorreo;
    ImageButton btnatras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        txtnombre= (TextView) findViewById(R.id.txt_nombre);
        txtapellido = (TextView) findViewById(R.id.txt_apellido);
        txtedad = (TextView) findViewById(R.id.txt_edad);
        txtcorreo = (TextView) findViewById(R.id.txt_correo);
        btnatras = (ImageButton) findViewById(R.id.btnatras);


        String Dato1 = getIntent().getStringExtra("DatoP1");
        txtnombre.setText(Dato1);
        String Dato2 = getIntent().getStringExtra("DatoP2");
        txtapellido.setText(Dato2);
        String Dato3 = getIntent().getStringExtra("DatoP3");
        txtedad.setText(Dato3);
        String Dato4 = getIntent().getStringExtra("DatoP4");
        txtcorreo.setText(Dato4);


        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}