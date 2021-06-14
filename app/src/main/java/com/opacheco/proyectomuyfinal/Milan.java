package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milan extends AppCompatActivity {

    Button btnDonnarumma, btnTatarusanu, btnAntonioDonnarumma, btnTomori, btnRomagnoli, btnKjaer, btnGabbia, btnTheoHernandez, btnCalabria, btnDalot, btnKalulu, btnBennacer, btnTonali,btnKessie, btnKrunic, btnMeite, btnCalhanoglu, btnBrahimDiaz, btnMaldini, btnRebic, btnHauge, btnSaelemaekers, btnCastillejo, btnRafaelLeoa, btnIbrahimovic, btnMandzukic;


    String urlDonnarumma ="https://www.transfermarkt.es/gianluigi-donnarumma/profil/spieler/315858";
    String urlTatarunasu ="https://www.transfermarkt.es/ciprian-tatarusanu/profil/spieler/55282";
    String urlAntonioDonnarumma="https://www.transfermarkt.es/antonio-donnarumma/profil/spieler/88685" ;
    String urlTomori ="https://www.transfermarkt.es/fikayo-tomori/profil/spieler/303254";
    String urlRomagnoli ="https://www.transfermarkt.es/alessio-romagnoli/profil/spieler/197747";
    String urlKjaer ="https://www.transfermarkt.es/simon-kjaer/profil/spieler/48859";
    String urlGabbia ="https://www.transfermarkt.es/matteo-gabbia/profil/spieler/323167";
    String urlTheoHernandez="https://www.transfermarkt.es/theo-hernandez/profil/spieler/339808" ;
    String urlCalabria ="https://www.transfermarkt.es/davide-calabria/profil/spieler/262523";
    String urlDalot ="https://www.transfermarkt.es/diogo-dalot/profil/spieler/357147";
    String urlKalulu ="https://www.transfermarkt.es/pierre-kalulu/profil/spieler/585949";
    String urlBennacer ="https://www.transfermarkt.es/ismael-bennacer/profil/spieler/351816";
    String urlTonali ="https://www.transfermarkt.es/sandro-tonali/profil/spieler/397033";
    String urlKessie ="https://www.transfermarkt.es/franck-kessie/profil/spieler/294808";
    String urlKrunic ="https://www.transfermarkt.es/rade-krunic/profil/spieler/259953";
    String urlMeite ="https://www.transfermarkt.es/soualiho-meite/profil/spieler/164913";
    String urlCalhanoglu="https://www.transfermarkt.es/hakan-calhanoglu/profil/spieler/126414" ;
    String urlBrahim ="https://www.transfermarkt.es/brahim-diaz/profil/spieler/314678";
    String urlMaldini ="https://www.transfermarkt.es/daniel-maldini/profil/spieler/539134";
    String urlRebic ="https://www.transfermarkt.es/ante-rebic/profil/spieler/187587";
    String urlHauge ="https://www.transfermarkt.es/jens-petter-hauge/profil/spieler/422355";
    String urlSaelemaekers="https://www.transfermarkt.es/alexis-saelemaekers/profil/spieler/381950" ;
    String urlCastillejo ="https://www.transfermarkt.es/samu-castillejo/profil/spieler/195171";
    String urlRafaelLeoa ="https://www.transfermarkt.es/rafael-leao/profil/spieler/357164";
    String urlIbrahimovic ="https://www.transfermarkt.es/zlatan-ibrahimovic/profil/spieler/3455";
    String urlMandzukic ="https://www.transfermarkt.es/mario-mandzukic/profil/spieler/34572";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milan);

        btnDonnarumma = findViewById(R.id.btnDonnarumma);
        btnTatarusanu = findViewById(R.id.btnTatarusanu);
        btnAntonioDonnarumma = findViewById(R.id.btnAntonioDonnarumma);
        btnTomori = findViewById(R.id.btnTomori);
        btnRomagnoli = findViewById(R.id.btnRomagnoli);
        btnKjaer = findViewById(R.id.btnKjaer);
        btnGabbia = findViewById(R.id.btnGabbia);
        btnTheoHernandez = findViewById(R.id.btnTheoHernandez);
        btnCalabria = findViewById(R.id.btnCalabria);
        btnDalot = findViewById(R.id.btnDalot);
        btnKalulu = findViewById(R.id.btnKalulu);
        btnBennacer = findViewById(R.id.btnBennacer);
        btnTonali = findViewById(R.id.btnTonali);
        btnKessie = findViewById(R.id.btnKessie);
        btnKrunic = findViewById(R.id.btnKrunic);
        btnMeite = findViewById(R.id.btnMeite);
        btnCalhanoglu = findViewById(R.id.btnCalhanoglu);
        btnBrahimDiaz = findViewById(R.id.btnBrahimDiaz);
        btnMaldini = findViewById(R.id.btnMaldini);
        btnRebic = findViewById(R.id.btnRebic);
        btnHauge = findViewById(R.id.btnHauge);
        btnSaelemaekers = findViewById(R.id.btnSaelemaekers);
        btnCastillejo = findViewById(R.id.btnCastillejo);
        btnRafaelLeoa = findViewById(R.id.btnRafaelLeoa);
        btnIbrahimovic = findViewById(R.id.btnIbrahimovic);
        btnMandzukic = findViewById(R.id.btnMandzukic);


        btnDonnarumma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDonnarumma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTatarusanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTatarunasu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonioDonnarumma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonioDonnarumma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomori);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRomagnoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRomagnoli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKjaer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKjaer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGabbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGabbia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnTheoHernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTheoHernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCalabria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCalabria);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDalot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDalot);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKalulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKalulu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBennacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBennacer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTonali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTonali);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKessie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKessie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKrunic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKrunic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMeite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMeite);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCalhanoglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCalhanoglu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnBrahimDiaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrahim);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaldini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaldini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnRebic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRebic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHauge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHauge);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaelemaekers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaelemaekers);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCastillejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCastillejo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRafaelLeoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRafaelLeoa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIbrahimovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIbrahimovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMandzukic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMandzukic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}