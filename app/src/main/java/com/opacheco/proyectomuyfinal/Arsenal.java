package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arsenal extends AppCompatActivity {


    Button btnBerndLeno, btnRyan, btnRunarsson, btnIliev, btnGabriel, btnHolding, btnChambers, btnMari, btnDavidLuiz, btnTierney, btnBellerin, btnSoares, btnThomasPartey, btnXhaka, btnEleny, btnCeballos, btnJoeWillock, btnOdegaard, btnEmileSmithRowe, btnMartinelli, btnSaka, btnNicolasPepe, btnWillian, btnNelson, btnLacazette, btnAubameyang, btnNketiah;


    String urlBerndLeno = "https://www.transfermarkt.es/bernd-leno/profil/spieler/72476";
    String urlRyan = "https://www.transfermarkt.es/mathew-ryan/profil/spieler/128969";
    String urlRunarsson = "https://www.transfermarkt.es/runar-alex-runarsson/profil/spieler/205657";
    String urlIliev = "https://www.transfermarkt.es/dejan-iliev/profil/spieler/205757";
    String urlGabriel = "https://www.transfermarkt.es/gabriel/profil/spieler/435338";
    String urlHolding = "https://www.transfermarkt.es/rob-holding/profil/spieler/253341";
    String urlChambers = "https://www.transfermarkt.es/calum-chambers/profil/spieler/215118";
    String urlari = "https://www.transfermarkt.es/pablo-mari/profil/spieler/210178";
    String urlDavidLuiz = "https://www.transfermarkt.es/david-luiz/profil/spieler/46741";
    String urlTierney= "https://www.transfermarkt.es/kieran-tierney/profil/spieler/300716" ;
    String urlBellerin = "https://www.transfermarkt.es/hector-bellerin/profil/spieler/191217";
    String urlSoares= "https://www.transfermarkt.es/cedric-soares/profil/spieler/112988" ;
    String urlThomasPartey = "https://www.transfermarkt.es/thomas-partey/profil/spieler/230784";
    String urlXhaka = "https://www.transfermarkt.es/granit-xhaka/profil/spieler/111455";
    String urlEleny= "https://www.transfermarkt.es/mohamed-elneny/profil/spieler/160438" ;
    String urlCeballos = "https://www.transfermarkt.es/dani-ceballos/profil/spieler/319745";
    String urlJoeWillock= "https://www.transfermarkt.es/joe-willock/profil/spieler/340329" ;
    String urlOdegaard = "https://www.transfermarkt.es/martin-odegaard/profil/spieler/316264";
    String urlEmileSmithRowe = "https://www.transfermarkt.es/emile-smith-rowe/profil/spieler/392765";
    String urlMartinelli= "https://www.transfermarkt.es/gabriel-martinelli/profil/spieler/655488" ;
    String urlSaka = "https://www.transfermarkt.es/bukayo-saka/profil/spieler/433177";
    String urlNicolasPepe = "https://www.transfermarkt.es/nicolas-pepe/profil/spieler/343052";
    String urlWillian = "https://www.transfermarkt.es/willian/profil/spieler/52769";
    String urlNelson= "https://www.transfermarkt.es/reiss-nelson/profil/spieler/340325";
    String urlLacazette= "https://www.transfermarkt.es/alexandre-lacazette/profil/spieler/93720" ;
    String urlAubameyang = "https://www.transfermarkt.es/pierre-emerick-aubameyang/profil/spieler/58864";
    String urlNketiah= "https://www.transfermarkt.es/eddie-nketiah/profil/spieler/340324" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal);

        btnBerndLeno = findViewById(R.id.btnBerndLeno);
        btnRyan = findViewById(R.id.btnRyan);
        btnRunarsson = findViewById(R.id.btnRunarsson);
        btnIliev = findViewById(R.id.btnIliev);
        btnGabriel = findViewById(R.id.btnGabriel);
        btnHolding = findViewById(R.id.btnHolding);
        btnChambers = findViewById(R.id.btnChambers);
        btnMari = findViewById(R.id.btnMari);
        btnDavidLuiz = findViewById(R.id.btnDavidLuiz);
        btnTierney = findViewById(R.id.btnTierney);
        btnBellerin = findViewById(R.id.btnBellerin);
        btnSoares = findViewById(R.id.btnSoares);
        btnThomasPartey = findViewById(R.id.btnThomasPartey);
        btnXhaka = findViewById(R.id.btnXhaka);
        btnEleny = findViewById(R.id.btnEleny);
        btnCeballos = findViewById(R.id.btnCeballos);
        btnJoeWillock = findViewById(R.id.btnJoeWillock);
        btnOdegaard = findViewById(R.id.btnOdegaard);
        btnEmileSmithRowe = findViewById(R.id.btnEmileSmithRowe);
        btnMartinelli = findViewById(R.id.btnMartinelli);
        btnSaka = findViewById(R.id.btnSaka);
        btnNicolasPepe = findViewById(R.id.btnNicolasPepe);
        btnWillian = findViewById(R.id.btnWillian);
        btnNelson = findViewById(R.id.btnNelson);
        btnLacazette = findViewById(R.id.btnLacazette);
        btnAubameyang = findViewById(R.id.btnAubameyang);
        btnNketiah = findViewById(R.id.btnNketiah);


        btnBerndLeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBerndLeno);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRyan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRunarsson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRunarsson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIliev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIliev);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGabriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGabriel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHolding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHolding);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChambers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChambers);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlari);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidLuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidLuiz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTierney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTierney);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBellerin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBellerin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSoares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSoares);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnThomasPartey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlThomasPartey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnXhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlXhaka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEleny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEleny);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCeballos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCeballos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoeWillock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoeWillock);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOdegaard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOdegaard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmileSmithRowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmileSmithRowe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMartinelli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMartinelli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNicolasPepe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNicolasPepe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWillian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWillian);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNelson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNelson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLacazette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLacazette);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAubameyang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAubameyang);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNketiah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNketiah);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}