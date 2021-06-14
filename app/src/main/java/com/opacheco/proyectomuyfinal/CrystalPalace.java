package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CrystalPalace extends AppCompatActivity {


    Button btnButland, btnVicenteGuaita, btnHennessey, btnStephenHenderson, btnKouyate, btnSakho, btnFerguson, btnTomkins, btnGaryCahill, btnDann, btnWoods, btnVanAanholt, btnMitchell, btnClyne, btnWard, btnKelly, btnMilivojevic, btnRidewald, btnMccarthy, btnMccarthur, btnSchlupp, btnEze, btnZaha, btnTownsend, btnMateta, btnBenteke, btnAyew, btnWickham;


    String urlButland = "https://www.transfermarkt.es/jack-butland/profil/spieler/128899";
    String urlVicenteGuaita = "https://www.transfermarkt.es/vicente-guaita/profil/spieler/64399";
    String urlHennesey = "https://www.transfermarkt.es/wayne-hennessey/profil/spieler/45494";
    String urlStephenHenderson = "https://www.transfermarkt.es/stephen-henderson/profil/spieler/52191";
    String urlKouyate = "https://www.transfermarkt.es/cheikhou-kouyate/profil/spieler/66934";
    String urlSakho= "https://www.transfermarkt.es/mamadou-sakho/profil/spieler/47713" ;
    String urlFerguson = "https://www.transfermarkt.es/nathan-ferguson/profil/spieler/507254";
    String urlTomkins = "https://www.transfermarkt.es/james-tomkins/profil/spieler/61592";
    String urlGaryCahill = "https://www.transfermarkt.es/gary-cahill/profil/spieler/27511";
    String urlDann= "https://www.transfermarkt.es/scott-dann/profil/spieler/62688" ;
    String urlWoods = "https://www.transfermarkt.es/sam-woods/profil/spieler/611650";
    String urlVanAanholt= "https://www.transfermarkt.es/patrick-van-aanholt/profil/spieler/52119" ;
    String urlMitchell= "https://www.transfermarkt.es/tyrick-mitchell/profil/spieler/730893" ;
    String urlClyne= "https://www.transfermarkt.es/nathaniel-clyne/profil/spieler/85177" ;
    String urlWard= "https://www.transfermarkt.es/joel-ward/profil/spieler/92572" ;
    String urlKelly = "https://www.transfermarkt.es/martin-kelly/profil/spieler/78959";
    String urlMilivojevic = "https://www.transfermarkt.es/luka-milivojevic/profil/spieler/74300";
    String urlRidewald= "https://www.transfermarkt.es/jairo-riedewald/profil/spieler/241481" ;
    String urlMccarthy = "https://www.transfermarkt.es/james-mccarthy/profil/spieler/45333";
    String urlMccarthur = "https://www.transfermarkt.es/james-mcarthur/profil/spieler/41416";
    String urlSchlupp = "https://www.transfermarkt.es/jeffrey-schlupp/profil/spieler/157506";
    String urlEze = "https://www.transfermarkt.es/eberechi-eze/profil/spieler/479999";
    String urlZaha = "https://www.transfermarkt.es/wilfried-zaha/profil/spieler/145988";
    String urlTownsend = "https://www.transfermarkt.es/andros-townsend/profil/spieler/61842";
    String urlMateta = "https://www.transfermarkt.es/jean-philippe-mateta/profil/spieler/420002";
    String urlBenteke = "https://www.transfermarkt.es/christian-benteke/profil/spieler/50201";
    String urlAyew = "https://www.transfermarkt.es/jordan-ayew/profil/spieler/108354";
    String urlWickham = "https://www.transfermarkt.es/connor-wickham/profil/spieler/95435";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crystal_palace);

        btnButland = findViewById(R.id.btnButland);
        btnVicenteGuaita = findViewById(R.id.btnVicenteGuaita);
        btnHennessey = findViewById(R.id.btnHennessey);
        btnStephenHenderson = findViewById(R.id.btnStephenHenderson);
        btnKouyate = findViewById(R.id.btnKouyate);
        btnSakho = findViewById(R.id.btnSakho);
        btnFerguson = findViewById(R.id.btnFerguson);
        btnTomkins = findViewById(R.id.btnTomkins);
        btnGaryCahill = findViewById(R.id.btnGaryCahill);
        btnDann = findViewById(R.id.btnDann);
        btnWoods = findViewById(R.id.btnWoods);
        btnVanAanholt = findViewById(R.id.btnVanAanholt);
        btnMitchell = findViewById(R.id.btnMitchell);
        btnClyne = findViewById(R.id.btnClyne);
        btnWard = findViewById(R.id.btnWard);
        btnKelly = findViewById(R.id.btnKelly);
        btnMilivojevic = findViewById(R.id.btnMilivojevic);
        btnRidewald = findViewById(R.id.btnRidewald);
        btnMccarthy = findViewById(R.id.btnMccarthy);
        btnMccarthur = findViewById(R.id.btnMccarthur);
        btnSchlupp = findViewById(R.id.btnSchlupp);
        btnEze = findViewById(R.id.btnEze);
        btnZaha = findViewById(R.id.btnZaha);
        btnTownsend = findViewById(R.id.btnTownsend);
        btnMateta = findViewById(R.id.btnMateta);
        btnBenteke = findViewById(R.id.btnBenteke);
        btnAyew = findViewById(R.id.btnAyew);
        btnWickham = findViewById(R.id.btnWickham);

        btnButland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlButland);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVicenteGuaita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVicenteGuaita);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHennessey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHennesey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStephenHenderson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStephenHenderson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKouyate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKouyate);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSakho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSakho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFerguson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFerguson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomkins);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGaryCahill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGaryCahill);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDann);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWoods);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVanAanholt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVanAanholt);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMitchell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMitchell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnClyne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlClyne);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKelly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKelly);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMilivojevic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMilivojevic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRidewald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRidewald);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMccarthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMccarthy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMccarthur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMccarthur);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSchlupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSchlupp);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEze);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZaha);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTownsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTownsend);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMateta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMateta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenteke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenteke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAyew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAyew);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWickham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWickham);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}