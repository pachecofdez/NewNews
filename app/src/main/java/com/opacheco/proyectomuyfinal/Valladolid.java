package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Valladolid extends AppCompatActivity {

    Button btnJordiMasip, btnRoberto, btnJoaquinFernandez, btnJaviSanchez, btnJawadElYamiq, btnKikoOlivas, btnBrunoGonzalez, btnLucasOlaza, btnNachoMartinez, btnRaulCarnero, btnSaidyJanko, btnLuisPerez, btnRubenAlcaraz, btnFedeSanEmeterio, btnRoqueMesa, btnMichelHerrero, btnKikePerez, btnJota, btnToniVilla, btnWaldoRubio, btnOscarPlano, btnPabloHervias, btnFabianOrellana, btnShonWeissman, btnSergiGuardiola, btnMarcosAndre, btnKenanKodro;

    String urlJordiMasip = "https://www.transfermarkt.es/jordi-masip/profil/spieler/65263";
    String urlRoberto = "https://www.transfermarkt.es/roberto/profil/spieler/37403";
    String urlJoaquinFernandez = "https://www.transfermarkt.es/joaquin-fernandez/profil/spieler/221321";
    String urlJaviSanchez = "https://www.transfermarkt.es/javi-sanchez/profil/spieler/340853";
    String urlElYamiq = "https://www.transfermarkt.es/jawad-el-yamiq/profil/spieler/235412";
    String urlKikoOlivas = "https://www.transfermarkt.es/kiko-olivas/profil/spieler/51667";
    String urlBrunoGonzalez = "https://www.transfermarkt.es/bruno-gonzalez/profil/spieler/188838";
    String urlLucasOlaza = "https://www.transfermarkt.es/lucas-olaza/profil/spieler/216240";
    String urlNachoMartinez = "https://www.transfermarkt.es/nacho-martinez/profil/spieler/127554";
    String urlRaulCarnero = "https://www.transfermarkt.es/raul-carnero/profil/spieler/139434";
    String urlJanko = "https://www.transfermarkt.es/saidy-janko/profil/spieler/196435";
    String urlLuisPerez = "https://www.transfermarkt.es/luis-perez/profil/spieler/358115";
    String urlRubenAlcaraz = "https://www.transfermarkt.es/ruben-alcaraz/profil/spieler/247250";
    String urlEmeterio = "https://www.transfermarkt.es/fede-san-emeterio/profil/spieler/307519";
    String urlRoqueMesa = "https://www.transfermarkt.es/roque-mesa/profil/spieler/202984";
    String urlMichelHerrero = "https://www.transfermarkt.es/michel-herrero/profil/spieler/65331";
    String urlKikePerez = "https://www.transfermarkt.es/kike-perez/profil/spieler/527698";
    String urlJota = "https://www.transfermarkt.es/jota/profil/spieler/329812";
    String urlToniVilla = "https://www.transfermarkt.es/toni-villa/profil/spieler/337066";
    String urlWaldoRubia = "https://www.transfermarkt.es/waldo-rubio/profil/spieler/404688";
    String urlOscarPlano = "https://www.transfermarkt.es/oscar-plano/profil/spieler/221309";
    String urlPabloHervias = "https://www.transfermarkt.es/pablo-hervias/profil/spieler/142027";
    String urlOrellana = "https://www.transfermarkt.es/fabian-orellana/profil/spieler/60890";
    String urlWeissman = "https://www.transfermarkt.es/shon-weissman/profil/spieler/247652";
    String urlSergiGuardiola = "https://www.transfermarkt.es/sergi-guardiola/profil/spieler/256429";
    String urlMarcosAndre = "https://www.transfermarkt.es/marcos-andre/profil/spieler/481084";
    String urlKodro = "https://www.transfermarkt.es/kenan-kodro/profil/spieler/197126";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valladolid);

        btnJordiMasip = findViewById(R.id.btnJordiMasip);
        btnRoberto = findViewById(R.id.btnRoberto);
        btnJoaquinFernandez = findViewById(R.id.btnJoaquinFernandez);
        btnJaviSanchez = findViewById(R.id.btnJaviSanchez);
        btnJawadElYamiq = findViewById(R.id.btnJawadElYamiq);
        btnKikoOlivas = findViewById(R.id.btnKikoOlivas);
        btnBrunoGonzalez = findViewById(R.id.btnBrunoGonzalez);
        btnLucasOlaza = findViewById(R.id.btnLucasOlaza);
        btnNachoMartinez = findViewById(R.id.btnNachoMartinez);
        btnRaulCarnero = findViewById(R.id.btnRaulCarnero);
        btnSaidyJanko = findViewById(R.id.btnSaidyJanko);
        btnLuisPerez = findViewById(R.id.btnLuisPerez);
        btnRubenAlcaraz = findViewById(R.id.btnRubenAlcaraz);
        btnFedeSanEmeterio = findViewById(R.id.btnFedeSanEmeterio);
        btnRoqueMesa = findViewById(R.id.btnRoqueMesa);
        btnMichelHerrero = findViewById(R.id.btnMichelHerrero);
        btnKikePerez = findViewById(R.id.btnKikePerez);
        btnJota = findViewById(R.id.btnJota);
        btnToniVilla = findViewById(R.id.btnToniVilla);
        btnWaldoRubio = findViewById(R.id.btnWaldoRubio);
        btnOscarPlano = findViewById(R.id.btnOscarPlano);
        btnPabloHervias = findViewById(R.id.btnPabloHervias);
        btnFabianOrellana = findViewById(R.id.btnFabianOrellana);
        btnShonWeissman = findViewById(R.id.btnShonWeissman);
        btnSergiGuardiola = findViewById(R.id.btnSergiGuardiola);
        btnMarcosAndre = findViewById(R.id.btnMarcosAndre);
        btnKenanKodro = findViewById(R.id.btnKenanKodro);


        btnJordiMasip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJordiMasip);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRoberto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRoberto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoaquinFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoaquinFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJawadElYamiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlElYamiq);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKikoOlivas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKikoOlivas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrunoGonzalez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrunoGonzalez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasOlaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasOlaza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNachoMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNachoMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaulCarnero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaulCarnero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaidyJanko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJanko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuisPerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuisPerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenAlcaraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenAlcaraz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFedeSanEmeterio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmeterio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRoqueMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRoqueMesa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichelHerrero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichelHerrero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKikePerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKikePerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJota);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnToniVilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlToniVilla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWaldoRubio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWaldoRubia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOscarPlano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOscarPlano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloHervias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloHervias);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFabianOrellana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOrellana);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnShonWeissman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWeissman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergiGuardiola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergiGuardiola);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcosAndre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcosAndre);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKenanKodro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKodro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });








    }
}