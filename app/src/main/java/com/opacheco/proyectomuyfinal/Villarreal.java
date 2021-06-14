package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Villarreal extends AppCompatActivity {

    Button btnSergioAsenjo, btnGeroRulli, btnPauTorres, btnJuanFoyth, btnRaulAlbiol, btnFunesMori, btnFervisEstupinan, btnAlfonsoPedraza, btnAlbertoMoreno, btnJaumeCosta, btnMarioGaspar, btnRubenPena, btnCoquelin, btnEtienneCapoue, btnManuTrigueros, btnDaniParejo, btnVicenteIborra, btnMoiGomez, btnYeremy, btnAlexBaena, btnSamuelChukwueze, btnDaniRaba, btnGerardMoreno, btnPacoAlcacer, btnFerNino, btnCarlosBacca;

    String urlSergioAsenjo = "https://www.transfermarkt.es/sergio-asenjo/profil/spieler/51710";
    String urlGeroRulli = "https://www.transfermarkt.es/gero-rulli/profil/spieler/229604";
    String urlPauTorres = "https://www.transfermarkt.es/pau-torres/profil/spieler/399776";
    String urlJuanFoyth = "https://www.transfermarkt.es/juan-foyth/profil/spieler/480763";
    String urlRaulAlbiol = "https://www.transfermarkt.es/raul-albiol/profil/spieler/15452";
    String urlRamiroFunesMori = "https://www.transfermarkt.es/ramiro-funes-mori/profil/spieler/11111";
    String urlEstupinan = "https://www.transfermarkt.es/pervis-estupinan/profil/spieler/349599";
    String urlAlfonsoPedraza = "https://www.transfermarkt.es/alfonso-pedraza/profil/spieler/356197";
    String urlAlbertoMoreno = "https://www.transfermarkt.es/alberto-moreno/profil/spieler/207917";
    String urlJaumeCosta = "https://www.transfermarkt.es/jaume-costa/profil/spieler/65318";
    String urlMarioGaspar = "https://www.transfermarkt.es/mario-gaspar/profil/spieler/73250";
    String urlRubenPena = "https://www.transfermarkt.es/ruben-pena/profil/spieler/238868";
    String urlCoquelin = "https://www.transfermarkt.es/francis-coquelin/profil/spieler/74869";
    String urlCapoue = "https://www.transfermarkt.es/etienne-capoue/profil/spieler/63494";
    String urlManuTrigueros = "https://www.transfermarkt.es/manu-trigueros/profil/spieler/188854";
    String urlDaniParejo = "transfermarkt.es/dani-parejo/profil/spieler/59561";
    String urlVicenteIborra = "https://www.transfermarkt.es/vicente-iborra/profil/spieler/65467";
    String urlMoiGomez = "https://www.transfermarkt.es/moi-gomez/profil/spieler/175449";
    String urlYeremy = "https://www.transfermarkt.es/yeremy/profil/spieler/568157";
    String urlAlexBaena = "https://www.transfermarkt.es/alex-baena/profil/spieler/548111";
    String urlChukwueze = "https://www.transfermarkt.es/samuel-chukwueze/profil/spieler/401922";
    String urlDaniRaba = "https://www.transfermarkt.es/dani-raba/profil/spieler/413262";
    String urlGerardMoreno = "https://www.transfermarkt.es/gerard-moreno/profil/spieler/177467";
    String urlPacoAlcacer = "https://www.transfermarkt.es/paco-alcacer/profil/spieler/126716";
    String urlFerNino = "https://www.transfermarkt.es/fer-nino/profil/spieler/627294";
    String urlCarlosBacca = "https://www.transfermarkt.es/carlos-bacca/profil/spieler/119235";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villarreal);

        btnSergioAsenjo = findViewById(R.id.btnSergioAsenjo);
        btnGeroRulli = findViewById(R.id.btnGeroRulli);
        btnPauTorres = findViewById(R.id.btnPauTorres);
        btnJuanFoyth = findViewById(R.id.btnJuanFoyth);
        btnRaulAlbiol = findViewById(R.id.btnRaulAlbiol);
        btnFunesMori = findViewById(R.id.btnFunesMori);
        btnFervisEstupinan = findViewById(R.id.btnFervisEstupinan);
        btnAlfonsoPedraza = findViewById(R.id.btnAlfonsoPedraza);
        btnAlbertoMoreno = findViewById(R.id.btnAlbertoMoreno);
        btnJaumeCosta = findViewById(R.id.btnJaumeCosta);
        btnMarioGaspar = findViewById(R.id.btnMarioGaspar);
        btnRubenPena = findViewById(R.id.btnRubenPena);
        btnCoquelin = findViewById(R.id.btnCoquelin);
        btnEtienneCapoue = findViewById(R.id.btnEtienneCapoue);
        btnManuTrigueros = findViewById(R.id.btnManuTrigueros);
        btnDaniParejo = findViewById(R.id.btnDaniParejo);
        btnVicenteIborra = findViewById(R.id.btnVicenteIborra);
        btnMoiGomez = findViewById(R.id.btnMoiGomez);
        btnYeremy = findViewById(R.id.btnYeremy);
        btnAlexBaena = findViewById(R.id.btnAlexBaena);
        btnSamuelChukwueze = findViewById(R.id.btnSamuelChukwueze);
        btnDaniRaba = findViewById(R.id.btnDaniRaba);
        btnGerardMoreno = findViewById(R.id.btnGerardMoreno);
        btnPacoAlcacer = findViewById(R.id.btnPacoAlcacer);
        btnFerNino = findViewById(R.id.btnFerNino);
        btnCarlosBacca = findViewById(R.id.btnCarlosBacca);

        btnSergioAsenjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioAsenjo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGeroRulli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGeroRulli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPauTorres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPauTorres);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanFoyth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanFoyth);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaulAlbiol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaulAlbiol);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFunesMori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRamiroFunesMori);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFervisEstupinan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEstupinan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlfonsoPedraza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlfonsoPedraza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlbertoMoreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlbertoMoreno);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaumeCosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaumeCosta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarioGaspar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarioGaspar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenPena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenPena);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCoquelin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCoquelin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEtienneCapoue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCapoue);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnManuTrigueros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlManuTrigueros);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniParejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniParejo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVicenteIborra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVicenteIborra);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMoiGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMoiGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYeremy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYeremy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexBaena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexBaena);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSamuelChukwueze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChukwueze);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniRaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniRaba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGerardMoreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGerardMoreno);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPacoAlcacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPacoAlcacer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFerNino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFerNino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosBacca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosBacca);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

    }
}