package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

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
        if (nombres.getText().toString().equals(Empty)){
            Toast.makeText(getApplicationContext(), "Debe de escribir un nombre" , Toast.LENGTH_LONG).show();
        }else if (apellidos.getText().toString().equals(Empty)){
            Toast.makeText(getApplicationContext(), "Debe de escribir un apellido" ,Toast.LENGTH_LONG).show();
        }else if (edad.getText().toString().equals(Empty)){
            Toast.makeText(getApplicationContext(), "Debe de escribir su edad" ,Toast.LENGTH_LONG).show();
        }else if (correo.getText().toString().equals(Empty)){
            Toast.makeText(getApplicationContext(), "Debe de escribir su correo" ,Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ActivityPrint.class);
            i.putExtra("DatoP1", nombres.getText().toString());
            i.putExtra("DatoP2", apellidos.getText().toString());
            i.putExtra("DatoP3", edad.getText().toString());
            i.putExtra("DatoP4", correo.getText().toString());
            startActivity(i);
            ClearScreen();
        }
    }
    private void ClearScreen(){
        nombres.setText(Empty);
        apellidos.setText(Empty);
        correo.setText(Empty);
        edad.setText(Empty);
    }

    public static final String Empty = "";
}