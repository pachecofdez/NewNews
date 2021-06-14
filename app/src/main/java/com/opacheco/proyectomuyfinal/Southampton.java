package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Southampton extends AppCompatActivity {

    Button btnAlexMccarthy, btnFraserForster, btnAngusGunn, btnHarryLewis, btnJanBednarek,btnVestergaard, btnSalisu, btnStephens, btnBertrand, btnMcqueen, btnWalkerPeters, btnValery, btnIbrahimaDiallo, btnLemina, btnOriolRomeu, btnWardProwse, btnStuartArmstrong, btnSmallbone, btnHesketh, btnRedmond, btnDjenepo, btnElyounoussi, btnMinamino, btnSims, btnTella, btnIngs, btnAdams, btnObafemi, btnShaneLong, btnDanLundulu;


    String urlAlexMccarthy = "https://www.transfermarkt.es/alex-mccarthy/profil/spieler/95976";
    String urlFraserForster = "https://www.transfermarkt.es/fraser-forster/profil/spieler/52570";
    String urlAngusGunn = "https://www.transfermarkt.es/angus-gunn/profil/spieler/201574";
    String urlHarryLewis = "https://www.transfermarkt.es/harry-lewis/profil/spieler/341043";
    String urlJanBednarek = "https://www.transfermarkt.es/jan-bednarek/profil/spieler/243028";
    String urlVestergaard = "https://www.transfermarkt.es/jannik-vestergaard/profil/spieler/99331";
    String urlSalisu = "https://www.transfermarkt.es/mohammed-salisu/profil/spieler/563963";
    String urlStephens= "https://www.transfermarkt.es/jack-stephens/profil/spieler/163744";
    String urlBertrand = "https://www.transfermarkt.es/ryan-bertrand/profil/spieler/40611";
    String urlMcqueen = "https://www.transfermarkt.es/sam-mcqueen/profil/spieler/226968";
    String urlWalkerPeters = "https://www.transfermarkt.es/kyle-walker-peters/profil/spieler/341051";
    String urlValery = "https://www.transfermarkt.es/yan-valery/profil/spieler/406008";
    String urlIbrahimaDiallo = "https://www.transfermarkt.es/ibrahima-diallo/profil/spieler/413032";
    String urlLemina= "https://www.transfermarkt.es/mario-lemina/profil/spieler/170934" ;
    String urlOriolRomeu = "https://www.transfermarkt.es/oriol-romeu/profil/spieler/66100";
    String urlWardProwse= "https://www.transfermarkt.es/james-ward-prowse/profil/spieler/181579" ;
    String urlStuartArmstrong= "https://www.transfermarkt.es/stuart-armstrong/profil/spieler/130765" ;
    String urlSmallbone = "https://www.transfermarkt.es/will-smallbone/profil/spieler/444211";
    String urlHesketh= "https://www.transfermarkt.es/jake-hesketh/profil/spieler/315185" ;
    String urlRedmond = "https://www.transfermarkt.es/nathan-redmond/profil/spieler/129078";
    String urlDjenepo= "https://www.transfermarkt.es/moussa-djenepo/profil/spieler/485424" ;
    String urlElyounoussi = "https://www.transfermarkt.es/mohamed-elyounoussi/profil/spieler/186644";
    String urlMinamino = "https://www.transfermarkt.es/takumi-minamino/profil/spieler/165793";
    String urlSims = "https://www.transfermarkt.es/josh-sims/profil/spieler/286919";
    String urlTella = "https://www.transfermarkt.es/nathan-tella/profil/spieler/340322";
    String urlIngs= "https://www.transfermarkt.es/danny-ings/profil/spieler/134294" ;
    String urlAdams = "https://www.transfermarkt.es/che-adams/profil/spieler/346779";
    String urlObafemi = "https://www.transfermarkt.es/michael-obafemi/profil/spieler/444208";
    String urlShaneLong = "https://www.transfermarkt.es/shane-long/profil/spieler/37304";
    String urlDanLundulu = "https://www.transfermarkt.es/dan-nlundulu/profil/spieler/346482";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southampton);

        btnAlexMccarthy = findViewById(R.id.btnAlexMccarthy);
        btnFraserForster = findViewById(R.id.btnFraserForster);
        btnAngusGunn = findViewById(R.id.btnAngusGunn);
        btnHarryLewis = findViewById(R.id.btnHarryLewis);
        btnJanBednarek = findViewById(R.id.btnJanBednarek);
        btnVestergaard = findViewById(R.id.btnVestergaard);
        btnSalisu = findViewById(R.id.btnSalisu);
        btnStephens = findViewById(R.id.btnStephens);
        btnBertrand = findViewById(R.id.btnBertrand);
        btnMcqueen = findViewById(R.id.btnMcqueen);
        btnWalkerPeters = findViewById(R.id.btnWalkerPeters);
        btnValery = findViewById(R.id.btnValery);
        btnIbrahimaDiallo = findViewById(R.id.btnIbrahimaDiallo);
        btnLemina = findViewById(R.id.btnLemina);
        btnOriolRomeu = findViewById(R.id.btnOriolRomeu);
        btnWardProwse = findViewById(R.id.btnWardProwse);
        btnStuartArmstrong = findViewById(R.id.btnStuartArmstrong);
        btnSmallbone = findViewById(R.id.btnSmallbone);
        btnHesketh = findViewById(R.id.btnHesketh);
        btnRedmond = findViewById(R.id.btnRedmond);
        btnDjenepo = findViewById(R.id.btnDjenepo);
        btnElyounoussi = findViewById(R.id.btnElyounoussi);
        btnMinamino = findViewById(R.id.btnMinamino);
        btnSims = findViewById(R.id.btnSims);
        btnTella = findViewById(R.id.btnTella);
        btnIngs = findViewById(R.id.btnIngs);
        btnAdams = findViewById(R.id.btnAdams);
        btnObafemi = findViewById(R.id.btnObafemi);
        btnShaneLong = findViewById(R.id.btnShaneLong);
        btnDanLundulu = findViewById(R.id.btnDanLundulu);

        btnAlexMccarthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexMccarthy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFraserForster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFraserForster);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAngusGunn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAngusGunn);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHarryLewis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHarryLewis);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJanBednarek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJanBednarek);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVestergaard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVestergaard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSalisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSalisu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStephens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStephens);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBertrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBertrand);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMcqueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcqueen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWalkerPeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWalkerPeters);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnValery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlValery);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIbrahimaDiallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIbrahimaDiallo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLemina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLemina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOriolRomeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOriolRomeu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWardProwse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWardProwse);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStuartArmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStuartArmstrong);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSmallbone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSmallbone);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHesketh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHesketh);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRedmond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRedmond);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDjenepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDjenepo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnElyounoussi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlElyounoussi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMinamino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMinamino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSims);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTella);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIngs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIngs);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnObafemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlObafemi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShaneLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlShaneLong);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnDanLundulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanLundulu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}