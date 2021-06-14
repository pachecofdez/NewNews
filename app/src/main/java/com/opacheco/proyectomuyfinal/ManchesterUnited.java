package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManchesterUnited extends AppCompatActivity {

    Button btnDavidDeGea, btnDeanHenderson, btnSergioRomero, btnLeeGrant, btnHarryMaguire, btnLindelof, btnBailly, btnTuanzebe, btnPhilJones, btnLukeShaw, btnAlexTelles, btnBrandonWilliams, btnWanBissaka, btnMatic, btnPogba, btnMctominay, btnVanDeBeek, btnFred, btnBrunoFernandes, btnJuanMata, btnRashford, btnDanielJames, btnGreenwood, btnDiallo, btnMartial, btnCavani;


    String urlDeGea = "https://www.transfermarkt.es/david-de-gea/profil/spieler/59377" ;
    String urlDeanHenderson = "https://www.transfermarkt.es/dean-henderson/profil/spieler/258919";
    String urlSergioRomero = "https://www.transfermarkt.es/sergio-romero/profil/spieler/30690";
    String urlLeeGrant = "https://www.transfermarkt.es/lee-grant/profil/spieler/13460";
    String urlHarryMaguire = "https://www.transfermarkt.es/harry-maguire/profil/spieler/177907";
    String urlLindelof = "https://www.transfermarkt.es/victor-lindelof/profil/spieler/184573";
    String urlBailly = "https://www.transfermarkt.es/eric-bailly/profil/spieler/286384";
    String urlTuanzebe = "https://www.transfermarkt.es/axel-tuanzebe/profil/spieler/342046";
    String urlPhilJones = "https://www.transfermarkt.es/phil-jones/profil/spieler/117996";
    String urlLukeShaw = "https://www.transfermarkt.es/luke-shaw/profil/spieler/183288";
    String urlAlexTelles = "https://www.transfermarkt.es/alex-telles/profil/spieler/255755";
    String urlBrandonWilliams = "https://www.transfermarkt.es/brandon-williams/profil/spieler/507700";
    String urlWanBissaka = "https://www.transfermarkt.es/aaron-wan-bissaka/profil/spieler/477758";
    String urlMatic = "https://www.transfermarkt.es/nemanja-matic/profil/spieler/74683";
    String urlPogba = "https://www.transfermarkt.es/paul-pogba/profil/spieler/122153";
    String urlMcTominay = "https://www.transfermarkt.es/scott-mctominay/profil/spieler/315969";
    String urlVanDeBeek = "https://www.transfermarkt.es/donny-van-de-beek/profil/spieler/288255";
    String urlFred = "https://www.transfermarkt.es/fred/profil/spieler/191614";
    String urlBrunoFernandes = "https://www.transfermarkt.es/bruno-fernandes/profil/spieler/240306";
    String urlJuanMata = "https://www.transfermarkt.es/juan-mata/profil/spieler/44068";
    String urlRashford = "https://www.transfermarkt.es/marcus-rashford/profil/spieler/258923";
    String urlDanielJames = "https://www.transfermarkt.es/daniel-james/profil/spieler/319301";
    String urlGreenwood = "https://www.transfermarkt.es/mason-greenwood/profil/spieler/532826";
    String urlDiallo = "https://www.transfermarkt.es/amad-diallo/profil/spieler/536835";
    String urlMartial = "https://www.transfermarkt.es/anthony-martial/profil/spieler/182877";
    String urlCavani = "https://www.transfermarkt.es/edinson-cavani/profil/spieler/48280";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchester_united);

        btnDavidDeGea = findViewById(R.id.btnDavidDeGea);
        btnDeanHenderson = findViewById(R.id.btnDeanHenderson);
        btnSergioRomero = findViewById(R.id.btnSergioRomero);
        btnLeeGrant = findViewById(R.id.btnLeeGrant);
        btnHarryMaguire = findViewById(R.id.btnHarryMaguire);
        btnLindelof = findViewById(R.id.btnLindelof);
        btnBailly = findViewById(R.id.btnBailly);
        btnTuanzebe = findViewById(R.id.btnTuanzebe);
        btnPhilJones = findViewById(R.id.btnPhilJones);
        btnLukeShaw = findViewById(R.id.btnLukeShaw);
        btnAlexTelles = findViewById(R.id.btnAlexTelles);
        btnBrandonWilliams = findViewById(R.id.btnBrandonWilliams);
        btnWanBissaka = findViewById(R.id.btnWanBissaka);
        btnMatic = findViewById(R.id.btnMatic);
        btnPogba = findViewById(R.id.btnPogba);
        btnMctominay = findViewById(R.id.btnMctominay);
        btnVanDeBeek = findViewById(R.id.btnVanDeBeek);
        btnFred = findViewById(R.id.btnFred);
        btnBrunoFernandes = findViewById(R.id.btnBrunoFernandes);
        btnJuanMata = findViewById(R.id.btnJuanMata);
        btnRashford = findViewById(R.id.btnRashford);
        btnDanielJames = findViewById(R.id.btnDanielJames);
        btnGreenwood = findViewById(R.id.btnGreenwood);
        btnDiallo = findViewById(R.id.btnDiallo);
        btnMartial = findViewById(R.id.btnMartial);
        btnCavani = findViewById(R.id.btnCavani);


        btnDavidDeGea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeGea);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeanHenderson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeanHenderson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioRomero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioRomero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLeeGrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLeeGrant);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHarryMaguire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHarryMaguire);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLindelof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLindelof);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBailly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBailly);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTuanzebe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTuanzebe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPhilJones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPhilJones);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLukeShaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLukeShaw);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexTelles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexTelles);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrandonWilliams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrandonWilliams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWanBissaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWanBissaka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMatic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPogba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPogba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMctominay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcTominay);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVanDeBeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVanDeBeek);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFred);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrunoFernandes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrunoFernandes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanMata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanMata);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRashford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRashford);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDanielJames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDanielJames);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGreenwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGreenwood);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiallo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMartial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMartial);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCavani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCavani);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}