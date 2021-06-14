package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Huesca extends AppCompatActivity {

    Button btnAlvaroFernandez, btnAndresFernandez, btnAntonioValera, btnDenisVavro, btnDimitriosSiovas, btnJorgePulido, btnPabloInsua, btnJaviGalan, btnGastonSilva, btnLuisinho, btnPabloMaffeo, btnPedroLopez, btnIdrissaDoumbia, btnJaimSeoane, btnPedroMosquera, btnMikelRico, btnSergioGomez, btnBorjaGarcia, btnEugeniValderrama, btnJuanCarlosReal, btnJaviOntiveros, btnDavidFerreiro, btnRafaMir, btnSandroRamirez, btnShinjiOkazaki, btnDaniEscriche;

    String urlAlvaroFernandez = "https://www.transfermarkt.es/alvaro-fernandez/profil/spieler/453704";
    String urlAndresFernandez = "https://www.transfermarkt.es/andres-fernandez/profil/spieler/57522";
    String urlAntonioValera = "https://www.transfermarkt.es/antonio-valera/profil/spieler/290275";
    String urlDenisVavro = "https://www.transfermarkt.es/denis-vavro/profil/spieler/239962";
    String urlDimitriosSiovas = "https://www.transfermarkt.es/dimitrios-siovas/profil/spieler/52403";
    String urlJorgePulido = "https://www.transfermarkt.es/jorge-pulido/profil/spieler/67546";
    String urlPabloInsua = "https://www.transfermarkt.es/pablo-insua/profil/spieler/171362";
    String urlJaviGalan = "https://www.transfermarkt.es/javi-galan/profil/spieler/448628";
    String urlGastonSilva = "https://www.transfermarkt.es/gaston-silva/profil/spieler/189452";
    String urlLuisinho = "https://www.transfermarkt.es/luisinho/profil/spieler/56777";
    String urlPabloMaffeo = "https://www.transfermarkt.es/pablo-maffeo/profil/spieler/251876";
    String urlPedroLopez = "https://www.transfermarkt.es/pedro-lopez/profil/spieler/25412";
    String urlidrissaDoumbia = "https://www.transfermarkt.es/idrissa-doumbia/profil/spieler/430579";
    String urlJaimeSeoane = "https://www.transfermarkt.es/jaime-seoane/profil/spieler/340867";
    String urlPedroMosquera = "https://www.transfermarkt.es/pedro-mosquera/profil/spieler/44069";
    String urlMikelRico = "https://www.transfermarkt.es/mikel-rico/profil/spieler/51474";
    String urlSergioGomez = "https://www.transfermarkt.es/sergio-gomez/profil/spieler/366930";
    String urlBorjaGarcia = "https://www.transfermarkt.es/borja-garcia/profil/spieler/67808";
    String urlValderrama = "https://www.transfermarkt.es/eugeni-valderrama/profil/spieler/223073";
    String urlJuanCarlosReal = "https://www.transfermarkt.es/juan-carlos-real/profil/spieler/201861";
    String urlOntiveros = "https://www.transfermarkt.es/javi-ontiveros/profil/spieler/298983";
    String urlDavidFerreiro = "https://www.transfermarkt.es/david-ferreiro/profil/spieler/71918";
    String urlRafaMir = "https://www.transfermarkt.es/rafa-mir/profil/spieler/361254";
    String urlSandroRamirez = "https://www.transfermarkt.es/sandro-ramirez/profil/spieler/199369";
    String urlOkazaki = "https://www.transfermarkt.es/shinji-okazaki/profil/spieler/79642";
    String urlDaniEscriche = "https://www.transfermarkt.es/dani-escriche/profil/spieler/531829";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huesca);

        btnAlvaroFernandez = findViewById(R.id.btnAlvaroFernandez);
        btnAndresFernandez = findViewById(R.id.btnAndresFernandez);
        btnAntonioValera = findViewById(R.id.btnAntonioValera);
        btnDenisVavro = findViewById(R.id.btnDenisVavro);
        btnDimitriosSiovas = findViewById(R.id.btnDimitriosSiovas);
        btnJorgePulido = findViewById(R.id.btnJorgePulido);
        btnPabloInsua = findViewById(R.id.btnPabloInsua);
        btnJaviGalan = findViewById(R.id.btnJaviGalan);
        btnGastonSilva = findViewById(R.id.btnGastonSilva);
        btnLuisinho = findViewById(R.id.btnLuisinho);
        btnPabloMaffeo = findViewById(R.id.btnPabloMaffeo);
        btnPedroLopez = findViewById(R.id.btnPedroLopez);
        btnIdrissaDoumbia = findViewById(R.id.btnIdrissaDoumbia);
        btnJaimSeoane = findViewById(R.id.btnJaimSeoane);
        btnPedroMosquera = findViewById(R.id.btnPedroMosquera);
        btnMikelRico = findViewById(R.id.btnMikelRico);
        btnSergioGomez = findViewById(R.id.btnSergioGomez);
        btnBorjaGarcia = findViewById(R.id.btnBorjaGarcia);
        btnEugeniValderrama = findViewById(R.id.btnEugeniValderrama);
        btnJuanCarlosReal = findViewById(R.id.btnJuanCarlosReal);
        btnJaviOntiveros = findViewById(R.id.btnJaviOntiveros);
        btnDavidFerreiro = findViewById(R.id.btnDavidFerreiro);
        btnRafaMir = findViewById(R.id.btnRafaMir);
        btnSandroRamirez = findViewById(R.id.btnSandroRamirez);
        btnShinjiOkazaki = findViewById(R.id.btnShinjiOkazaki);
        btnDaniEscriche = findViewById(R.id.btnDaniEscriche);

        btnAlvaroFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlvaroFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndresFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndresFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonioValera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonioValera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDenisVavro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDenisVavro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDimitriosSiovas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDimitriosSiovas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorgePulido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorgePulido);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloInsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloInsua);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviGalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviGalan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGastonSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGastonSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuisinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuisinho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloMaffeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloMaffeo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroLopez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIdrissaDoumbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlidrissaDoumbia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaimSeoane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaimeSeoane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroMosquera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroMosquera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMikelRico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMikelRico);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBorjaGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBorjaGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEugeniValderrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlValderrama);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanCarlosReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanCarlosReal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviOntiveros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOntiveros);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidFerreiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidFerreiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRafaMir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRafaMir);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSandroRamirez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSandroRamirez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShinjiOkazaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOkazaki);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniEscriche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniEscriche);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });





    }
}