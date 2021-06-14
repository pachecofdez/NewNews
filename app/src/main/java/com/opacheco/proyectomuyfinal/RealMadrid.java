package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RealMadrid extends AppCompatActivity {

    Button btnCourtois, btnLunin, btnVarane, btnMilitao, btnRamos, btnNacho, btnMendy, btnMarcelo, btnCarvajal, btnOdriozola, btnCasemiro, btnValverde, btnKroos, btnModric, btnIsco, btnHazard, btnVinicius, btnRodrygo, btnAsensio, btnLucasVazquez, btnArribas, btnBenzema, btnMariano, btnHugoDuro;

    String urlCourtois = "https://www.transfermarkt.es/thibaut-courtois/profil/spieler/108390";
    String urlLunin = "https://www.transfermarkt.es/andriy-lunin/profil/spieler/404839";
    String urlVarane = "https://www.transfermarkt.es/raphael-varane/profil/spieler/164770";
    String urlMilitao = "https://www.transfermarkt.es/eder-militao/profil/spieler/401530";
    String urlRamos = "https://www.transfermarkt.es/sergio-ramos/profil/spieler/25557";
    String urlNacho = "https://www.transfermarkt.es/nacho-fernandez/profil/spieler/58884";
    String urlMendy = "https://www.transfermarkt.es/ferland-mendy/profil/spieler/291417";
    String urlMarcelo = "https://www.transfermarkt.es/marcelo/profil/spieler/44501";
    String urlCarvajal = "https://www.transfermarkt.es/daniel-carvajal/profil/spieler/138927";
    String urlOdriozola = "https://www.transfermarkt.es/alvaro-odriozola/profil/spieler/280730";
    String urlCasemiro = "https://www.transfermarkt.es/casemiro/profil/spieler/16306";
    String urlValverde = "https://www.transfermarkt.es/federico-valverde/profil/spieler/369081";
    String urlKroos = "https://www.transfermarkt.es/toni-kroos/profil/spieler/31909";
    String urlModric = "https://www.transfermarkt.es/luka-modric/profil/spieler/27992";
    String urlIsco = "https://www.transfermarkt.es/isco/profil/spieler/85288";
    String urlHazard = "https://www.transfermarkt.es/eden-hazard/profil/spieler/50202";
    String urlVinicius = "https://www.transfermarkt.es/vinicius-junior/profil/spieler/371998";
    String urlRodrygo = "https://www.transfermarkt.es/rodrygo/profil/spieler/412363";
    String urlAsensio = "https://www.transfermarkt.es/marco-asensio/profil/spieler/296622";
    String urlLucasVazquez = "https://www.transfermarkt.es/lucas-vazquez/profil/spieler/221316";
    String urlArribas = "https://www.transfermarkt.es/sergio-arribas/profil/spieler/537762";
    String urlBenzema = "https://www.transfermarkt.es/karim-benzema/profil/spieler/18922";
    String urlMariano = "https://www.transfermarkt.es/mariano-diaz/profil/spieler/225020";
    String urlHugoDuro = "https://www.transfermarkt.es/hugo-duro/profil/spieler/573775";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_madrid);


        btnCourtois = findViewById(R.id.btnCourtois);
        btnLunin = findViewById(R.id.btnLunin);
        btnVarane = findViewById(R.id.btnVarane);
        btnMilitao = findViewById(R.id.btnMilitao);
        btnRamos = findViewById(R.id.btnRamos);
        btnNacho = findViewById(R.id.btnNacho);
        btnMendy = findViewById(R.id.btnMendy);
        btnMarcelo = findViewById(R.id.btnMarcelo);
        btnCarvajal = findViewById(R.id.btnCarvajal);
        btnOdriozola = findViewById(R.id.btnOdriozola);
        btnCasemiro = findViewById(R.id.btnCasemiro);
        btnValverde = findViewById(R.id.btnValverde);
        btnKroos = findViewById(R.id.btnKroos);
        btnModric = findViewById(R.id.btnModric);
        btnIsco = findViewById(R.id.btnIsco);
        btnHazard = findViewById(R.id.btnHazard);
        btnVinicius = findViewById(R.id.btnVinicius);
        btnRodrygo = findViewById(R.id.btnRodrygo);
        btnAsensio = findViewById(R.id.btnAsensio);
        btnLucasVazquez = findViewById(R.id.btnLucasVazquez);
        btnArribas = findViewById(R.id.btnArribas);
        btnBenzema = findViewById(R.id.btnBenzema);
        btnMariano = findViewById(R.id.btnMariano);
        btnHugoDuro = findViewById(R.id.btnHugoDuro);





        btnCourtois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCourtois);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLunin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLunin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVarane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVarane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMilitao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMilitao);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRamos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNacho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMendy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMendy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcelo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarvajal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarvajal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOdriozola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOdriozola);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCasemiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCasemiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnValverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlValverde);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKroos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKroos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnModric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlModric);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIsco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIsco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHazard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHazard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVinicius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVinicius);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodrygo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodrygo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAsensio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAsensio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasVazquez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasVazquez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnArribas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlArribas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenzema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenzema);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMariano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMariano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHugoDuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHugoDuro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}