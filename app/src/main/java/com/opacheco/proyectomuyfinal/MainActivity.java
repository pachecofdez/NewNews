package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRegistrar;
    Button btnIniciarSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistrar = findViewById(R.id.btn_registrar);
        btnIniciarSesion = findViewById(R.id.btn_iniciarSesion);

    }


    public void lanzaractividadRegistrar (View view){
        Intent it = new Intent(this, RegistroActivity.class);
        startActivity(it);
    }


    public void lanzariniciarSesion (View view){
        Intent it = new Intent(this, InicioSesionActivity.class);
        startActivity(it);
    }





}