package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Newcastle extends AppCompatActivity {


    Button btnWoodman, btnDubravka, btnDarlow, btnGillespie, btnLascelles, btnSchar, btnClark, btnFedericoFernandez, btnJamalLewis, btnDummett, btnMattRitchie, btnKrafth, btnJavierManquillo, btnIsaacHayden, btnLongstaff, btnShelvey, btnJeffHendrick, btnMatthewLongstaff, btnMiguelAlmiron, btnHerniSaivetm, btnAllanSaintMaximin, btnRyanFraser, btnChristianAtsu, btnJacobMurphy, btnWilson, btnJoelington, btnGayle, btnAndyCarroll;


    String urlWoodman = "https://www.transfermarkt.es/freddie-woodman/profil/spieler/226049";
    String urlDubravka = "https://www.transfermarkt.es/martin-dubravka/profil/spieler/74960";
    String urlDarlow = "https://www.transfermarkt.es/karl-darlow/profil/spieler/99397";
    String urlGillespie = "https://www.transfermarkt.es/mark-gillespie/profil/spieler/142389";
    String urlLascelles = "https://www.transfermarkt.es/jamaal-lascelles/profil/spieler/183318";
    String urlSchar= "https://www.transfermarkt.es/fabian-schar/profil/spieler/135343" ;
    String urlClark = "https://www.transfermarkt.es/ciaran-clark/profil/spieler/98240";
    String urlFedericoFernandez = "https://www.transfermarkt.es/federico-fernandez/profil/spieler/85475";
    String urlJamalLewis = "https://www.transfermarkt.es/jamal-lewis/profil/spieler/346018";
    String urlDummett = "https://www.transfermarkt.es/paul-dummett/profil/spieler/170321";
    String urlMattRitchie = "https://www.transfermarkt.es/matt-ritchie/profil/spieler/92469";
    String urlKrafth = "https://www.transfermarkt.es/emil-krafth/profil/spieler/184528";
    String urlJavierManquillo = "https://www.transfermarkt.es/javier-manquillo/profil/spieler/162029";
    String urlIsaacHayden = "https://www.transfermarkt.es/isaac-hayden/profil/spieler/206225";
    String urlLongstaff = "https://www.transfermarkt.es/sean-longstaff/profil/spieler/346707";
    String urlShelvey = "https://www.transfermarkt.es/jonjo-shelvey/profil/spieler/71292";
    String urlJeffHendrick = "https://www.transfermarkt.es/jeff-hendrick/profil/spieler/148262";
    String urlMatthewLongstaff = "https://www.transfermarkt.es/matthew-longstaff/profil/spieler/484387";
    String urlMiguelAlmiron = "https://www.transfermarkt.es/miguel-almiron/profil/spieler/272999";
    String urlHerniSaivetm = "https://www.transfermarkt.es/henri-saivet/profil/spieler/51540";
    String urlAllanSaintMaximin = "https://www.transfermarkt.es/allan-saint-maximin/profil/spieler/272642";
    String urlRyanFraser = "https://www.transfermarkt.es/ryan-fraser/profil/spieler/146795";
    String urlChristianAtsu = "https://www.transfermarkt.es/christian-atsu/profil/spieler/186997";
    String urlJacobMurphy = "https://www.transfermarkt.es/jacob-murphy/profil/spieler/199527";
    String urlWilson= "https://www.transfermarkt.es/callum-wilson/profil/spieler/123682" ;
    String urlJoelington = "https://www.transfermarkt.es/joelinton/profil/spieler/333241";
    String urlGayle = "https://www.transfermarkt.es/dwight-gayle/profil/spieler/196522";
    String urlAndyCarroll = "https://www.transfermarkt.es/andy-carroll/profil/spieler/48066";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcastle);

        btnWoodman = findViewById(R.id.btnWoodman);
        btnDubravka = findViewById(R.id.btnDubravka);
        btnDarlow = findViewById(R.id.btnDarlow);
        btnGillespie = findViewById(R.id.btnGillespie);
        btnLascelles = findViewById(R.id.btnLascelles);
        btnSchar = findViewById(R.id.btnSchar);
        btnClark = findViewById(R.id.btnClark);
        btnFedericoFernandez = findViewById(R.id.btnFedericoFernandez);
        btnJamalLewis = findViewById(R.id.btnJamalLewis);
        btnDummett = findViewById(R.id.btnDummett);
        btnMattRitchie = findViewById(R.id.btnMattRitchie);
        btnKrafth = findViewById(R.id.btnKrafth);
        btnJavierManquillo = findViewById(R.id.btnJavierManquillo);
        btnIsaacHayden = findViewById(R.id.btnIsaacHayden);
        btnLongstaff = findViewById(R.id.btnLongstaff);
        btnShelvey = findViewById(R.id.btnShelvey);
        btnJeffHendrick = findViewById(R.id.btnJeffHendrick);
        btnMatthewLongstaff = findViewById(R.id.btnMatthewLongstaff);
        btnMiguelAlmiron = findViewById(R.id.btnMiguelAlmiron);
        btnHerniSaivetm = findViewById(R.id.btnHerniSaivet);
        btnAllanSaintMaximin = findViewById(R.id.btnAllanSaintMaximin);
        btnRyanFraser = findViewById(R.id.btnRyanFraser);
        btnChristianAtsu = findViewById(R.id.btnChristianAtsu);
        btnJacobMurphy = findViewById(R.id.btnJacobMurphy);
        btnWilson = findViewById(R.id.btnWilson);
        btnJoelington = findViewById(R.id.btnJoelington);
        btnGayle = findViewById(R.id.btnGayle);
        btnAndyCarroll = findViewById(R.id.btnAndyCarroll);

        btnWoodman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWoodman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDubravka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDubravka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarlow);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGillespie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGillespie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLascelles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLascelles);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSchar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSchar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnClark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlClark);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFedericoFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFedericoFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJamalLewis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJamalLewis);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDummett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDummett);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMattRitchie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMattRitchie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKrafth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKrafth);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJavierManquillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJavierManquillo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIsaacHayden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIsaacHayden);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLongstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLongstaff);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShelvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlShelvey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJeffHendrick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJeffHendrick);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMatthewLongstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMatthewLongstaff);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelAlmiron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelAlmiron);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHerniSaivetm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHerniSaivetm);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAllanSaintMaximin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAllanSaintMaximin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRyanFraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRyanFraser);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChristianAtsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChristianAtsu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJacobMurphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJacobMurphy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWilson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWilson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoelington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoelington);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGayle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGayle);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndyCarroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndyCarroll);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}