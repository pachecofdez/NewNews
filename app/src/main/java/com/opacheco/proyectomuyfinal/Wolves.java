package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wolves extends AppCompatActivity {

    Button btnRuiPatricio, btnRuddy, btnSoncergaard, btnCoady, btnWillyBoly, btnRomainSaiss, btnKilman, btnNouri, btnJonnyOtto, btnMarcal, btnSemedo, btnHoever, btnMatheson, btnRubenNeves, btnDendoncker, btnOtasowie, btnGibbsWhite, btnMoutinho, btnVitinha, btnPedroNeto, btnAdamaTraore, btnDanielPodence, btnRaulJimenez, btnFabioSilva, btnWillianJose, btnDadashov;


    String urlRuiPatricio = "https://www.transfermarkt.es/rui-patricio/profil/spieler/45026";
    String urlRuddy = "https://www.transfermarkt.es/john-ruddy/profil/spieler/29712";
    String urlSoncergaard = "https://www.transfermarkt.es/andreas-sondergaard/profil/spieler/462820";
    String urlCoady = "https://www.transfermarkt.es/conor-coady/profil/spieler/128901";
    String urlWillyBoly = "https://www.transfermarkt.es/willy-boly/profil/spieler/142310";
    String urlRomainSaiss = "https://www.transfermarkt.es/romain-saiss/profil/spieler/204198";
    String urlKilman = "https://www.transfermarkt.es/max-kilman/profil/spieler/525247";
    String urlNouri = "https://www.transfermarkt.es/rayan-ait-nouri/profil/spieler/578391";
    String urlJonnyOtto = "https://www.transfermarkt.es/jonny-otto/profil/spieler/175446";
    String urlMarcal = "https://www.transfermarkt.es/marcal/profil/spieler/137745";
    String urlSemedo = "https://www.transfermarkt.es/nelson-semedo/profil/spieler/231572";
    String urlHoever= "https://www.transfermarkt.es/ki-jana-hoever/profil/spieler/485583" ;
    String urlMatheson = "https://www.transfermarkt.es/luke-matheson/profil/spieler/614084";
    String urlRubenNeves = "https://www.transfermarkt.es/ruben-neves/profil/spieler/225161";
    String urlDendoncker = "https://www.transfermarkt.es/leander-dendoncker/profil/spieler/168157";
    String urlOtasowie = "https://www.transfermarkt.es/owen-otasowie/profil/spieler/511815";
    String urlGibbsWhite = "https://www.transfermarkt.es/morgan-gibbs-white/profil/spieler/429014";
    String urlMoutinho = "https://www.transfermarkt.es/joao-moutinho/profil/spieler/29364";
    String urlVitinha= "https://www.transfermarkt.es/vitinha/profil/spieler/487469" ;
    String urlPedroNeto = "https://www.transfermarkt.es/pedro-neto/profil/spieler/487465";
    String urlAdamaTraore = "https://www.transfermarkt.es/adama-traore/profil/spieler/204103";
    String urlDanielPodence = "https://www.transfermarkt.es/daniel-podence/profil/spieler/256977";
    String urlRaulJimenez = "https://www.transfermarkt.es/raul-jimenez/profil/spieler/206040";
    String urlFabioSilva = "https://www.transfermarkt.es/fabio-silva/profil/spieler/505653";
    String urlWillianJose = "https://www.transfermarkt.es/willian-jose/profil/spieler/122155";
    String urlDadashov = "https://www.transfermarkt.es/renat-dadashov/profil/spieler/335461";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wolves);

        btnRuiPatricio = findViewById(R.id.btnRuiPatricio);
        btnRuddy = findViewById(R.id.btnRuddy);
        btnSoncergaard = findViewById(R.id.btnSoncergaard);
        btnCoady = findViewById(R.id.btnCoady);
        btnWillyBoly = findViewById(R.id.btnWillyBoly);
        btnRomainSaiss = findViewById(R.id.btnRomainSaiss);
        btnKilman = findViewById(R.id.btnKilman);
        btnNouri = findViewById(R.id.btnNouri);
        btnJonnyOtto = findViewById(R.id.btnJonnyOtto);
        btnMarcal = findViewById(R.id.btnMarcal);
        btnSemedo = findViewById(R.id.btnSemedo);
        btnHoever = findViewById(R.id.btnHoever);
        btnMatheson = findViewById(R.id.btnMatheson);
        btnRubenNeves = findViewById(R.id.btnRubenNeves);
        btnDendoncker = findViewById(R.id.btnDendoncker);
        btnOtasowie = findViewById(R.id.btnOtasowie);
        btnGibbsWhite = findViewById(R.id.btnGibbsWhite);
        btnMoutinho = findViewById(R.id.btnMoutinho);
        btnVitinha = findViewById(R.id.btnVitinha);
        btnPedroNeto = findViewById(R.id.btnPedroNeto);
        btnAdamaTraore = findViewById(R.id.btnAdamaTraore);
        btnDanielPodence = findViewById(R.id.btnDanielPodence);
        btnRaulJimenez = findViewById(R.id.btnRaulJimenez);
        btnFabioSilva = findViewById(R.id.btnFabioSilva);
        btnWillianJose = findViewById(R.id.btnWillianJose);
        btnDadashov = findViewById(R.id.btnDadashov);


        btnRuiPatricio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRuiPatricio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRuddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRuddy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSoncergaard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSoncergaard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCoady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCoady);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWillyBoly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWillyBoly);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRomainSaiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRomainSaiss);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKilman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKilman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNouri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNouri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonnyOtto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonnyOtto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSemedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSemedo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHoever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHoever);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMatheson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMatheson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenNeves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenNeves);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDendoncker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDendoncker);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOtasowie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOtasowie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGibbsWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGibbsWhite);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMoutinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMoutinho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVitinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVitinha);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroNeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroNeto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdamaTraore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdamaTraore);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDanielPodence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanielPodence);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaulJimenez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaulJimenez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFabioSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFabioSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWillianJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWillianJose);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDadashov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDadashov);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}