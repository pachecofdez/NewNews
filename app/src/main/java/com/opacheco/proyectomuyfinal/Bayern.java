package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bayern extends AppCompatActivity {

    Button btnNeuer, btnNubel, btnHoffmann, btnAlaba, btnSule, btnNianzou, btnBoateng, btnDavies, btnLucasHernandez, btnPavard, btnSarr, btnStanisic, btnKimmich, btnMarcRoca, btnJaviMartinez, btnGoretzka, btnTolisso, btnDantas, btnMusiala, btnScott, btnComan, btngnabry, btnSane, btnMuller, btnLewandowski, btnMoting;

    String urlNeuer = "https://www.transfermarkt.es/manuel-neuer/profil/spieler/17259";
    String urlNubel = "https://www.transfermarkt.es/alexander-nubel/profil/spieler/195778";
    String urlHoffmann = "https://www.transfermarkt.es/ron-thorben-hoffmann/profil/spieler/317444";
    String urlAlaba = "https://www.transfermarkt.es/david-alaba/profil/spieler/59016";
    String urlSule= "https://www.transfermarkt.es/niklas-sule/profil/spieler/166601" ;
    String urlNianzou = "https://www.transfermarkt.es/tanguy-nianzou/profil/spieler/538996";
    String urlBoateng = "https://www.transfermarkt.es/jerome-boateng/profil/spieler/26485";
    String urlDavies = "https://www.transfermarkt.es/alphonso-davies/profil/spieler/424204";
    String urlLucasHernandez = "https://www.transfermarkt.es/lucas-hernandez/profil/spieler/281963";
    String urlPavard = "https://www.transfermarkt.es/benjamin-pavard/profil/spieler/353366";
    String urlSarr = "https://www.transfermarkt.es/bouna-sarr/profil/spieler/190685";
    String urlStanisic = "https://www.transfermarkt.es/josip-stanisic/profil/spieler/483046";
    String urlKimmich = "https://www.transfermarkt.es/joshua-kimmich/profil/spieler/161056";
    String urlMarcRoca = "https://www.transfermarkt.es/marc-roca/profil/spieler/336869";
    String urlJaviMartinez = "https://www.transfermarkt.es/javi-martinez/profil/spieler/44017";
    String urlGoretzka = "https://www.transfermarkt.es/leon-goretzka/profil/spieler/153084";
    String urlTolisso = "https://www.transfermarkt.es/corentin-tolisso/profil/spieler/190393";
    String urlDantas = "https://www.transfermarkt.es/tiago-dantas/profil/spieler/429987";
    String urlMusiala = "https://www.transfermarkt.es/jamal-musiala/profil/spieler/580195";
    String urlScott = "https://www.transfermarkt.es/christopher-scott/profil/spieler/503162";
    String urlComan = "https://www.transfermarkt.es/kingsley-coman/profil/spieler/243714";
    String urlGnabry = "https://www.transfermarkt.es/serge-gnabry/profil/spieler/159471";
    String urlSane = "https://www.transfermarkt.es/leroy-sane/profil/spieler/192565";
    String urlMuller= "https://www.transfermarkt.es/thomas-muller/profil/spieler/58358" ;
    String urlLewandowski= "https://www.transfermarkt.es/robert-lewandowski/profil/spieler/38253";
    String urlMoting = "https://www.transfermarkt.es/eric-maxim-choupo-moting/profil/spieler/45660" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayern);

        btnNeuer = findViewById(R.id.btnNeuer);
        btnNubel = findViewById(R.id.btnNubel);
        btnHoffmann = findViewById(R.id.btnHoffmann);
        btnAlaba = findViewById(R.id.btnAlaba);
        btnSule = findViewById(R.id.btnSule);
        btnNianzou = findViewById(R.id.btnNianzou);
        btnBoateng = findViewById(R.id.btnBoateng);
        btnDavies = findViewById(R.id.btnDavies);
        btnLucasHernandez = findViewById(R.id.btnLucasHernandez);
        btnPavard = findViewById(R.id.btnPavard);
        btnSarr = findViewById(R.id.btnSarr);
        btnStanisic = findViewById(R.id.btnStanisic);
        btnKimmich = findViewById(R.id.btnKimmich);
        btnMarcRoca = findViewById(R.id.btnMarcRoca);
        btnJaviMartinez = findViewById(R.id.btnJaviMartinez);
        btnGoretzka = findViewById(R.id.btnGoretzka);
        btnTolisso = findViewById(R.id.btnTolisso);
        btnDantas = findViewById(R.id.btnDantas);
        btnMusiala = findViewById(R.id.btnMusiala);
        btnScott = findViewById(R.id.btnScott);
        btnComan = findViewById(R.id.btnComan);
        btngnabry = findViewById(R.id.btngnabry);
        btnSane = findViewById(R.id.btnSane);
        btnMuller = findViewById(R.id.btnMuller);
        btnLewandowski = findViewById(R.id.btnLewandowski);
        btnMoting = findViewById(R.id.btnMoting);


        btnNeuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNeuer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNubel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHoffmann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHoffmann);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlaba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSule);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNianzou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNianzou);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBoateng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBoateng);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavies);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasHernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasHernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPavard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPavard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnSarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSarr);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStanisic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStanisic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKimmich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKimmich);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcRoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcRoca);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGoretzka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGoretzka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTolisso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTolisso);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDantas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMusiala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMusiala);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnScott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlScott);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnComan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlComan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btngnabry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGnabry);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMuller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMuller);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLewandowski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLewandowski);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMoting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMoting);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }


}