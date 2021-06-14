package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eibar extends AppCompatActivity {

    Button btnMarkoDimitrovic, btnYoelRodriguez, btnPauloOliveira, btnEstebanBurgos, btnPedroBigas, btnAnaitzArbilla, btnKevinRodrigues, btnJoseAngel, btnRafaSoares, btnAlejandroPozo, btnRobertoCorrea, btnPapeDiop, btnEduExposito, btnAleixGarcia, btnSergioAlvarez, btnRecio, btnMiguelAtienza, btnBryanGil, btnTakashiInui, btnPedroLeon, btnYoshinoriMuto, btnSergiEnrich, btnKikeGarcia, btnQuiqueGonzalez;

    String urlDimitrovic = "https://www.transfermarkt.es/marko-dmitrovic/profil/spieler/94308";
    String urlYoelRodriguez = "https://www.transfermarkt.es/yoel-rodriguez/profil/spieler/58115";
    String urlPauloOliveira = "https://www.transfermarkt.es/paulo-oliveira/profil/spieler/139336";
    String urlEstebanBurgos = "https://www.transfermarkt.es/esteban-burgos/profil/spieler/337922";
    String urlPedroBigas = "https://www.transfermarkt.es/pedro-bigas/profil/spieler/203043";
    String urlAnaitzArbilla = "https://www.transfermarkt.es/anaitz-arbilla/profil/spieler/71548";
    String urlKevinRodrigues = "https://www.transfermarkt.es/kevin-rodrigues/profil/spieler/206947";
    String urlJoseAngel = "https://www.transfermarkt.es/jose-angel/profil/spieler/87469";
    String urlRafaSoares = "https://www.transfermarkt.es/rafa-soares/profil/spieler/198006";
    String urlAlejandroPozo = "https://www.transfermarkt.es/alejandro-pozo/profil/spieler/341272";
    String urlRobertoCorrea = "https://www.transfermarkt.es/roberto-correa/profil/spieler/223890";
    String urlPapeDiop = "https://www.transfermarkt.es/pape-diop/profil/spieler/39907";
    String urlEduExposito = "https://www.transfermarkt.es/edu-exposito/profil/spieler/506248";
    String urlAleixGarcia = "https://www.transfermarkt.es/aleix-garcia/profil/spieler/261504";
    String urlSergioAlvarez = "https://www.transfermarkt.es/sergio-alvarez/profil/spieler/138935";
    String urlRecio = "https://www.transfermarkt.es/recio/profil/spieler/150948";
    String urlMiguelAtianza = "https://www.transfermarkt.es/miguel-atienza/profil/spieler/480955";
    String urlBryanGil = "https://www.transfermarkt.es/bryan-gil/profil/spieler/537382";
    String urlTakashiInui = "https://www.transfermarkt.es/takashi-inui/profil/spieler/98249";
    String urlPedroLeon = "https://www.transfermarkt.es/pedro-leon/profil/spieler/51587";
    String urlMuto = "https://www.transfermarkt.es/yoshinori-muto/profil/spieler/230541";
    String urlSergiEnrich = "https://www.transfermarkt.es/sergi-enrich/profil/spieler/81988";
    String urlKikeGarcia = "https://www.transfermarkt.es/kike-garcia/profil/spieler/93936";
    String urlQuiqueGonzalez = "https://www.transfermarkt.es/quique-gonzalez/profil/spieler/79352";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eibar);


        btnMarkoDimitrovic = findViewById(R.id.btnMarkoDimitrovic);
        btnYoelRodriguez = findViewById(R.id.btnYoelRodriguez);
        btnPauloOliveira = findViewById(R.id.btnPauloOliveira);
        btnEstebanBurgos = findViewById(R.id.btnEstebanBurgos);
        btnPedroBigas = findViewById(R.id.btnPedroBigas);
        btnAnaitzArbilla = findViewById(R.id.btnAnaitzArbilla);
        btnKevinRodrigues = findViewById(R.id.btnKevinRodrigues);
        btnJoseAngel = findViewById(R.id.btnJoseAngel);
        btnRafaSoares = findViewById(R.id.btnRafaSoares);
        btnAlejandroPozo = findViewById(R.id.btnAlejandroPozo);
        btnRobertoCorrea = findViewById(R.id.btnRobertoCorrea);
        btnPapeDiop = findViewById(R.id.btnPapeDiop);
        btnEduExposito = findViewById(R.id.btnEduExposito);
        btnAleixGarcia = findViewById(R.id.btnAleixGarcia);
        btnSergioAlvarez = findViewById(R.id.btnSergioAlvarez);
        btnRecio = findViewById(R.id.btnRecio);
        btnMiguelAtienza = findViewById(R.id.btnMiguelAtienza);
        btnBryanGil = findViewById(R.id.btnBryanGil);
        btnTakashiInui = findViewById(R.id.btnTakashiInui);
        btnPedroLeon = findViewById(R.id.btnPedroLeon);
        btnYoshinoriMuto = findViewById(R.id.btnYoshinoriMuto);
        btnSergiEnrich = findViewById(R.id.btnSergiEnrich);
        btnKikeGarcia = findViewById(R.id.btnKikeGarcia);
        btnQuiqueGonzalez = findViewById(R.id.btnQuiqueGonzalez);


        btnMarkoDimitrovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDimitrovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYoelRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYoelRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPauloOliveira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPauloOliveira);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEstebanBurgos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEstebanBurgos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroBigas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroBigas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnaitzArbilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnaitzArbilla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKevinRodrigues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKevinRodrigues);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseAngel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseAngel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRafaSoares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRafaSoares);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlejandroPozo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlejandroPozo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobertoCorrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertoCorrea);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPapeDiop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPapeDiop);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEduExposito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEduExposito);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAleixGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAleixGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioAlvarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioAlvarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRecio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelAtienza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelAtianza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBryanGil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBryanGil);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTakashiInui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTakashiInui);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroLeon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYoshinoriMuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMuto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergiEnrich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergiEnrich);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKikeGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKikeGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnQuiqueGonzalez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlQuiqueGonzalez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}