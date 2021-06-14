package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leicester extends AppCompatActivity {

    Button btnSchmeichel, btnDannyWard, btnJakupovic, btnCaglarSoyuncu, btnWesleyFofana, btnJonnyEvans, btnDanielAmartey, btnWesMorgan, btnLukeThomas, btnChristianFuchs, btnRicardoPereira, btnCastagne, btnJamesJustin, btnNdidi, btnChoudhury, btnNampalysMendy, btnTielemans, btnPraet, btnAlbrighton, btnBarnes, btnMaddison, btnCengiz, btnAyozePerez, btnIheanancho, btnVardy;


    String urlSchmeichel = "https://www.transfermarkt.es/kasper-schmeichel/profil/spieler/16911";
    String urlDannyWard = "https://www.transfermarkt.es/danny-ward/profil/spieler/203026";
    String urlJakupovic = "https://www.transfermarkt.es/eldin-jakupovic/profil/spieler/2857";
    String urlCaglarSoyuncu = "https://www.transfermarkt.es/caglar-soyuncu/profil/spieler/320141";
    String urlWesleyFofana = "https://www.transfermarkt.es/wesley-fofana/profil/spieler/475411";
    String urlJonnyEvans = "https://www.transfermarkt.es/jonny-evans/profil/spieler/42412";
    String urlDanielAmartey = "https://www.transfermarkt.es/daniel-amartey/profil/spieler/214056";
    String urlWesMorgan = "https://www.transfermarkt.es/wes-morgan/profil/spieler/10003";
    String urlLukeThomas = "https://www.transfermarkt.es/luke-thomas/profil/spieler/505194";
    String urlChristianFuchs = "https://www.transfermarkt.es/christian-fuchs/profil/spieler/6636";
    String urlRicardoPereira = "https://www.transfermarkt.es/ricardo-pereira/profil/spieler/215876";
    String urlCastagne = "https://www.transfermarkt.es/timothy-castagne/profil/spieler/262226";
    String urlJamesJustin = "https://www.transfermarkt.es/james-justin/profil/spieler/413220";
    String urlNdidi = "https://www.transfermarkt.es/wilfred-ndidi/profil/spieler/274839";
    String urlChoudhury = "https://www.transfermarkt.es/hamza-choudhury/profil/spieler/341501";
    String urlNampalysMendy = "https://www.transfermarkt.es/nampalys-mendy/profil/spieler/111051";
    String urlTielemans = "https://www.transfermarkt.es/youri-tielemans/profil/spieler/249565";
    String urlPraet = "https://www.transfermarkt.es/dennis-praet/profil/spieler/129588";
    String urlAlbrighton = "https://www.transfermarkt.es/marc-albrighton/profil/spieler/61560";
    String urlBarnes = "https://www.transfermarkt.es/harvey-barnes/profil/spieler/398065";
    String urlMaddison = "https://www.transfermarkt.es/james-maddison/profil/spieler/294057";
    String urlengiz = "https://www.transfermarkt.es/cengiz-under/profil/spieler/341647";
    String urlAyozePerez = "https://www.transfermarkt.es/ayoze-perez/profil/spieler/246968";
    String urlIheanancho = "https://www.transfermarkt.es/kelechi-iheanacho/profil/spieler/295330";
    String urlVardy = "https://www.transfermarkt.es/jamie-vardy/profil/spieler/197838";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leicester);

        btnSchmeichel = findViewById(R.id.btnSchmeichel);
        btnDannyWard = findViewById(R.id.btnDannyWard);
        btnJakupovic = findViewById(R.id.btnJakupovic);
        btnCaglarSoyuncu = findViewById(R.id.btnCaglarSoyuncu);
        btnWesleyFofana = findViewById(R.id.btnWesleyFofana);
        btnJonnyEvans = findViewById(R.id.btnJonnyEvans);
        btnDanielAmartey = findViewById(R.id.btnDanielAmartey);
        btnWesMorgan = findViewById(R.id.btnWesMorgan);
        btnLukeThomas = findViewById(R.id.btnLukeThomas);
        btnChristianFuchs = findViewById(R.id.btnChristianFuchs);
        btnRicardoPereira = findViewById(R.id.btnRicardoPereira);
        btnCastagne = findViewById(R.id.btnCastagne);
        btnJamesJustin = findViewById(R.id.btnJamesJustin);
        btnNdidi = findViewById(R.id.btnNdidi);
        btnChoudhury = findViewById(R.id.btnChoudhury);
        btnNampalysMendy = findViewById(R.id.btnNampalysMendy);
        btnTielemans = findViewById(R.id.btnTielemans);
        btnPraet = findViewById(R.id.btnPraet);
        btnAlbrighton = findViewById(R.id.btnAlbrighton);
        btnBarnes = findViewById(R.id.btnBarnes);
        btnMaddison = findViewById(R.id.btnMaddison);
        btnCengiz = findViewById(R.id.btnCengiz);
        btnAyozePerez = findViewById(R.id.btnAyozePerez);
        btnIheanancho = findViewById(R.id.btnIheanancho);
        btnVardy = findViewById(R.id.btnVardy);

        btnSchmeichel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSchmeichel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDannyWard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDannyWard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJakupovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJakupovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCaglarSoyuncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCaglarSoyuncu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWesleyFofana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWesleyFofana);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonnyEvans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonnyEvans);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDanielAmartey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanielAmartey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWesMorgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWesMorgan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLukeThomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLukeThomas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChristianFuchs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChristianFuchs);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRicardoPereira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRicardoPereira);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCastagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCastagne);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnJamesJustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJamesJustin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnNdidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNdidi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChoudhury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChoudhury);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNampalysMendy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNampalysMendy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTielemans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTielemans);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPraet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPraet);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlbrighton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlbrighton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBarnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBarnes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaddison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaddison);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCengiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlengiz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAyozePerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAyozePerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIheanancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIheanancho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVardy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVardy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });





    }
}