package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Athletic extends AppCompatActivity {

    Button btnUnaiSimon, btnIagoHerrerin, btnJokinEzkieta, btnInigoMartinez, btnUnaiNunez, btnYerayAlvarez, btnYuriBerchiche, btnMikelBalenziaga, btnAnderCapa, btnOscarDeMarcos, btnInigoLekue, btnPeruNolaskoain, btnMikelVesga, btnUnaiLopez, btnUnaiVencedor, btnDaniGarcia, btnOierZarraga, btnIkerMuniain, btnOihanSancet, btnAlexBerenguer, btnJonMorcillo, btnInigoVicente, btnIbaiGomez, btnInakiWilliams, btnAsierVillalibre, btnRaulGarcia;
    String urlUnaiSimon = "https://www.transfermarkt.es/unai-simon/profil/spieler/262396";
    String urlIagoHerrerin = "https://www.transfermarkt.es/iago-herrerin/profil/spieler/71570";
    String urlEzkieta = "https://www.transfermarkt.es/jokin-ezkieta/profil/spieler/379548";
    String urlInigoMartinez = "https://www.transfermarkt.es/inigo-martinez/profil/spieler/158863";
    String urlUnaiNunez = "https://www.transfermarkt.es/unai-nunez/profil/spieler/338285";
    String urlYeraiAlvarez = "https://www.transfermarkt.es/yeray-alvarez/profil/spieler/255488";
    String urlYuriBerchiche = "https://www.transfermarkt.es/yuri-berchiche/profil/spieler/61812";
    String urlMikelBalenziaga = "https://www.transfermarkt.es/mikel-balenziaga/profil/spieler/85258";
    String urlAnderCapa = "https://www.transfermarkt.es/ander-capa/profil/spieler/197545";
    String urlOscarDeMarcos = "https://www.transfermarkt.es/oscar-de-marcos/profil/spieler/96718";
    String urlInigoLekue = "https://www.transfermarkt.es/inigo-lekue/profil/spieler/255501";
    String urlNolaskoain = "https://www.transfermarkt.es/peru-nolaskoain/profil/spieler/447052";
    String urlMikelVesga = "https://www.transfermarkt.es/mikel-vesga/profil/spieler/300168";
    String urlUnaiLopez = "https://www.transfermarkt.es/unai-lopez/profil/spieler/192009";
    String urlUnaiVencedor = "https://www.transfermarkt.es/unai-vencedor/profil/spieler/610083";
    String urlDaniGarcia = "https://www.transfermarkt.es/dani-garcia/profil/spieler/178425";
    String urlOierZarraga = "https://www.transfermarkt.es/oier-zarraga/profil/spieler/524010";
    String urlIkerMuniain = "https://www.transfermarkt.es/iker-muniain/profil/spieler/54235";
    String urlOihanSancet = "https://www.transfermarkt.es/oihan-sancet/profil/spieler/571020";
    String urlAlexBerenguer = "https://www.transfermarkt.es/alex-berenguer/profil/spieler/338425";
    String urlJonMorcillo = "https://www.transfermarkt.es/jon-morcillo/profil/spieler/455349";
    String urlInigoVicente = "https://www.transfermarkt.es/inigo-vicente/profil/spieler/335216";
    String urlIbaiGomez = "https://www.transfermarkt.es/ibai-gomez/profil/spieler/127837";
    String urlInakiWilliams = "https://www.transfermarkt.es/inaki-williams/profil/spieler/255508";
    String urlAsierVillalibre = "https://www.transfermarkt.es/asier-villalibre/profil/spieler/251897";
    String urlRaulGarcia = "https://www.transfermarkt.es/raul-garcia/profil/spieler/34601";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_athletic);

                btnUnaiSimon = findViewById(R.id.btnUnaiSimon);
                btnIagoHerrerin = findViewById(R.id.btnIagoHerrerin);
                btnJokinEzkieta = findViewById(R.id.btnJokinEzkieta);
                btnInigoMartinez = findViewById(R.id.btnInigoMartinez);
                btnUnaiNunez = findViewById(R.id.btnUnaiNunez);
                btnYerayAlvarez = findViewById(R.id.btnYerayAlvarez);
                btnYuriBerchiche = findViewById(R.id.btnYuriBerchiche);
                btnMikelBalenziaga = findViewById(R.id.btnMikelBalenziaga);
                btnAnderCapa = findViewById(R.id.btnAnderCapa);
                btnOscarDeMarcos = findViewById(R.id.btnOscarDeMarcos);
                btnInigoLekue = findViewById(R.id.btnInigoLekue);
                btnPeruNolaskoain = findViewById(R.id.btnPeruNolaskoain);
                btnMikelVesga = findViewById(R.id.btnMikelVesga);
                btnUnaiLopez = findViewById(R.id.btnUnaiLopez);
                btnUnaiVencedor = findViewById(R.id.btnUnaiVencedor);
                btnDaniGarcia = findViewById(R.id.btnDaniGarcia);
                btnOierZarraga = findViewById(R.id.btnOierZarraga);
                btnIkerMuniain = findViewById(R.id.btnIkerMuniain);
                btnOihanSancet = findViewById(R.id.btnOihanSancet);
                btnAlexBerenguer = findViewById(R.id.btnAlexBerenguer);
                btnJonMorcillo = findViewById(R.id.btnJonMorcillo);
                btnInigoVicente = findViewById(R.id.btnInigoVicente);
                btnIbaiGomez = findViewById(R.id.btnIbaiGomez);
                btnInakiWilliams = findViewById(R.id.btnInakiWilliams);
                btnAsierVillalibre = findViewById(R.id.btnAsierVillalibre);
                btnRaulGarcia = findViewById(R.id.btnRaulGarcia);

        btnUnaiSimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnaiSimon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIagoHerrerin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIagoHerrerin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJokinEzkieta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEzkieta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnInigoMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInigoMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUnaiNunez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnaiNunez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYerayAlvarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYeraiAlvarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYuriBerchiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYuriBerchiche);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMikelBalenziaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMikelBalenziaga);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnderCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnderCapa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOscarDeMarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOscarDeMarcos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnInigoLekue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInigoLekue);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnPeruNolaskoain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNolaskoain);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnMikelVesga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMikelVesga);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnUnaiLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnaiLopez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnUnaiVencedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnaiVencedor);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnDaniGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnOierZarraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOierZarraga);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnIkerMuniain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIkerMuniain);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnOihanSancet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOihanSancet);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnAlexBerenguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexBerenguer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnJonMorcillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonMorcillo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnInigoVicente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInigoVicente);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnIbaiGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIbaiGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnInakiWilliams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInakiWilliams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnAsierVillalibre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAsierVillalibre);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnRaulGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaulGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}