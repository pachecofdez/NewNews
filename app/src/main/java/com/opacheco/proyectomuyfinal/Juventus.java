package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Juventus extends AppCompatActivity {

    Button btnSczesny, btnBuffon, btnPinsoglio, btnDeLigt, btnDemiral, btnBonucci, btnDragustin, btnChiellini, btnAlexSandro, btnFrabotta, btnDanilo, btnCuadrado, btnArthur, btnBentancur, btnRabiot, btnMckennie, btnRamsey, btnFagioli, btnChiesa, btnKulusevski, btnBernardeschi, btnDybala, btnRonaldo, btnMorata;

    String urlSczesny = "https://www.transfermarkt.es/wojciech-szczesny/profil/spieler/44058";
    String urlBuffon = "https://www.transfermarkt.es/gianluigi-buffon/profil/spieler/5023";
    String urlPinsoglio = "https://www.transfermarkt.es/carlo-pinsoglio/profil/spieler/75411";
    String urlDeLigt = "https://www.transfermarkt.es/matthijs-de-ligt/profil/spieler/326031";
    String urlDemiral = "https://www.transfermarkt.es/merih-demiral/profil/spieler/340879";
    String urlBonucci = "https://www.transfermarkt.es/leonardo-bonucci/profil/spieler/39983";
    String urlDragustin = "https://www.transfermarkt.es/radu-dragusin/profil/spieler/568559";
    String urlChiellini = "https://www.transfermarkt.es/giorgio-chiellini/profil/spieler/29260";
    String urlAlexSandro = "https://www.transfermarkt.es/alex-sandro/profil/spieler/79960";
    String urlFrabotta = "https://www.transfermarkt.es/gianluca-frabotta/profil/spieler/386755";
    String urlDanilo = "https://www.transfermarkt.es/danilo/profil/spieler/145707";
    String urlCuadrado = "https://www.transfermarkt.es/juan-cuadrado/profil/spieler/91970";
    String urlArthur = "https://www.transfermarkt.es/arthur/profil/spieler/362842";
    String urlBentancur = "https://www.transfermarkt.es/rodrigo-bentancur/profil/spieler/354362";
    String urlRabiot = "https://www.transfermarkt.es/adrien-rabiot/profil/spieler/182913";
    String urlMcKennie = "https://www.transfermarkt.es/weston-mckennie/profil/spieler/332697";
    String urlRamsey = "https://www.transfermarkt.es/aaron-ramsey/profil/spieler/50057";
    String urlFagioli = "https://www.transfermarkt.es/nicolo-fagioli/profil/spieler/432090";
    String urlChiesa = "https://www.transfermarkt.es/federico-chiesa/profil/spieler/341092";
    String urlKulusevski= "https://www.transfermarkt.es/dejan-kulusevski/profil/spieler/431755";
    String urlBernardeschi = "https://www.transfermarkt.es/federico-bernardeschi/profil/spieler/197300";
    String urlDybala = "https://www.transfermarkt.es/paulo-dybala/profil/spieler/206050";
    String urlRonaldo = "https://www.transfermarkt.es/cristiano-ronaldo/profil/spieler/8198";
    String urlMorata = "https://www.transfermarkt.es/alvaro-morata/profil/spieler/128223";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juventus);


        btnSczesny = findViewById(R.id.btnSczesny);
        btnBuffon = findViewById(R.id.btnBuffon);
        btnPinsoglio = findViewById(R.id.btnPinsoglio);
        btnDeLigt = findViewById(R.id.btnDeLigt);
        btnDemiral = findViewById(R.id.btnDemiral);
        btnBonucci = findViewById(R.id.btnBonucci);
        btnDragustin = findViewById(R.id.btnDragustin);
        btnChiellini = findViewById(R.id.btnChiellini);
        btnAlexSandro = findViewById(R.id.btnAlexSandro);
        btnFrabotta = findViewById(R.id.btnFrabotta);
        btnDanilo = findViewById(R.id.btnDanilo);
        btnCuadrado = findViewById(R.id.btnCuadrado);
        btnArthur = findViewById(R.id.btnArthur);
        btnBentancur = findViewById(R.id.btnBentancur);
        btnRabiot = findViewById(R.id.btnRabiot);
        btnMckennie = findViewById(R.id.btnMckennie);
        btnRamsey = findViewById(R.id.btnRamsey);
        btnFagioli = findViewById(R.id.btnFagioli);
        btnChiesa = findViewById(R.id.btnChiesa);
        btnKulusevski = findViewById(R.id.btnKulusevski);
        btnBernardeschi = findViewById(R.id.btnBernardeschi);
        btnDybala = findViewById(R.id.btnDybala);
        btnRonaldo = findViewById(R.id.btnRonaldo);
        btnMorata = findViewById(R.id.btnMorata);

        btnSczesny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSczesny);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnBuffon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBuffon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPinsoglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPinsoglio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeLigt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeLigt);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDemiral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDemiral);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBonucci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBonucci);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDragustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDragustin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnChiellini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChiellini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexSandro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexSandro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnFrabotta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFrabotta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnDanilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanilo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCuadrado);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnArthur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlArthur);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBentancur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBentancur);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRabiot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRabiot);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMckennie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcKennie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRamsey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRamsey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFagioli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFagioli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChiesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChiesa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKulusevski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKulusevski);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBernardeschi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBernardeschi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDybala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDybala);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRonaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRonaldo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMorata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMorata);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });









    }




}