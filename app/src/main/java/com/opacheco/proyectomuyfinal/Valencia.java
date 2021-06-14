package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Valencia extends AppCompatActivity {

    Button btnJaumeDomenech, btnJasperCillesen, btnCristianRivero, btnGabrielPaulista, btnDiakhaby, btnHugoGuillamon, btnFerro, btnMangala, btnJoseGaya, btnToniLato, btnDanielWass, btnThierryCorreia, btnPiccini, btnChristianOliva, btnCarlosSoler, btnUrosRacic, btnKangInLee, btnGuedes, btnDenisCherysev, btnAlexBlanco, btnYunusMusah, btnJason, btnMaxiGomez, btnPAtrickCutrone, btnManuVallejo, btnGameiro;

    String urlJaumeDomenech =  "https://www.transfermarkt.es/jaume-domenech/profil/spieler/227805";
    String urlJasperCillesen =  "https://www.transfermarkt.es/jasper-cillessen/profil/spieler/146227";
    String urlCristianRivero =  "https://www.transfermarkt.es/cristian-rivero/profil/spieler/398131";
    String urlGabrielPaulista =  "https://www.transfermarkt.es/gabriel-paulista/profil/spieler/149498";
    String urlMouctarDiakhaby =  "https://www.transfermarkt.es/mouctar-diakhaby/profil/spieler/346289";
    String urlHugoGuillamon =  "https://www.transfermarkt.es/hugo-guillamon/profil/spieler/495629";
    String urlFerro =  "https://www.transfermarkt.es/ferro/profil/spieler/294321";
    String urlMangala =  "https://www.transfermarkt.es/eliaquim-mangala/profil/spieler/90681";
    String urlJoseGaya =  "https://www.transfermarkt.es/jose-gaya/profil/spieler/221322";
    String urlToniLato =  "https://www.transfermarkt.es/toni-lato/profil/spieler/320271";
    String urlDanielWass =  "https://www.transfermarkt.es/daniel-wass/profil/spieler/63463";
    String urlThierryCorreia =  "https://www.transfermarkt.es/thierry-correia/profil/spieler/367466";
    String urlCristianoPiccini =  "https://www.transfermarkt.es/cristiano-piccini/profil/spieler/163086";
    String urlChristianOliva =  "https://www.transfermarkt.es/christian-oliva/profil/spieler/563812";
    String urlCarlosSoler =  "https://www.transfermarkt.es/carlos-soler/profil/spieler/372246";
    String urlUrosRacic =  "https://www.transfermarkt.es/uros-racic/profil/spieler/417575";
    String urlKangInLee =  "https://www.transfermarkt.es/kang-in-lee/profil/spieler/557149";
    String urlGoncaloGuedes =  "https://www.transfermarkt.es/goncalo-guedes/profil/spieler/225122";
    String urlDenisCherysev =  "https://www.transfermarkt.es/denis-cheryshev/profil/spieler/98322";
    String urlAlexBlanco =  "https://www.transfermarkt.es/alex-blanco/profil/spieler/328914";
    String urlYunusMusah =  "https://www.transfermarkt.es/yunus-musah/profil/spieler/503991";
    String urlJason =  "https://www.transfermarkt.es/jason/profil/spieler/263860";
    String urlMaxiGomez =  "https://www.transfermarkt.es/maxi-gomez/profil/spieler/396894";
    String urlPatrickCutrone =  "https://www.transfermarkt.es/patrick-cutrone/profil/spieler/265078";
    String urlManuVallejo =  "https://www.transfermarkt.es/manu-vallejo/profil/spieler/527350";
    String urlKevinGameiro =  "https://www.transfermarkt.es/kevin-gameiro/profil/spieler/27389";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valencia);


        btnJaumeDomenech = findViewById(R.id.btnJaumeDomenech);
        btnJasperCillesen = findViewById(R.id.btnJasperCillesen);
        btnCristianRivero = findViewById(R.id.btnCristianRivero);
        btnGabrielPaulista = findViewById(R.id.btnGabrielPaulista);
        btnDiakhaby = findViewById(R.id.btnDiakhaby);
        btnHugoGuillamon = findViewById(R.id.btnHugoGuillamon);
        btnFerro = findViewById(R.id.btnFerro);
        btnMangala = findViewById(R.id.btnMangala);
        btnJoseGaya = findViewById(R.id.btnJoseGaya);
        btnToniLato = findViewById(R.id.btnToniLato);
        btnDanielWass = findViewById(R.id.btnDanielWass);
        btnThierryCorreia = findViewById(R.id.btnThierryCorreia);
        btnPiccini = findViewById(R.id.btnPiccini);
        btnChristianOliva = findViewById(R.id.btnChristianOliva);
        btnCarlosSoler = findViewById(R.id.btnCarlosSoler);
        btnUrosRacic = findViewById(R.id.btnUrosRacic);
        btnKangInLee = findViewById(R.id.btnKangInLee);
        btnGuedes = findViewById(R.id.btnGuedes);
        btnDenisCherysev = findViewById(R.id.btnDenisCherysev);
        btnAlexBlanco = findViewById(R.id.btnAlexBlanco);
        btnYunusMusah = findViewById(R.id.btnYunusMusah);
        btnJason = findViewById(R.id.btnJason);
        btnMaxiGomez = findViewById(R.id.btnMaxiGomez);
        btnPAtrickCutrone = findViewById(R.id.btnPAtrickCutrone);
        btnManuVallejo = findViewById(R.id.btnManuVallejo);
        btnGameiro = findViewById(R.id.btnGameiro);


        btnJaumeDomenech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaumeDomenech);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJasperCillesen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJasperCillesen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCristianRivero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCristianRivero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGabrielPaulista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGabrielPaulista);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiakhaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMouctarDiakhaby);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHugoGuillamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHugoGuillamon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFerro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMangala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMangala);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseGaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseGaya);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnToniLato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlToniLato);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDanielWass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanielWass);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnThierryCorreia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlThierryCorreia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPiccini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCristianoPiccini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChristianOliva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChristianOliva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosSoler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosSoler);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUrosRacic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUrosRacic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKangInLee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKangInLee);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGuedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGoncaloGuedes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDenisCherysev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDenisCherysev);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexBlanco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYunusMusah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYunusMusah);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJason);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaxiGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaxiGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPAtrickCutrone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPatrickCutrone);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnManuVallejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlManuVallejo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGameiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKevinGameiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}