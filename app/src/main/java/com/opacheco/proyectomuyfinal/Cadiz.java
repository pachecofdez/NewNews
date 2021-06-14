package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadiz extends AppCompatActivity {

    Button btnJeremiasLedesma, btnDavidGil, btnFali, btnJuanCala, btnMarcosMauro, btnPedroAlcala, btnAlfonsoEspino, btnIzaCarcelen, btnCarlosAkapo, btnJensJonsson, btnJonAnderGarrido, btnJoseMari, btnAugustoFernandez, btnJorgePombo, btnAlbertoPerea, btnJairoIzquierdo, btnSalviSanchez, btnIvanAlejo, btnFilipMalbasic, btnChocoLozano, btnRubenSobrino, btnIvanSaponjic, btnAlvaroNegredo;

    String urlJeremiasLedesma = "https://www.transfermarkt.es/jeremias-ledesma/profil/spieler/284342";
    String urlDavidGil = "https://www.transfermarkt.es/david-gil/profil/spieler/162027";
    String urlFali = "https://www.transfermarkt.es/fali/profil/spieler/252667";
    String urlJuanCala = "https://www.transfermarkt.es/juan-cala/profil/spieler/67089";
    String urlMarcosMauro = "https://www.transfermarkt.es/marcos-mauro/profil/spieler/247366";
    String urlPedroAlcala = "https://www.transfermarkt.es/pedro-alcala/profil/spieler/51663";
    String urlAlfonsoEspino = "https://www.transfermarkt.es/alfonso-espino/profil/spieler/311044";
    String urlIzaCarcelen = "https://www.transfermarkt.es/iza-carcelen/profil/spieler/254037";
    String urlCarlosAkapo = "https://www.transfermarkt.es/carlos-akapo/profil/spieler/225015";
    String urlJensJonsson = "https://www.transfermarkt.es/jens-jonsson/profil/spieler/148355";
    String urlJonAnderGarrido = "https://www.transfermarkt.es/jon-ander-garrido/profil/spieler/158704";
    String urlJoseMari = "https://www.transfermarkt.es/jose-mari/profil/spieler/225462";
    String urlAugustoFernandez = "https://www.transfermarkt.es/augusto-fernandez/profil/spieler/39151";
    String urlAlexFernandez = "https://www.transfermarkt.es/alex-fernandez/profil/spieler/89733";
    String urlJorgePombo = "https://www.transfermarkt.es/jorge-pombo/profil/spieler/336747";
    String urlAlbertoPerea = "https://www.transfermarkt.es/alberto-perea/profil/spieler/99559";
    String urlJairoIzquierda = "https://www.transfermarkt.es/jairo-izquierdo/profil/spieler/337946";
    String urlSalviSanchez = "https://www.transfermarkt.es/salvi-sanchez/profil/spieler/246204";
    String urlIvanAlejo = "https://www.transfermarkt.es/ivan-alejo/profil/spieler/281755";
    String urlFlipMalbasic = "https://www.transfermarkt.es/filip-malbasic/profil/spieler/162652";
    String urlChocoLozano = "https://www.transfermarkt.es/choco-lozano/profil/spieler/131275";
    String urlRubenSobrino = "https://www.transfermarkt.es/ruben-sobrino/profil/spieler/85383";
    String urlIvanSaponjic = "https://www.transfermarkt.es/ivan-saponjic/profil/spieler/274347";
    String urlAlvaroNegredo = "https://www.transfermarkt.es/alvaro-negredo/profil/spieler/18644";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadiz);

        btnJeremiasLedesma = findViewById(R.id.btnJeremiasLedesma);
        btnDavidGil = findViewById(R.id.btnDavidGil);
        btnFali = findViewById(R.id.btnFali);
        btnJuanCala = findViewById(R.id.btnJuanCala);
        btnMarcosMauro = findViewById(R.id.btnMarcosMauro);
        btnPedroAlcala = findViewById(R.id.btnPedroAlcala);
        btnAlfonsoEspino = findViewById(R.id.btnAlfonsoEspino);
        btnIzaCarcelen = findViewById(R.id.btnIzaCarcelen);
        btnCarlosAkapo = findViewById(R.id.btnCarlosAkapo);
        btnJensJonsson = findViewById(R.id.btnJensJonsson);
        btnJonAnderGarrido = findViewById(R.id.btnJonAnderGarrido);
        btnJoseMari = findViewById(R.id.btnJoseMari);
        btnAugustoFernandez = findViewById(R.id.btnAugustoFernandez);
        btnAlbertoPerea = findViewById(R.id.btnAlbertoPerea);
        btnJairoIzquierdo = findViewById(R.id.btnJairoIzquierdo);
        btnSalviSanchez = findViewById(R.id.btnSalviSanchez);
        btnIvanAlejo = findViewById(R.id.btnIvanAlejo);
        btnFilipMalbasic = findViewById(R.id.btnFilipMalbasic);
        btnChocoLozano = findViewById(R.id.btnChocoLozano);
        btnRubenSobrino = findViewById(R.id.btnRubenSobrino);
        btnIvanSaponjic = findViewById(R.id.btnIvanSaponjic);
        btnAlvaroNegredo = findViewById(R.id.btnAlvaroNegredo);

        btnJeremiasLedesma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJeremiasLedesma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidGil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidGil);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFali);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanCala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanCala);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcosMauro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcosMauro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedroAlcala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedroAlcala);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlfonsoEspino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlfonsoEspino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIzaCarcelen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIzaCarcelen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosAkapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosAkapo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJensJonsson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJensJonsson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonAnderGarrido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonAnderGarrido);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoseMari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoseMari);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAugustoFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAugustoFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlbertoPerea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlbertoPerea);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJairoIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJairoIzquierda);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSalviSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSalviSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIvanAlejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIvanAlejo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFilipMalbasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFlipMalbasic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChocoLozano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChocoLozano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenSobrino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenSobrino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIvanSaponjic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIvanSaponjic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlvaroNegredo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlvaroNegredo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}