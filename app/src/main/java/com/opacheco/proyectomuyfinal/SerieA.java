package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SerieA extends AppCompatActivity {

    Button btnJuventus, btnInterdeMilan, btnMilan, btnBayern, btnLeipzig, btnDortmund, btnPsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie);

        btnJuventus = findViewById(R.id.btnJuventus);
        btnInterdeMilan = findViewById(R.id.btnInterdeMilan);
        btnMilan = findViewById(R.id.btnMilan);
        btnBayern = findViewById(R.id.btnBayern);
        btnLeipzig = findViewById(R.id.btnLeipzig);
        btnDortmund = findViewById(R.id.btnDortmund);
        btnPsg = findViewById(R.id.btnPsg);




    }

    public void Juventus (View view){
        Intent it = new Intent(this, Juventus.class);
        startActivity(it);
    }

    public void InterMilan (View view){
        Intent it = new Intent(this, InterMilan.class);
        startActivity(it);
    }

    public void Milan (View view){
        Intent it = new Intent(this, Milan.class);
        startActivity(it);
    }

    public void Bayern (View view){
        Intent it = new Intent(this, Bayern.class);
        startActivity(it);
    }

    public void Leipzig (View view){
        Intent it = new Intent(this, Leipzig.class);
        startActivity(it);
    }

    public void Dortmund (View view){
        Intent it = new Intent(this, Dortmund.class);
        startActivity(it);
    }

    public void Psg (View view){
        Intent it = new Intent(this, Psg.class);
        startActivity(it);
    }





}