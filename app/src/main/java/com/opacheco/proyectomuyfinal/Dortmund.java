package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dortmund extends AppCompatActivity {

    Button btnBurki, btnHitz, btnUnbehaun, btnDrljaca, btnAkanji, btnZagadou, btnHummels, btnRaphaelGuerreiro, btnSchulz, btnSchmelzer, btnMeunier, btnMorey, btrnPasslack, btnPisczek, btnEmreCan, btnDelaney, btnWitsel, btnBellingham, btnDahoud, btnRaschl, btnReyna, btnBrandt, btnReinier, btnReus, btnThorganHazard, btnKnauff, btnSancho, btnHaaland, btnMoukoko, btnTigges ;


    String urlBurki ="https://www.transfermarkt.es/roman-burki/profil/spieler/59027" ;
    String urlHitz ="https://www.transfermarkt.es/marwin-hitz/profil/spieler/59238";
    String urlUnbehaun ="https://www.transfermarkt.es/luca-unbehaun/profil/spieler/388815";
    String urlDrljaca ="https://www.transfermarkt.es/stefan-drljaca/profil/spieler/388067";
    String urlAkanji ="https://www.transfermarkt.es/manuel-akanji/profil/spieler/284730";
    String urlZagadou ="https://www.transfermarkt.es/dan-axel-zagadou/profil/spieler/344598";
    String urlHummels ="https://www.transfermarkt.es/mats-hummels/profil/spieler/39728";
    String urlRaphaelGuerreiro="https://www.transfermarkt.es/raphael-guerreiro/profil/spieler/170986" ;
    String urlSchulz ="https://www.transfermarkt.es/nico-schulz/profil/spieler/85867";
    String urlSchmelzer ="https://www.transfermarkt.es/marcel-schmelzer/profil/spieler/35208";
    String urlMeunier ="https://www.transfermarkt.es/thomas-meunier/profil/spieler/100986";
    String urlMorey ="https://www.transfermarkt.es/mateu-morey-bauza/profil/spieler/388513";
    String urlPasslack ="https://www.transfermarkt.es/felix-passlack/profil/spieler/274461";
    String urlPisczek ="https://www.transfermarkt.es/lukasz-piszczek/profil/spieler/25727";
    String urlEmreCan ="https://www.transfermarkt.es/emre-can/profil/spieler/119296";
    String urlDelaney ="https://www.transfermarkt.es/thomas-delaney/profil/spieler/91849";
    String urlWitsel ="https://www.transfermarkt.es/axel-witsel/profil/spieler/35047";
    String urlBellingham ="https://www.transfermarkt.es/jude-bellingham/profil/spieler/581678";
    String urlDahoud ="https://www.transfermarkt.es/mahmoud-dahoud/profil/spieler/191422";
    String urlRaschl ="https://www.transfermarkt.es/tobias-raschl/profil/spieler/384745";
    String urlReyna ="https://www.transfermarkt.es/giovanni-reyna/profil/spieler/504215";
    String urlBrandt ="https://www.transfermarkt.es/julian-brandt/profil/spieler/187492";
    String urlReinier ="https://www.transfermarkt.es/reinier/profil/spieler/627226";
    String urlReus ="https://www.transfermarkt.es/marco-reus/profil/spieler/35207";
    String urlThorganHazard="https://www.transfermarkt.es/thorgan-hazard/profil/spieler/102226" ;
    String urlKnauff ="https://www.transfermarkt.es/ansgar-knauff/profil/spieler/429874";
    String urlSancho ="https://www.transfermarkt.es/jadon-sancho/profil/spieler/401173";
    String urlHaaland ="https://www.transfermarkt.es/erling-haaland/profil/spieler/418560";
    String urlMoukoko ="https://www.transfermarkt.es/youssoufa-moukoko/profil/spieler/467720";
    String urlTigges ="https://www.transfermarkt.es/steffen-tigges/profil/spieler/296879";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dortmund);

        btnBurki = findViewById(R.id.btnBurki);
        btnHitz = findViewById(R.id.btnHitz);
        btnUnbehaun = findViewById(R.id.btnUnbehaun);
        btnDrljaca = findViewById(R.id.btnDrljaca);
        btnAkanji = findViewById(R.id.btnAkanji);
        btnZagadou = findViewById(R.id.btnZagadou);
        btnHummels = findViewById(R.id.btnHummels);
        btnRaphaelGuerreiro = findViewById(R.id.btnRaphaelGuerreiro);
        btnSchulz = findViewById(R.id.btnSchulz);
        btnSchmelzer = findViewById(R.id.btnSchmelzer);
        btnMeunier = findViewById(R.id.btnMeunier);
        btnMorey = findViewById(R.id.btnMorey);
        btrnPasslack = findViewById(R.id.btrnPasslack);
        btnPisczek = findViewById(R.id.btnPisczek);
        btnEmreCan = findViewById(R.id.btnEmreCan);
        btnDelaney = findViewById(R.id.btnDelaney);
        btnWitsel = findViewById(R.id.btnWitsel);
        btnBellingham = findViewById(R.id.btnBellingham);
        btnDahoud = findViewById(R.id.btnDahoud);
        btnRaschl = findViewById(R.id.btnRaschl);
        btnReyna = findViewById(R.id.btnReyna);
        btnBrandt = findViewById(R.id.btnBrandt);
        btnReinier = findViewById(R.id.btnReinier);
        btnReus = findViewById(R.id.btnReus);
        btnThorganHazard = findViewById(R.id.btnThorganHazard);
        btnKnauff = findViewById(R.id.btnKnauff);
        btnSancho = findViewById(R.id.btnSancho);
        btnHaaland = findViewById(R.id.btnHaaland);
        btnMoukoko = findViewById(R.id.btnMoukoko);
        btnTigges = findViewById(R.id.btnTigges);

        btnBurki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBurki);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHitz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHitz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUnbehaun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnbehaun);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDrljaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDrljaca);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAkanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAkanji);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZagadou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZagadou);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHummels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHummels);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaphaelGuerreiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaphaelGuerreiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSchulz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSchulz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSchmelzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSchmelzer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMeunier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMeunier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMorey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMorey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btrnPasslack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPasslack);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPisczek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPisczek);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmreCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmreCan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDelaney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDelaney);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWitsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWitsel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBellingham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBellingham);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDahoud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDahoud);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaschl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaschl);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnReyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlReyna);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrandt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrandt);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnReinier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlReinier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnReus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlReus);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnThorganHazard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlThorganHazard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKnauff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKnauff);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSancho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHaaland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHaaland);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMoukoko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMoukoko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTigges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTigges);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });






    }
}