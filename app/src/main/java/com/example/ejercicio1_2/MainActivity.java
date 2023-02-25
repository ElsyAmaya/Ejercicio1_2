package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    EditText nombres, apellidos, edad, correo;
    ImageButton btnenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombres = (EditText) findViewById(R.id.txtnombre);
        apellidos = (EditText) findViewById(R.id.txtapellido);
        edad =  (EditText) findViewById(R.id.txtedad);
        correo =  (EditText) findViewById(R.id.txtcorreo);
        btnenviar =  (ImageButton) findViewById(R.id.btnenviar);



    }
    public void Enviar(View view){

        Intent i = new Intent(this, ActivityPrint.class);
        i.putExtra("DatoP1",nombres.getText().toString());
        i.putExtra("DatoP2",apellidos.getText().toString());
        i.putExtra("DatoP3",edad.getText().toString());
        i.putExtra("DatoP4",correo.getText().toString());
        startActivity(i);
        ClearScreen();
    }
    private void ClearScreen(){
        nombres.setText("");
        apellidos.setText("");
        correo.setText("");
        edad.setText("");
    }
}