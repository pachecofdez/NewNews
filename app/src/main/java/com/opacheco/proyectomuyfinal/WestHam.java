package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WestHam extends AppCompatActivity {


    Button btnFabiansky, btnDarrenRandolph, btnDavidMartin, btnIssaDiop, btnBalbuena, btnOgbonna, btnWinstonReid, btnFrederikAlves, btnMasuaku, btnCresswell, btnCoufal, btnFredericks, btnBenJohson, btnDeclanRice, btnTomasSoucek, btnMarkNoble, btnPabloFornals, btnManuelLanzini, btnSaidBenrahma, btnJarrodBowen, btnAndriyYarmolenko, btnMichailAntonio ;


    String urlFabiansky = "https://www.transfermarkt.es/lukasz-fabianski/profil/spieler/29692";
    String urlDarrenRandolph = "https://www.transfermarkt.es/darren-randolph/profil/spieler/51321";
    String urlDavidMartin = "https://www.transfermarkt.es/david-martin/profil/spieler/15930";
    String urlIssaDiop = "https://www.transfermarkt.es/issa-diop/profil/spieler/272622";
    String urlBalbuena = "https://www.transfermarkt.es/fabian-balbuena/profil/spieler/285548";
    String urlOgbonna = "https://www.transfermarkt.es/angelo-ogbonna/profil/spieler/48002";
    String urlWinstonReid = "https://www.transfermarkt.es/winston-reid/profil/spieler/37526";
    String urlFrederikAlves = "https://www.transfermarkt.es/frederik-alves/profil/spieler/542690";
    String urlMasuaku = "https://www.transfermarkt.es/arthur-masuaku/profil/spieler/181380";
    String urlCresswell = "https://www.transfermarkt.es/aaron-cresswell/profil/spieler/92571";
    String urlCoufal = "https://www.transfermarkt.es/vladimir-coufal/profil/spieler/157672";
    String urlFredericks = "https://www.transfermarkt.es/ryan-fredericks/profil/spieler/140191";
    String urlBenJohson = "https://www.transfermarkt.es/ben-johnson/profil/spieler/468002";
    String urlDeclanRice = "https://www.transfermarkt.es/declan-rice/profil/spieler/357662";
    String urlTomasSoucek = "https://www.transfermarkt.es/tomas-soucek/profil/spieler/283628";
    String urlMarkNoble = "https://www.transfermarkt.es/mark-noble/profil/spieler/31835";
    String urlPabloFornals = "https://www.transfermarkt.es/pablo-fornals/profil/spieler/357885";
    String urlManuelLanzini = "https://www.transfermarkt.es/manuel-lanzini/profil/spieler/135853";
    String urlSaidBenrahma = "https://www.transfermarkt.es/said-benrahma/profil/spieler/290532";
    String urlJarrodBowen = "https://www.transfermarkt.es/jarrod-bowen/profil/spieler/314875";
    String urlAndriyYarmolenko = "https://www.transfermarkt.es/andriy-yarmolenko/profil/spieler/69015";
    String urlMichailAntonio = "https://www.transfermarkt.es/michail-antonio/profil/spieler/104124";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_ham);


        btnFabiansky = findViewById(R.id.btnFabiansky);
        btnDarrenRandolph = findViewById(R.id.btnDarrenRandolph);
        btnDavidMartin = findViewById(R.id.btnDavidMartin);
        btnIssaDiop = findViewById(R.id.btnIssaDiop);
        btnBalbuena = findViewById(R.id.btnBalbuena);
        btnOgbonna = findViewById(R.id.btnOgbonna);
        btnWinstonReid = findViewById(R.id.btnWinstonReid);
        btnFrederikAlves = findViewById(R.id.btnFrederikAlves);
        btnMasuaku = findViewById(R.id.btnMasuaku);
        btnCresswell = findViewById(R.id.btnCresswell);
        btnCoufal = findViewById(R.id.btnCoufal);
        btnFredericks = findViewById(R.id.btnFredericks);
        btnBenJohson = findViewById(R.id.btnBenJohson);
        btnDeclanRice = findViewById(R.id.btnDeclanRice);
        btnTomasSoucek = findViewById(R.id.btnTomasSoucek);
        btnMarkNoble = findViewById(R.id.btnMarkNoble);
        btnPabloFornals = findViewById(R.id.btnPabloFornals);
        btnManuelLanzini = findViewById(R.id.btnManuelLanzini);
        btnSaidBenrahma = findViewById(R.id.btnSaidBenrahma);
        btnJarrodBowen = findViewById(R.id.btnJarrodBowen);
        btnAndriyYarmolenko = findViewById(R.id.btnAndriyYarmolenko);
        btnMichailAntonio = findViewById(R.id.btnMichailAntonio);


        btnFabiansky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFabiansky);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarrenRandolph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarrenRandolph);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidMartin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIssaDiop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIssaDiop);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBalbuena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBalbuena);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOgbonna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOgbonna);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWinstonReid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWinstonReid);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFrederikAlves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFrederikAlves);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMasuaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMasuaku);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCresswell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCresswell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCoufal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCoufal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFredericks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFredericks);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenJohson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenJohson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeclanRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeclanRice);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomasSoucek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomasSoucek);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarkNoble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarkNoble);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloFornals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloFornals);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnManuelLanzini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlManuelLanzini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaidBenrahma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaidBenrahma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJarrodBowen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJarrodBowen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndriyYarmolenko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndriyYarmolenko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichailAntonio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichailAntonio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}