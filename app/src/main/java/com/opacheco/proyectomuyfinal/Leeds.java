package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leeds extends AppCompatActivity {


    Button btnMeslier, btnKikoCasilla, btnCaprile, btnDiegoLlorente, btnKoch, btnCooper, btnStruijk, btnAlioski, btnDouglas, btnLeifDavis, btnAyling, btnDallas, btnBerardi, btnKalvinPhillips, btnBouy, btnKlich, btnForshaw, btnShackleton, btnGotts, btnOKane, btnStevens, btnPabloHernandez, btnRaphinha, btnHelderCosta, btnPoveda, btnRodrigo, btnTylerRoberts, btnBamford, btnJoeGelhardt;


    String urlMeslier = "https://www.transfermarkt.es/illan-meslier/profil/spieler/542586";
    String urlKikoCasilla = "https://www.transfermarkt.es/kiko-casilla/profil/spieler/27486";
    String urlCaprile = "https://www.transfermarkt.es/elia-caprile/profil/spieler/421873";
    String urlDiegoLlorente = "https://www.transfermarkt.es/diego-llorente/profil/spieler/246291";
    String urlKoch = "https://www.transfermarkt.es/robin-koch/profil/spieler/328784";
    String urlCooper = "https://www.transfermarkt.es/liam-cooper/profil/spieler/75067";
    String urlStruik = "https://www.transfermarkt.es/pascal-struijk/profil/spieler/410708";
    String urlAlioski = "https://www.transfermarkt.es/ezgjan-alioski/profil/spieler/129604";
    String urlDouglas = "https://www.transfermarkt.es/barry-douglas/profil/spieler/91854";
    String urlLeifDavis= "https://www.transfermarkt.es/leif-davis/profil/spieler/596446" ;
    String urlAyling = "https://www.transfermarkt.es/luke-ayling/profil/spieler/67420";
    String urlDallas = "https://www.transfermarkt.es/stuart-dallas/profil/spieler/158764";
    String urlBerardi = "https://www.transfermarkt.es/gaetano-berardi/profil/spieler/43084";
    String urlKalvinPhillips= "https://www.transfermarkt.es/kalvin-phillips/profil/spieler/351749" ;
    String urlBouy = "https://www.transfermarkt.es/ouasim-bouy/profil/spieler/126412";
    String urlClich = "https://www.transfermarkt.es/mateusz-klich/profil/spieler/92738";
    String urlForshaw = "https://www.transfermarkt.es/adam-forshaw/profil/spieler/121257";
    String urlShackleton= "https://www.transfermarkt.es/jamie-shackleton/profil/spieler/534700" ;
    String urlGotts = "https://www.transfermarkt.es/robbie-gotts/profil/spieler/534698";
    String urlOKane = "https://www.transfermarkt.es/eunan-okane/profil/spieler/61583";
    String urlStevens = "https://www.transfermarkt.es/jordan-stevens/profil/spieler/533913";
    String urlPabloHernandez= "https://www.transfermarkt.es/pablo-hernandez/profil/spieler/46220" ;
    String urlRaphinha= "https://www.transfermarkt.es/raphinha/profil/spieler/411295" ;
    String urlHelderCosta= "https://www.transfermarkt.es/helder-costa/profil/spieler/173900" ;
    String urlPoveda = "https://www.transfermarkt.es/ian-poveda/profil/spieler/392763";
    String urlRodrigo = "https://www.transfermarkt.es/rodrigo/profil/spieler/131505";
    String urlTylerRoberts = "https://www.transfermarkt.es/tyler-roberts/profil/spieler/296986";
    String urlBamford= "https://www.transfermarkt.es/patrick-bamford/profil/spieler/183334" ;
    String urloeGelhardt= "https://www.transfermarkt.es/joe-gelhardt/profil/spieler/503980" ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leeds);


        btnMeslier = findViewById(R.id.btnMeslier);
        btnKikoCasilla = findViewById(R.id.btnKikoCasilla);
        btnCaprile = findViewById(R.id.btnCaprile);
        btnDiegoLlorente = findViewById(R.id.btnDiegoLlorente);
        btnKoch = findViewById(R.id.btnKoch);
        btnCooper = findViewById(R.id.btnCooper);
        btnStruijk = findViewById(R.id.btnStruijk);
        btnAlioski = findViewById(R.id.btnAlioski);
        btnDouglas = findViewById(R.id.btnDouglas);
        btnLeifDavis = findViewById(R.id.btnLeifDavis);
        btnAyling = findViewById(R.id.btnAyling);
        btnDallas = findViewById(R.id.btnDallas);
        btnBerardi = findViewById(R.id.btnBerardi);
        btnKalvinPhillips = findViewById(R.id.btnKalvinPhillips);
        btnBouy = findViewById(R.id.btnBouy);
        btnKlich = findViewById(R.id.btnKlich);
        btnForshaw = findViewById(R.id.btnForshaw);
        btnShackleton = findViewById(R.id.btnShackleton);
        btnGotts = findViewById(R.id.btnGotts);
        btnOKane = findViewById(R.id.btnOKane);
        btnStevens = findViewById(R.id.btnStevens);
        btnPabloHernandez = findViewById(R.id.btnPabloHernandez);
        btnRaphinha = findViewById(R.id.btnRaphinha);
        btnHelderCosta = findViewById(R.id.btnHelderCosta);
        btnPoveda = findViewById(R.id.btnPoveda);
        btnRodrigo = findViewById(R.id.btnRodrigo);
        btnTylerRoberts = findViewById(R.id.btnTylerRoberts);
        btnBamford = findViewById(R.id.btnBamford);
        btnJoeGelhardt = findViewById(R.id.btnJoeGelhardt);


        btnMeslier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMeslier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKikoCasilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKikoCasilla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCaprile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCaprile);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiegoLlorente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiegoLlorente);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKoch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKoch);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCooper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCooper);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStruijk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStruik);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlioski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlioski);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDouglas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDouglas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLeifDavis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLeifDavis);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAyling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAyling);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDallas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDallas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBerardi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBerardi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKalvinPhillips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKalvinPhillips);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBouy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBouy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKlich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlClich);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnForshaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlForshaw);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShackleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlShackleton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGotts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGotts);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOKane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOKane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStevens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStevens);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloHernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloHernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaphinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaphinha);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHelderCosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHelderCosta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPoveda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPoveda);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodrigo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTylerRoberts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTylerRoberts);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBamford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBamford);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoeGelhardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urloeGelhardt);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });





    }
}