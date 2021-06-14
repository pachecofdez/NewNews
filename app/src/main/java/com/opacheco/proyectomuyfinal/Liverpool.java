package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Liverpool extends AppCompatActivity {


    Button btnAlisson, btnKelleher, btnAdrian, btnVanDijk, btnJoeGomez, btnKabak, btnMatip, btnRhysWilliams, btnPhillips, btnBenDavies, btnRobertson, btnTsimikas, btnAlexanderArnold, btnNecoWilliams, btnFabinho, btnNabyKeita, btnThiago, btnWijnaldum, btnCurtisJones, btnJordanHenderson, btnAlexOxladeChamberlain, btnJamesMilner, btnWoodburn, btnMane, BtnDiogoJota, btnSalah, btnShaqiri, btnFirmino, btnOrigi;


    String urlAlisson = "https://www.transfermarkt.es/alisson/profil/spieler/105470" ;
    String urlKelleher = "https://www.transfermarkt.es/caoimhin-kelleher/profil/spieler/340918";
    String urlAdrian = "https://www.transfermarkt.es/adrian/profil/spieler/71271";
    String urlVanDijk = "https://www.transfermarkt.es/virgil-van-dijk/profil/spieler/139208";
    String urlJoeGomez= "https://www.transfermarkt.es/joe-gomez/profil/spieler/256178";
    String urlKabak = "https://www.transfermarkt.es/ozan-kabak/profil/spieler/361260";
    String urlMatip = "https://www.transfermarkt.es/joel-matip/profil/spieler/82105";
    String urlRhysWilliams= "https://www.transfermarkt.es/rhys-williams/profil/spieler/503679";
    String urlPhillips = "https://www.transfermarkt.es/nathaniel-phillips/profil/spieler/371814";
    String urlBenDavies = "https://www.transfermarkt.es/ben-davies/profil/spieler/257097";
    String urlRobertson = "https://www.transfermarkt.es/andrew-robertson/profil/spieler/234803";
    String urlTsimikas = "https://www.transfermarkt.es/konstantinos-tsimikas/profil/spieler/338070";
    String urlAlexanderArnold = "https://www.transfermarkt.es/trent-alexander-arnold/profil/spieler/314353";
    String urlNecoWilliams = "https://www.transfermarkt.es/neco-williams/profil/spieler/503680";
    String urlFabinho = "https://www.transfermarkt.es/fabinho/profil/spieler/225693";
    String urlNabyKeita = "https://www.transfermarkt.es/naby-keita/profil/spieler/302215";
    String urlThiago = "https://www.transfermarkt.es/thiago/profil/spieler/60444";
    String urlWijnaldum = "https://www.transfermarkt.es/georginio-wijnaldum/profil/spieler/49499";
    String urlCurtisJones = "https://www.transfermarkt.es/curtis-jones/profil/spieler/433188";
    String urlJordanHenderson = "https://www.transfermarkt.es/jordan-henderson/profil/spieler/61651";
    String urlAlexOxladeChamberlain = "https://www.transfermarkt.es/alex-oxlade-chamberlain/profil/spieler/143424";
    String urlJamesMilner = "https://www.transfermarkt.es/james-milner/profil/spieler/3333";
    String urlWoodburn = "https://www.transfermarkt.es/ben-woodburn/profil/spieler/344015";
    String urlMane = "https://www.transfermarkt.es/sadio-mane/profil/spieler/200512";
    String urlDiogoJota = "https://www.transfermarkt.es/diogo-jota/profil/spieler/340950";
    String urlSalah = "https://www.transfermarkt.es/mohamed-salah/profil/spieler/148455";
    String urlSaqiri = "https://www.transfermarkt.es/xherdan-shaqiri/profil/spieler/86792";
    String urlFirmino = "https://www.transfermarkt.es/roberto-firmino/profil/spieler/131789";
    String urlOrigi = "https://www.transfermarkt.es/divock-origi/profil/spieler/148368";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liverpool);



        btnAlisson = findViewById(R.id.btnAlisson);
        btnKelleher = findViewById(R.id.btnKelleher);
        btnAdrian = findViewById(R.id.btnAdrian);
        btnVanDijk = findViewById(R.id.btnVanDijk);
        btnJoeGomez = findViewById(R.id.btnJoeGomez);
        btnKabak = findViewById(R.id.btnKabak);
        btnMatip = findViewById(R.id.btnMatip);
        btnRhysWilliams = findViewById(R.id.btnRhysWilliams);
        btnPhillips = findViewById(R.id.btnPhillips);
        btnBenDavies = findViewById(R.id.btnBenDavies);
        btnRobertson = findViewById(R.id.btnRobertson);
        btnTsimikas = findViewById(R.id.btnTsimikas);
        btnAlexanderArnold = findViewById(R.id.btnAlexanderArnold);
        btnNecoWilliams = findViewById(R.id.btnNecoWilliams);
        btnFabinho = findViewById(R.id.btnFabinho);
        btnNabyKeita = findViewById(R.id.btnNabyKeita);
        btnThiago = findViewById(R.id.btnThiago);
        btnWijnaldum = findViewById(R.id.btnWijnaldum);
        btnCurtisJones = findViewById(R.id.btnCurtisJones);
        btnJordanHenderson = findViewById(R.id.btnJordanHenderson);
        btnAlexOxladeChamberlain = findViewById(R.id.btnAlexOxladeChamberlain);
        btnJamesMilner = findViewById(R.id.btnJamesMilner);
        btnWoodburn = findViewById(R.id.btnWoodburn);
        btnMane = findViewById(R.id.btnMane);
        BtnDiogoJota = findViewById(R.id.BtnDiogoJota);
        btnSalah = findViewById(R.id.btnSalah);
        btnShaqiri = findViewById(R.id.btnShaqiri);
        btnFirmino = findViewById(R.id.btnFirmino);
        btnOrigi = findViewById(R.id.btnOrigi);

        btnAlisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlisson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnKelleher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKelleher);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnAdrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdrian);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnVanDijk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVanDijk);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnJoeGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoeGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnKabak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKabak);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnMatip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMatip);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnRhysWilliams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRhysWilliams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnPhillips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPhillips);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnBenDavies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenDavies);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnRobertson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnTsimikas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTsimikas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnAlexanderArnold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexanderArnold);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnNecoWilliams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNecoWilliams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnFabinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFabinho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnNabyKeita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNabyKeita);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnThiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlThiago);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnWijnaldum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWijnaldum);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnCurtisJones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCurtisJones);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnJordanHenderson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJordanHenderson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnAlexOxladeChamberlain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexOxladeChamberlain);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnJamesMilner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJamesMilner);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWoodburn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWoodburn);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnMane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        BtnDiogoJota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiogoJota);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnSalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSalah);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnShaqiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaqiri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnFirmino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFirmino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOrigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOrigi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });






    }
}