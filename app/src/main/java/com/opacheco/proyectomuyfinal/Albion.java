package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albion extends AppCompatActivity {

    Button btnRobertSanchez, btnSteele, btnWalton, btnBenWhite, btnLewisDunk, btnAdamWebster, btnShaneDuffy, btnDanBurn, btnMattClarke, btnOstigard, btnMichal, btnLamptey, btnVeltman, btnBissouma, btnModer, btnDavyPropper, btnPascalGrob, btnAlzate, btnMoisesCaicedo, btnSollyMarch, btnAlexisMacAllister, btnLallana, btnPercyTau, btnTrossard, btnJoseIzquierdo, btnAlireza, btnMaupay, btnConnolly, btnWellbeck, btnZeqiri, btnAndone, btnGyokeres;

    String urlRobertSanchez = "https://www.transfermarkt.es/robert-sanchez/profil/spieler/403151";
    String urlSteele = "https://www.transfermarkt.es/jason-steele/profil/spieler/73564";
    String urlWalton = "https://www.transfermarkt.es/christian-walton/profil/spieler/208379";
    String urlBenWhite = "https://www.transfermarkt.es/ben-white/profil/spieler/335721";
    String urlLewisDunk = "https://www.transfermarkt.es/lewis-dunk/profil/spieler/148153";
    String urlAdamWebster = "https://www.transfermarkt.es/adam-webster/profil/spieler/212847";
    String urlShaneDuffy = "https://www.transfermarkt.es/shane-duffy/profil/spieler/119269";
    String urlDanBurn = "https://www.transfermarkt.es/dan-burn/profil/spieler/134270";
    String urlMattClarke = "https://www.transfermarkt.es/matt-clarke/profil/spieler/307497";
    String urlOstigard = "https://www.transfermarkt.es/leo-ostigard/profil/spieler/367284";
    String urlMichal = "https://www.transfermarkt.es/michal-karbownik/profil/spieler/401604";
    String urlLamptey = "https://www.transfermarkt.es/tariq-lamptey/profil/spieler/504148";
    String urlVeltman = "https://www.transfermarkt.es/joel-veltman/profil/spieler/111195";
    String urlBissouma = "https://www.transfermarkt.es/yves-bissouma/profil/spieler/410425";
    String urlModer = "https://www.transfermarkt.es/jakub-moder/profil/spieler/384461";
    String urlDavyPropper= "https://www.transfermarkt.es/davy-propper/profil/spieler/79027" ;
    String urlPascalGrob= "https://www.transfermarkt.es/pascal-gross/profil/spieler/82873" ;
    String urlAlzate= "https://www.transfermarkt.es/steven-alzate/profil/spieler/476237" ;
    String urlMoisesCaicedo = "https://www.transfermarkt.es/moises-caicedo/profil/spieler/687626";
    String urlSollyMarch = "https://www.transfermarkt.es/solly-march/profil/spieler/209212";
    String urlAlexisMacAllister = "https://www.transfermarkt.es/alexis-mac-allister/profil/spieler/534033";
    String urlLallana = "https://www.transfermarkt.es/adam-lallana/profil/spieler/43530";
    String urlPercyTau = "https://www.transfermarkt.es/percy-tau/profil/spieler/312239";
    String urlTrossard = "https://www.transfermarkt.es/leandro-trossard/profil/spieler/144028";
    String urlJoseIzquierdo = "https://www.transfermarkt.es/jose-izquierdo/profil/spieler/147094";
    String urlAlireza = "https://www.transfermarkt.es/alireza-jahanbakhsh/profil/spieler/213268";
    String urlMaupay= "https://www.transfermarkt.es/neal-maupay/profil/spieler/217115" ;
    String urlConnolly = "https://www.transfermarkt.es/aaron-connolly/profil/spieler/434207";
    String urlWellbeck = "https://www.transfermarkt.es/danny-welbeck/profil/spieler/67063";
    String urlZeqiri = "https://www.transfermarkt.es/andi-zeqiri/profil/spieler/345468";
    String urlAndone = "https://www.transfermarkt.es/florin-andone/profil/spieler/177065";
    String urlGyokeres = "https://www.transfermarkt.es/viktor-gyokeres/profil/spieler/325443";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albion);

        btnRobertSanchez = findViewById(R.id.btnRobertSanchez);
        btnSteele = findViewById(R.id.btnSteele);
        btnWalton = findViewById(R.id.btnWalton);
        btnBenWhite = findViewById(R.id.btnBenWhite);
        btnLewisDunk = findViewById(R.id.btnLewisDunk);
        btnAdamWebster = findViewById(R.id.btnAdamWebster);
        btnShaneDuffy = findViewById(R.id.btnShaneDuffy);
        btnDanBurn = findViewById(R.id.btnDanBurn);
        btnMattClarke = findViewById(R.id.btnMattClarke);
        btnOstigard = findViewById(R.id.btnOstigard);
        btnMichal = findViewById(R.id.btnMichal);
        btnLamptey = findViewById(R.id.btnLamptey);
        btnVeltman = findViewById(R.id.btnVeltman);
        btnBissouma = findViewById(R.id.btnBissouma);
        btnModer = findViewById(R.id.btnModer);
        btnDavyPropper = findViewById(R.id.btnDavyPropper);
        btnPascalGrob = findViewById(R.id.btnPascalGrob);
        btnAlzate = findViewById(R.id.btnAlzate);
        btnMoisesCaicedo = findViewById(R.id.btnMoisesCaicedo);
        btnSollyMarch = findViewById(R.id.btnSollyMarch);
        btnAlexisMacAllister = findViewById(R.id.btnAlexisMacAllister);
        btnLallana = findViewById(R.id.btnLallana);
        btnPercyTau = findViewById(R.id.btnPercyTau);
        btnTrossard = findViewById(R.id.btnTrossard);
        btnJoseIzquierdo = findViewById(R.id.btnJoseIzquierdo);
        btnAlireza = findViewById(R.id.btnAlireza);
        btnMaupay = findViewById(R.id.btnMaupay);
        btnConnolly = findViewById(R.id.btnConnolly);
        btnWellbeck = findViewById(R.id.btnWellbeck);
        btnZeqiri = findViewById(R.id.btnZeqiri);
        btnAndone = findViewById(R.id.btnAndone);
        btnGyokeres = findViewById(R.id.btnGyokeres);


        btnRobertSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSteele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSteele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWalton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWalton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenWhite);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLewisDunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLewisDunk);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdamWebster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdamWebster);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShaneDuffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlShaneDuffy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDanBurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanBurn);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnMattClarke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMattClarke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnOstigard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOstigard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLamptey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLamptey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVeltman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVeltman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBissouma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBissouma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnModer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlModer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavyPropper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavyPropper);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPascalGrob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPascalGrob);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlzate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlzate);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMoisesCaicedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMoisesCaicedo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSollyMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSollyMarch);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexisMacAllister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexisMacAllister);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLallana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLallana);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPercyTau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPercyTau);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTrossard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTrossard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseIzquierdo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlireza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlireza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaupay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaupay);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnConnolly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlConnolly);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWellbeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWellbeck);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZeqiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZeqiri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndone);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGyokeres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGyokeres);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}