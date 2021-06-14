package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LigaSantander extends AppCompatActivity {


    Button btnAtleticoDeMadrid, btnRealMadrid, btnBarcelona, btnSevilla, btnRealSociedad, btnBetis, btnVillarreal, btnCeltaVigo, btnAthletic, btnGranada, btnOsasuna, btnCadiz, btnValencia, btnLevante, btnAlaves, btnGetafe, btnHuesca, btnElche, btnValladolid, btnEibar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liga_santander);

        btnAtleticoDeMadrid = findViewById(R.id.btnAtleticoDeMadrid);
        btnRealMadrid = findViewById(R.id.btnRealMadrid);
        btnBarcelona = findViewById(R.id.btnBarcelona);
        btnSevilla = findViewById(R.id.btnSevilla);
        btnRealSociedad = findViewById(R.id.btnRealSociedad);
        btnBetis = findViewById(R.id.btnBetis);
        btnVillarreal = findViewById(R.id.btnVillarreal);
        btnCeltaVigo = findViewById(R.id.btnCeltaVigo);
        btnAthletic = findViewById(R.id.btnAthletic);
        btnGranada = findViewById(R.id.btnGranada);
        btnOsasuna = findViewById(R.id.btnOsasuna);
        btnCadiz = findViewById(R.id.btnCadiz);
        btnValencia = findViewById(R.id.btnValencia);
        btnLevante = findViewById(R.id.btnLevante);
        btnAlaves = findViewById(R.id.btnAlaves);
        btnGetafe = findViewById(R.id.btnGetafe);
        btnHuesca = findViewById(R.id.btnHuesca);
        btnElche = findViewById(R.id.btnElche);
        btnValladolid = findViewById(R.id.btnValladolid);
        btnEibar = findViewById(R.id.btnEibar);

    }

    public void AtleticodeMadrid (View view){
        Intent it = new Intent(this, AtleticodeMadrid.class);
        startActivity(it);
    }

    public void RealMadrid (View view){
        Intent it = new Intent(this, RealMadrid.class);
        startActivity(it);
    }

    public void Barcelona (View view){
        Intent it = new Intent(this, Barcelona.class);
        startActivity(it);
    }

    public void Sevilla (View view){
        Intent it = new Intent(this, Sevilla.class);
        startActivity(it);
    }

    public void RealSociedad (View view){
        Intent it = new Intent(this, RealSociedad.class);
        startActivity(it);
    }

    public void Betis (View view){
        Intent it = new Intent(this, Betis.class);
        startActivity(it);
    }

    public void Villarreal (View view){
        Intent it = new Intent(this, Villarreal.class);
        startActivity(it);
    }


    public void Celta (View view){
        Intent it = new Intent(this, Celta.class);
        startActivity(it);
    }


    public void Athletic (View view){
        Intent it = new Intent(this, Athletic.class);
        startActivity(it);
    }

    public void Granada (View view){
        Intent it = new Intent(this, Granada.class);
        startActivity(it);
    }

    public void Osasuna (View view){
        Intent it = new Intent(this, Osasuna.class);
        startActivity(it);
    }


    public void Cadiz (View view){
        Intent it = new Intent(this, Cadiz.class);
        startActivity(it);
    }

    public void Valencia (View view){
        Intent it = new Intent(this, Valencia.class);
        startActivity(it);
    }

    public void Levante (View view){
        Intent it = new Intent(this, Levante.class);
        startActivity(it);
    }


    public void Alaves (View view){
        Intent it = new Intent(this, Alaves.class);
        startActivity(it);
    }


    public void Getafe (View view){
        Intent it = new Intent(this, Getafe.class);
        startActivity(it);
    }


    public void Huesca (View view){
        Intent it = new Intent(this, Huesca.class);
        startActivity(it);
    }

    public void Elche (View view){
        Intent it = new Intent(this, Elche.class);
        startActivity(it);
    }

    public void Valladolid (View view){
        Intent it = new Intent(this, Valladolid.class);
        startActivity(it);
    }

    public void Eibar (View view){
        Intent it = new Intent(this, Eibar.class);
        startActivity(it);
    }


}