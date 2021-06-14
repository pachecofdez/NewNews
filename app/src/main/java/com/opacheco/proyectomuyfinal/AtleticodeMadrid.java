package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class AtleticodeMadrid extends AppCompatActivity {

    Button btnOblak,btnGrbic, btnGimenez, btnMarioHermoso, btnSavic, btnFelipe, btnLodi, btnTrippier, btnVrasaljko, btnTorreira, btnLlorente, btnKoke, btnSaul, btnKondogbia, btnHerrera, btnCarrasco, btnLemar, btnVitolo, btnJoao, btnCorrea, btnDembele, btnSuarez;

    String urlOblak = "https://www.transfermarkt.es/jan-oblak/profil/spieler/121483";
    String urlGrbic = "https://www.transfermarkt.es/ivo-grbic/profil/spieler/226073";
    String urlGimenez = "https://www.transfermarkt.es/jose-maria-gimenez/profil/spieler/250845";
    String urlMarioHermoso = "https://www.transfermarkt.es/mario-hermoso/profil/spieler/281769";
    String urlSavic = "https://www.transfermarkt.es/stefan-savic/profil/spieler/107010";
    String urlFelipe = "https://www.transfermarkt.es/felipe/profil/spieler/156501";
    String urlLodi = "https://www.transfermarkt.es/renan-lodi/profil/spieler/476352";
    String urlTrippier = "https://www.transfermarkt.es/kieran-trippier/profil/spieler/95810";
    String urlVrsaljko = "https://www.transfermarkt.es/sime-vrsaljko/profil/spieler/76061";
    String urlTorreira = "https://www.transfermarkt.es/lucas-torreira/profil/spieler/318077";
    String urlLlorente = "https://www.transfermarkt.es/marcos-llorente/profil/spieler/282411";
    String urlKoke = "https://www.transfermarkt.es/koke/profil/spieler/74229";
    String urlSaul = "https://www.transfermarkt.es/saul-niguez/profil/spieler/148928";
    String urlKondogbia = "https://www.transfermarkt.es/geoffrey-kondogbia/profil/spieler/127189";
    String urlHerrera = "https://www.transfermarkt.es/hector-herrera/profil/spieler/122043";
    String urlCarrasco = "https://www.transfermarkt.es/yannick-carrasco/profil/spieler/140776";
    String urlLemar = "https://www.transfermarkt.es/thomas-lemar/profil/spieler/205562";
    String urlVitolo = "https://www.transfermarkt.es/vitolo/profil/spieler/67082";
    String urlJoao = "https://www.transfermarkt.es/joao-felix/profil/spieler/462250";
    String urlCorrea = "https://www.transfermarkt.es/angel-correa/profil/spieler/266807";
    String urlDembele = "https://www.transfermarkt.es/moussa-dembele/profil/spieler/229004";
    String urlSuarez = "https://www.transfermarkt.es/luis-suarez/profil/spieler/44352";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleticode_madrid);

        btnOblak = findViewById(R.id.btnOblak);
        btnGrbic = findViewById(R.id.btnGrbic);
        btnGimenez = findViewById(R.id.btnGimenez);
        btnMarioHermoso = findViewById(R.id.btnMarioHermoso);
        btnSavic = findViewById(R.id.btnSavic);
        btnFelipe = findViewById(R.id.btnFelipe);
        btnLodi = findViewById(R.id.btnLodi);
        btnTrippier = findViewById(R.id.btnTrippier);
        btnVrasaljko = findViewById(R.id.btnVrasaljko);
        btnTorreira = findViewById(R.id.btnTorreira);
        btnLlorente = findViewById(R.id.btnLlorente);
        btnKoke = findViewById(R.id.btnKoke);
        btnSaul = findViewById(R.id.btnSaul);
        btnKondogbia = findViewById(R.id.btnKondogbia);
        btnHerrera = findViewById(R.id.btnHerrera);
        btnCarrasco = findViewById(R.id.btnCarrasco);
        btnLemar = findViewById(R.id.btnLemar);
        btnVitolo = findViewById(R.id.btnVitolo);
        btnJoao = findViewById(R.id.btnJoao);
        btnCorrea = findViewById(R.id.btnCorrea);
        btnDembele = findViewById(R.id.btnDembele);
        btnSuarez = findViewById(R.id.btnSuarez);



        btnOblak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOblak);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGrbic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGrbic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGimenez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGimenez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarioHermoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarioHermoso);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSavic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSavic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFelipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFelipe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLodi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLodi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTrippier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTrippier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVrasaljko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVrsaljko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTorreira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTorreira);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLlorente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLlorente);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKoke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaul);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKondogbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKondogbia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHerrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHerrera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarrasco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarrasco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLemar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLemar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVitolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVitolo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoao);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCorrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCorrea);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDembele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDembele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSuarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSuarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }




}