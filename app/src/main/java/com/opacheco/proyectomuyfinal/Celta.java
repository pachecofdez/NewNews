package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Celta extends AppCompatActivity {

    Button btnRubenBlanco, btnIvanVillar, btnSergioAlvarez, btnNestorAraujo, btnJosephAidoo, btnJeisonMurillo, btnDavidCostas, btnJorgeSaenz, btnAaronMartin, btnDavidJunca, btnHugoMallo, btnKevinVazquez, btnRenatoTapia, btnFranBeltran, btnDenisSuarez, btnMiguelBaeza, btnNolito, btnBraisMendez, btnAugustoSolari, btnEmreMor, btnMiguelRodriguez, btnSantiMina, btnIagoAspas, btnFacundoFerreyra;

    String urlRubenBlanco = "https://www.transfermarkt.es/ruben-blanco/profil/spieler/199321";
    String urlIvanVillar = "https://www.transfermarkt.es/ivan-villar/profil/spieler/297194";
    String urlSergioAlvarez = "https://www.transfermarkt.es/sergio-alvarez/profil/spieler/45912";
    String urlNestorAraujo = "https://www.transfermarkt.es/nestor-araujo/profil/spieler/64134";
    String urlJosephAidoo = "https://www.transfermarkt.es/joseph-aidoo/profil/spieler/358250";
    String urlJeisonMurillo = "https://www.transfermarkt.es/jeison-murillo/profil/spieler/131102";
    String urlDavidCostas = "https://www.transfermarkt.es/david-costas/profil/spieler/276111";
    String urlJorgeSaenz = "https://www.transfermarkt.es/jorge-saenz/profil/spieler/340339";
    String urlAaronMartin = "https://www.transfermarkt.es/aaron-martin/profil/spieler/251878";
    String urlDavidJunca = "https://www.transfermarkt.es/david-junca/profil/spieler/164055";
    String urlHugoMallo = "https://www.transfermarkt.es/hugo-mallo/profil/spieler/119905";
    String urlKevinVazquez = "https://www.transfermarkt.es/kevin-vazquez/profil/spieler/221315";
    String urlRenatoTapia = "https://www.transfermarkt.es/renato-tapia/profil/spieler/277137";
    String urlFranBeltran = "https://www.transfermarkt.es/fran-beltran/profil/spieler/423444";
    String urlDenisSuarez = "https://www.transfermarkt.es/denis-suarez/profil/spieler/165007";
    String urlMiguelBaeza = "https://www.transfermarkt.es/miguel-baeza/profil/spieler/523977";
    String urlNolito = "https://www.transfermarkt.es/nolito/profil/spieler/70934";
    String urlBraisMendez = "https://www.transfermarkt.es/brais-mendez/profil/spieler/309110";
    String urlAugustoSolari = "https://www.transfermarkt.es/augusto-solari/profil/spieler/282694";
    String urlEmreMor = "https://www.transfermarkt.es/emre-mor/profil/spieler/283223";
    String urlMiguelRodriguez = "https://www.transfermarkt.es/miguel-rodriguez/profil/spieler/634427";
    String urlSantiMina = "https://www.transfermarkt.es/santi-mina/profil/spieler/255653";
    String urlIagoAspas = "https://www.transfermarkt.es/iago-aspas/profil/spieler/72047";
    String urlFacundoFerreyra = "https://www.transfermarkt.es/facundo-ferreyra/profil/spieler/93795";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celta);

        btnRubenBlanco = findViewById(R.id.btnRubenBlanco);
        btnIvanVillar = findViewById(R.id.btnIvanVillar);
        btnSergioAlvarez = findViewById(R.id.btnSergioAlvarez);
        btnNestorAraujo = findViewById(R.id.btnNestorAraujo);
        btnJosephAidoo = findViewById(R.id.btnJosephAidoo);
        btnJeisonMurillo = findViewById(R.id.btnJeisonMurillo);
        btnDavidCostas = findViewById(R.id.btnDavidCostas);
        btnJorgeSaenz = findViewById(R.id.btnJorgeSaenz);
        btnAaronMartin = findViewById(R.id.btnAaronMartin);
        btnDavidJunca = findViewById(R.id.btnDavidJunca);
        btnHugoMallo = findViewById(R.id.btnHugoMallo);
        btnKevinVazquez = findViewById(R.id.btnKevinVazquez);
        btnRenatoTapia = findViewById(R.id.btnRenatoTapia);
        btnFranBeltran = findViewById(R.id.btnFranBeltran);
        btnDenisSuarez = findViewById(R.id.btnDenisSuarez);
        btnMiguelBaeza = findViewById(R.id.btnMiguelBaeza);
        btnNolito = findViewById(R.id.btnNolito);
        btnBraisMendez = findViewById(R.id.btnBraisMendez);
        btnAugustoSolari = findViewById(R.id.btnAugustoSolari);
        btnEmreMor = findViewById(R.id.btnEmreMor);
        btnMiguelRodriguez = findViewById(R.id.btnMiguelRodriguez);
        btnSantiMina = findViewById(R.id.btnSantiMina);
        btnIagoAspas = findViewById(R.id.btnIagoAspas);
        btnFacundoFerreyra = findViewById(R.id.btnFacundoFerreyra);

        btnRubenBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenBlanco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIvanVillar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIvanVillar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioAlvarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioAlvarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNestorAraujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNestorAraujo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJosephAidoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJosephAidoo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJeisonMurillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJeisonMurillo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidCostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidCostas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorgeSaenz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorgeSaenz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAaronMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAaronMartin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidJunca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidJunca);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHugoMallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHugoMallo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKevinVazquez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKevinVazquez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRenatoTapia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRenatoTapia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFranBeltran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFranBeltran);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDenisSuarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDenisSuarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelBaeza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelBaeza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNolito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNolito);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBraisMendez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBraisMendez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAugustoSolari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAugustoSolari);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmreMor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmreMor);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSantiMina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSantiMina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIagoAspas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIagoAspas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFacundoFerreyra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFacundoFerreyra);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}