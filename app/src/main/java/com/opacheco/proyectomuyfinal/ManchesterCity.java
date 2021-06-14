package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManchesterCity extends AppCompatActivity {

    Button btnEderson, btnSteffen, btnCarson, btnRubenDias, btnLaporte, btnAke, btnStones, btnEricGarcia, btnSandler, btnZinchenko, btnBenjaminMendy, btnCancelo, btnWalker, btnRodri, btnFernandinho, btnGundogan, btnDeBruyne, btnBernardoSilva, btnSterling, btnFoden, btnFerran, btnMahrez, btnGabrielJesus, btnAguero;

    String urlEderson ="https://www.transfermarkt.es/ederson/profil/spieler/238223";
    String urlSteffen ="https://www.transfermarkt.es/zack-steffen/profil/spieler/221624";
    String urlCarson="https://www.transfermarkt.es/scott-carson/profil/spieler/14555";
    String urlRubenDias="https://www.transfermarkt.es/ruben-dias/profil/spieler/258004";
    String urlLaporte="https://www.transfermarkt.es/aymeric-laporte/profil/spieler/176553";
    String urlAke="https://www.transfermarkt.es/nathan-ake/profil/spieler/177476";
    String urlStones="https://www.transfermarkt.es/john-stones/profil/spieler/186590";
    String urlEricGarcia="https://www.transfermarkt.es/eric-garcia/profil/spieler/466794";
    String urlSandler="https://www.transfermarkt.es/philippe-sandler/profil/spieler/340460";
    String urlZinchenko="https://www.transfermarkt.es/oleksandr-zinchenko/profil/spieler/203853";
    String urlBenjaminMendy="https://www.transfermarkt.es/benjamin-mendy/profil/spieler/157495";
    String urlCancelo="https://www.transfermarkt.es/joao-cancelo/profil/spieler/182712";
    String urlWalker="https://www.transfermarkt.es/kyle-walker/profil/spieler/95424";
    String urlRodri="https://www.transfermarkt.es/rodri/profil/spieler/357565";
    String urlFernandinho = "https://www.transfermarkt.es/fernandinho/profil/spieler/26267";
    String urlGundogan="https://www.transfermarkt.es/ilkay-gundogan/profil/spieler/53622";
    String urlDeBruyne="https://www.transfermarkt.es/kevin-de-bruyne/profil/spieler/88755";
    String urlBernardoSilva="https://www.transfermarkt.es/bernardo-silva/profil/spieler/241641";
    String urlSterling="https://www.transfermarkt.es/raheem-sterling/profil/spieler/134425";
    String urlFoden="https://www.transfermarkt.es/phil-foden/profil/spieler/406635";
    String urlFerran="https://www.transfermarkt.es/ferran-torres/profil/spieler/398184";
    String urlMahrez="https://www.transfermarkt.es/riyad-mahrez/profil/spieler/171424";
    String urlGabrielJesus="https://www.transfermarkt.es/gabriel-jesus/profil/spieler/363205";
    String urlAguero="https://www.transfermarkt.es/sergio-aguero/profil/spieler/26399";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchester_city);


        btnEderson = findViewById(R.id.btnEderson);
        btnSteffen = findViewById(R.id.btnSteffen);
        btnCarson = findViewById(R.id.btnCarson);
        btnRubenDias = findViewById(R.id.btnRubenDias);
        btnLaporte = findViewById(R.id.btnLaporte);
        btnAke = findViewById(R.id.btnAke);
        btnStones = findViewById(R.id.btnStones);
        btnEricGarcia = findViewById(R.id.btnEricGarcia);
        btnSandler = findViewById(R.id.btnSandler);
        btnZinchenko = findViewById(R.id.btnZinchenko);
        btnBenjaminMendy = findViewById(R.id.btnBenjaminMendy);
        btnCancelo = findViewById(R.id.btnCancelo);
        btnWalker = findViewById(R.id.btnWalker);
        btnRodri = findViewById(R.id.btnRodri);
        btnFernandinho = findViewById(R.id.btnFernandinho);
        btnGundogan = findViewById(R.id.btnGundogan);
        btnDeBruyne = findViewById(R.id.btnDeBruyne);
        btnBernardoSilva = findViewById(R.id.btnBernardoSilva);
        btnSterling = findViewById(R.id.btnSterling);
        btnFoden = findViewById(R.id.btnFoden);
        btnFerran = findViewById(R.id.btnFerran);
        btnMahrez = findViewById(R.id.btnMahrez);
        btnGabrielJesus = findViewById(R.id.btnGabrielJesus);
        btnAguero = findViewById(R.id.btnAguero);

        btnEderson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEderson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSteffen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSteffen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenDias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenDias);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLaporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLaporte);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStones);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEricGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEricGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSandler);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZinchenko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZinchenko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenjaminMendy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenjaminMendy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCancelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCancelo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWalker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWalker);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFernandinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFernandinho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGundogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGundogan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeBruyne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeBruyne);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBernardoSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBernardoSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSterling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSterling);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFoden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFoden);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFerran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFerran);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMahrez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMahrez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGabrielJesus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGabrielJesus);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAguero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAguero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}