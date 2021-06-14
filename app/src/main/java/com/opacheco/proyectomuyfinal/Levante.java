package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Levante extends AppCompatActivity {

    Button btnAitorFernandez, btnDaniCardenas, btnRubenVezo, btnRoberPier, btnSergioPostigo, btnOscarDuarte, btnCarlosClerc, btnTono, btnJorgeMiramon, btnSon, btnCoke, btnMickaelMalsa, btnNemanjaRadoja, btnNikolaVukcevic, btnJCheickDoukoure, btnJoseCampana, btnGonzaloMelero, btnEnisBardhi, btnAlejandroCantero, btnJorgeDeFrutos, btnRubenRochina, btnEdgarSevikyan, btnRogerMarti, btnJoseLuisMorales, btnSergioLeon, btnDaniGomez;

    String urlAitorFernandez = "https://www.transfermarkt.es/aitor-fernandez/profil/spieler/118997";
    String urlDaniCardenas = "https://www.transfermarkt.es/dani-cardenas/profil/spieler/397676";
    String urlRubenVezo = "https://www.transfermarkt.es/ruben-vezo/profil/spieler/257851";
    String urlRoberPier = "https://www.transfermarkt.es/rober-pier/profil/spieler/387129";
    String urlSergioPostigo = "https://www.transfermarkt.es/sergio-postigo/profil/spieler/158791";
    String urlOscarDuarte = "https://www.transfermarkt.es/oscar-duarte/profil/spieler/175323";
    String urlCarlosClerc = "https://www.transfermarkt.es/carlos-clerc/profil/spieler/193784";
    String urlTono = "https://www.transfermarkt.es/tono/profil/spieler/125931";
    String urlJorgeMiramon = "https://www.transfermarkt.es/jorge-miramon/profil/spieler/228917";
    String urlSon = "https://www.transfermarkt.es/sontm/profil/spieler/349856";
    String urlCoke = "https://www.transfermarkt.es/coke/profil/spieler/71905";
    String urlMichaelMalsa = "https://www.transfermarkt.es/mickael-malsa/profil/spieler/205569";
    String urlNemanjaRadoja = "https://www.transfermarkt.es/nemanja-radoja/profil/spieler/168959";
    String urlNikolaVukcevic = "https://www.transfermarkt.es/nikola-vukcevic/profil/spieler/151470";
    String urlCheickDoukoure = "https://www.transfermarkt.es/cheick-doukoure/profil/spieler/129679";
    String urlJoseCampana = "https://www.transfermarkt.es/jose-campana/profil/spieler/120095";
    String urlGonzaloMelero = "https://www.transfermarkt.es/gonzalo-melero/profil/spieler/162056";
    String urlEnisBardhi = "https://www.transfermarkt.es/enis-bardhi/profil/spieler/245014";
    String urlAlejandroCantero = "https://www.transfermarkt.es/alejandro-cantero/profil/spieler/638235";
    String urlJorgeDeFrutos = "https://www.transfermarkt.es/jorge-de-frutos/profil/spieler/455181";
    String urlRubenRochina = "https://www.transfermarkt.es/ruben-rochina/profil/spieler/67548";
    String urlSevikyan = "https://www.transfermarkt.es/edgar-sevikyan/profil/spieler/430488";
    String urlRogerMarti = "https://www.transfermarkt.es/roger-marti/profil/spieler/212391";
    String urlJoseLuisMorales = "https://www.transfermarkt.es/jose-luis-morales/profil/spieler/252677";
    String urlSergioLeon = "https://www.transfermarkt.es/sergio-leon/profil/spieler/145769";
    String urlDaniGomez = "https://www.transfermarkt.es/dani-gomez/profil/spieler/422460";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levante);

        btnAitorFernandez = findViewById(R.id.btnAitorFernandez);
        btnDaniCardenas = findViewById(R.id.btnDaniCardenas);
        btnRubenVezo = findViewById(R.id.btnRubenVezo);
        btnRoberPier = findViewById(R.id.btnRoberPier);
        btnSergioPostigo = findViewById(R.id.btnSergioPostigo);
        btnOscarDuarte = findViewById(R.id.btnOscarDuarte);
        btnCarlosClerc = findViewById(R.id.btnCarlosClerc);
        btnTono = findViewById(R.id.btnTono);
        btnJorgeMiramon = findViewById(R.id.btnJorgeMiramon);
        btnSon = findViewById(R.id.btnSon);
        btnCoke = findViewById(R.id.btnCoke);
        btnMickaelMalsa = findViewById(R.id.btnMickaelMalsa);
        btnNemanjaRadoja = findViewById(R.id.btnNemanjaRadoja);
        btnNikolaVukcevic = findViewById(R.id.btnNikolaVukcevic);
        btnJCheickDoukoure = findViewById(R.id.btnJCheickDoukoure);
        btnJoseCampana = findViewById(R.id.btnJoseCampana);
        btnGonzaloMelero = findViewById(R.id.btnGonzaloMelero);
        btnEnisBardhi = findViewById(R.id.btnEnisBardhi);
        btnAlejandroCantero = findViewById(R.id.btnAlejandroCantero);
        btnJorgeDeFrutos = findViewById(R.id.btnJorgeDeFrutos);
        btnRubenRochina = findViewById(R.id.btnRubenRochina);
        btnEdgarSevikyan = findViewById(R.id.btnEdgarSevikyan);
        btnRogerMarti = findViewById(R.id.btnRogerMarti);
        btnJoseLuisMorales = findViewById(R.id.btnJoseLuisMorales);
        btnSergioLeon = findViewById(R.id.btnSergioLeon);
        btnDaniGomez = findViewById(R.id.btnDaniGomez);

        btnAitorFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAitorFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniCardenas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniCardenas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenVezo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenVezo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRoberPier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRoberPier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioPostigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioPostigo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOscarDuarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOscarDuarte);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosClerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosClerc);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTono);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorgeMiramon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorgeMiramon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCoke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMickaelMalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichaelMalsa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNemanjaRadoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNemanjaRadoja);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNikolaVukcevic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNikolaVukcevic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJCheickDoukoure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCheickDoukoure);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseCampana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseCampana);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGonzaloMelero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGonzaloMelero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEnisBardhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEnisBardhi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlejandroCantero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlejandroCantero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorgeDeFrutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorgeDeFrutos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenRochina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenRochina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEdgarSevikyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSevikyan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRogerMarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRogerMarti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseLuisMorales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseLuisMorales);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioLeon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });





    }
}