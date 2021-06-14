package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Granada extends AppCompatActivity {

    Button btnRuiSilva, btnAaronEscandell, btnArnauFabrega, btnDomingosDuarte, btnJesusVallejo, btnNehuenPerez, btnGermanSanchez, btnNeyderLozano, btnCarlosNeva, btnAdrianMarin, btnDimitriFoulquier, btnVictorDiaz, btnQuini, btnPepeSanchez, btnMaximeGonalons, btnYangelHerrera, btnLuisMilla, btnDomingosQuina, btnYanEteki, btnAngelMontoro, btnFedeVico, btnDarwinMachis, btnKenedy, btnAntonioPuertas, btnAlbertoSoro, btnLuisSuarez, btnJorgeMolina, btnRobertoSoldado;


    String urlRuiSilva = "https://www.transfermarkt.es/rui-silva/profil/spieler/234811";
    String urlAaronEscandell = "https://www.transfermarkt.es/aaron-escandell/profil/spieler/284430";
    String urlArnauFabrega = "https://www.transfermarkt.es/arnau-fabrega/profil/spieler/575472";
    String urlDomingosDuarte = "https://www.transfermarkt.es/domingos-duarte/profil/spieler/257376";
    String urlJesusVallejo = "https://www.transfermarkt.es/jesus-vallejo/profil/spieler/251896";
    String urlNehuenPerez = "https://www.transfermarkt.es/nehuen-perez/profil/spieler/491693";
    String urlGermanSanchez = "https://www.transfermarkt.es/german-sanchez/profil/spieler/95963";
    String urlNeyderLozano = "https://www.transfermarkt.es/neyder-lozano/profil/spieler/468700";
    String urlCarlosNeva = "https://www.transfermarkt.es/carlos-neva/profil/spieler/448844";
    String urlAdrianMarin = "https://www.transfermarkt.es/adrian-marin/profil/spieler/295414";
    String urlDimitriFoulquier = "https://www.transfermarkt.es/dimitri-foulquier/profil/spieler/170472";
    String urlVictorDiaz = "https://www.transfermarkt.es/victor-diaz/profil/spieler/58330";
    String urlQuini = "https://www.transfermarkt.es/quini/profil/spieler/223053";
    String urlPepeSanchez = "https://www.transfermarkt.es/pepe-sanchez/profil/spieler/500191";
    String urlMaximeGonalons = "https://www.transfermarkt.es/maxime-gonalons/profil/spieler/60542";
    String urlYangelHerrera = "https://www.transfermarkt.es/yangel-herrera/profil/spieler/378293";
    String urlLuisMilla = "https://www.transfermarkt.es/luis-milla/profil/spieler/281989";
    String urlDomingosQuina = "https://www.transfermarkt.es/domingos-quina/profil/spieler/391719";
    String urlYanEteki = "https://www.transfermarkt.es/yan-eteki/profil/spieler/297784";
    String urlAngelMontoro = "https://www.transfermarkt.es/angel-montoro/profil/spieler/59551";
    String urlFedeVico = "https://www.transfermarkt.es/fede-vico/profil/spieler/162079";
    String urlDarwinMachis = "https://www.transfermarkt.es/darwin-machis/profil/spieler/211251";
    String urlKenedy = "https://www.transfermarkt.es/kenedy/profil/spieler/281404";
    String urlAntonioPuertas = "https://www.transfermarkt.es/antonio-puertas/profil/spieler/262365";
    String urlAlbertoSoro = "https://www.transfermarkt.es/alberto-soro/profil/spieler/487688";
    String urlLuisSuarez = "https://www.transfermarkt.es/luis-suarez/profil/spieler/424784";
    String urlJorgeMolina = "https://www.transfermarkt.es/jorge-molina/profil/spieler/57825";
    String urlRobertoSoldado = "https://www.transfermarkt.es/roberto-soldado/profil/spieler/34870";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_granada);

        btnRuiSilva = findViewById(R.id.btnRuiSilva);
        btnAaronEscandell = findViewById(R.id.btnAaronEscandell);
        btnArnauFabrega = findViewById(R.id.btnArnauFabrega);
        btnDomingosDuarte = findViewById(R.id.btnDomingosDuarte);
        btnJesusVallejo = findViewById(R.id.btnJesusVallejo);
        btnNehuenPerez = findViewById(R.id.btnNehuenPerez);
        btnGermanSanchez = findViewById(R.id.btnGermanSanchez);
        btnNeyderLozano = findViewById(R.id.btnNeyderLozano);
        btnCarlosNeva = findViewById(R.id.btnCarlosNeva);
        btnAdrianMarin = findViewById(R.id.btnAdrianMarin);
        btnDimitriFoulquier = findViewById(R.id.btnDimitriFoulquier);
        btnVictorDiaz = findViewById(R.id.btnVictorDiaz);
        btnQuini = findViewById(R.id.btnQuini);
        btnPepeSanchez = findViewById(R.id.btnPepeSanchez);
        btnMaximeGonalons = findViewById(R.id.btnMaximeGonalons);
        btnYangelHerrera = findViewById(R.id.btnYangelHerrera);
        btnLuisMilla = findViewById(R.id.btnLuisMilla);
        btnDomingosQuina = findViewById(R.id.btnDomingosQuina);
        btnYanEteki = findViewById(R.id.btnYanEteki);
        btnAngelMontoro = findViewById(R.id.btnAngelMontoro);
        btnFedeVico = findViewById(R.id.btnFedeVico);
        btnDarwinMachis = findViewById(R.id.btnDarwinMachis);
        btnKenedy = findViewById(R.id.btnKenedy);
        btnAntonioPuertas = findViewById(R.id.btnAntonioPuertas);
        btnAlbertoSoro = findViewById(R.id.btnAlbertoSoro);
        btnLuisSuarez = findViewById(R.id.btnLuisSuarez);
        btnJorgeMolina = findViewById(R.id.btnJorgeMolina);
        btnRobertoSoldado = findViewById(R.id.btnRobertoSoldado);

        btnRuiSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRuiSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAaronEscandell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAaronEscandell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnArnauFabrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlArnauFabrega);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDomingosDuarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDomingosDuarte);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJesusVallejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJesusVallejo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNehuenPerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNehuenPerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGermanSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGermanSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNeyderLozano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNeyderLozano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosNeva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosNeva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdrianMarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdrianMarin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDimitriFoulquier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDimitriFoulquier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVictorDiaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVictorDiaz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnQuini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlQuini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPepeSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPepeSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaximeGonalons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaximeGonalons);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYangelHerrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYangelHerrera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuisMilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuisMilla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDomingosQuina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDomingosQuina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYanEteki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYanEteki);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAngelMontoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAngelMontoro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFedeVico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFedeVico);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarwinMachis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarwinMachis);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKenedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKenedy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonioPuertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonioPuertas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlbertoSoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlbertoSoro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuisSuarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuisSuarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorgeMolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorgeMolina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobertoSoldado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertoSoldado);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}