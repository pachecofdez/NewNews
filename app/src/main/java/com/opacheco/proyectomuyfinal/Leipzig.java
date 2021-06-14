package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Leipzig extends AppCompatActivity {

    Button btnGulacsi, btnJosepMartinez, btnTschauner, btnUpamecano, btnKonate, btnOrban, btnHalstenberg,btnKlostermann, btnMukiele, btnHenricks, btnAdams, btnSabitzer, btnLaimer, btnHaidara, btnKampl, btnAngelino, btnSzoboszlai, btnOlmo, btnNkunku, btnSamardzic, btnWosz, btnForsberg, btnKluivert, btnHartmann, btnPoulsen, btnSorloth, btnHwang, btnNovoa;

    String urlGulacsi = "https://www.transfermarkt.es/peter-gulacsi/profil/spieler/57071";
    String urlJosepMartinez = "https://www.transfermarkt.es/josep-martinez/profil/spieler/388516";
    String urlTschauner = "https://www.transfermarkt.es/philipp-tschauner/profil/spieler/21726";
    String urlUpamecano = "https://www.transfermarkt.es/dayot-upamecano/profil/spieler/344695";
    String urlKonate = "https://www.transfermarkt.es/ibrahima-konate/profil/spieler/357119";
    String urlOrban = "https://www.transfermarkt.es/willi-orban/profil/spieler/93740";
    String urlHalstenberg = "https://www.transfermarkt.es/marcel-halstenberg/profil/spieler/70243";
    String urlKlostermann = "https://www.transfermarkt.es/lukas-klostermann/profil/spieler/215599";
    String urlMukiele = "https://www.transfermarkt.es/nordi-mukiele/profil/spieler/348026";
    String urlHenricks = "https://www.transfermarkt.es/benjamin-henrichs/profil/spieler/202591";
    String urlAdams= "https://www.transfermarkt.es/tyler-adams/profil/spieler/332705" ;
    String urlSabitzer = "https://www.transfermarkt.es/marcel-sabitzer/profil/spieler/106987";
    String urlLaimer = "https://www.transfermarkt.es/konrad-laimer/profil/spieler/223967";
    String urlHaidara = "https://www.transfermarkt.es/amadou-haidara/profil/spieler/402008";
    String urlKampl = "https://www.transfermarkt.es/kevin-kampl/profil/spieler/53418";
    String urlAngelino = "https://www.transfermarkt.es/angelino/profil/spieler/277179";
    String urlSzoboszlai = "https://www.transfermarkt.es/dominik-szoboszlai/profil/spieler/451276";
    String urlOlmo = "https://www.transfermarkt.es/dani-olmo/profil/spieler/293385";
    String urlNkunku = "https://www.transfermarkt.es/christopher-nkunku/profil/spieler/344381";
    String urlSamardzic = "https://www.transfermarkt.es/lazar-samardzic/profil/spieler/528833";
    String urlWosz = "https://www.transfermarkt.es/joscha-wosz/profil/spieler/597004";
    String urlForsberg = "https://www.transfermarkt.es/emil-forsberg/profil/spieler/111078";
    String urlKluivert = "https://www.transfermarkt.es/justin-kluivert/profil/spieler/330659";
    String urlHartmann = "https://www.transfermarkt.es/fabrice-hartmann/profil/spieler/405685";
    String urlPoulsen= "https://www.transfermarkt.es/yussuf-poulsen/profil/spieler/157635" ;
    String urlSorloth = "https://www.transfermarkt.es/alexander-sorloth/profil/spieler/238407";
    String urlHwang = "https://www.transfermarkt.es/hee-chan-hwang/profil/spieler/292246";
    String urlNovoa = "https://www.transfermarkt.es/hugo-novoa/profil/spieler/668276";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leipzig);

        btnGulacsi = findViewById(R.id.btnGulacsi);
        btnJosepMartinez = findViewById(R.id.btnJosepMartinez);
        btnTschauner = findViewById(R.id.btnTschauner);
        btnUpamecano = findViewById(R.id.btnUpamecano);
        btnKonate = findViewById(R.id.btnKonate);
        btnOrban = findViewById(R.id.btnOrban);
        btnHalstenberg = findViewById(R.id.btnHalstenberg);
        btnKlostermann = findViewById(R.id.btnKlostermann);
        btnMukiele = findViewById(R.id.btnMukiele);
        btnHenricks = findViewById(R.id.btnHenricks);
        btnAdams = findViewById(R.id.btnAdams);
        btnSabitzer = findViewById(R.id.btnSabitzer);
        btnLaimer = findViewById(R.id.btnLaimer);
        btnHaidara = findViewById(R.id.btnHaidara);
        btnKampl = findViewById(R.id.btnKampl);
        btnAngelino = findViewById(R.id.btnAngelino);
        btnSzoboszlai = findViewById(R.id.btnSzoboszlai);
        btnOlmo = findViewById(R.id.btnOlmo);
        btnNkunku = findViewById(R.id.btnNkunku);
        btnSamardzic = findViewById(R.id.btnSamardzic);
        btnWosz = findViewById(R.id.btnWosz);
        btnForsberg = findViewById(R.id.btnForsberg);
        btnKluivert = findViewById(R.id.btnKluivert);
        btnHartmann = findViewById(R.id.btnHartmann);
        btnPoulsen = findViewById(R.id.btnPoulsen);
        btnSorloth = findViewById(R.id.btnSorloth);
        btnHwang = findViewById(R.id.btnHwang);
        btnNovoa = findViewById(R.id.btnNovoa);

        btnGulacsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGulacsi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJosepMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJosepMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTschauner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTschauner);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUpamecano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUpamecano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKonate);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOrban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOrban);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHalstenberg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHalstenberg);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKlostermann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKlostermann);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMukiele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMukiele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHenricks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHenricks);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdams);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSabitzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSabitzer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLaimer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHaidara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHaidara);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKampl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKampl);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAngelino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAngelino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSzoboszlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSzoboszlai);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOlmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOlmo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNkunku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNkunku);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSamardzic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSamardzic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWosz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWosz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnForsberg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlForsberg);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKluivert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKluivert);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHartmann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHartmann);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPoulsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPoulsen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSorloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSorloth);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHwang);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNovoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNovoa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}