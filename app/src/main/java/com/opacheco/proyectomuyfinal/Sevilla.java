package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sevilla extends AppCompatActivity {

    Button btnBono, btnVaclik, btnJaviDiaz, btnKounde, btnDiegoCarlos, btnSergiGomez, btnRekik, btnGnagnon, btnAcuna, btnSergioEscudero, btnJesusNavas, btnAleixVidal, btnGudelj, btnFernandoReges, btnJoanJordan, btnOliverTorres, btnRakitic, btnOscarRodriguez, btnFrancoVazquez, btnOcampos, btnSuso, btnPapu, btnEnNesyri, btnLuukDeJong, btnMunir;

    String urlBono = "https://www.transfermarkt.es/bono/profil/spieler/207834";
    String urlVaclik = "https://www.transfermarkt.es/tomas-vaclik/profil/spieler/64000";
    String urlJaviDiaz = "https://www.transfermarkt.es/javi-diaz/profil/spieler/396107";
    String urlKounde = "https://www.transfermarkt.es/jules-kounde/profil/spieler/411975";
    String urlDiegoCarlos = "https://www.transfermarkt.es/diego-carlos/profil/spieler/329145";
    String urlSergiGomez = "https://www.transfermarkt.es/sergi-gomez/profil/spieler/92947";
    String urlRekik = "https://www.transfermarkt.es/karim-rekik/profil/spieler/182579";
    String urlGnagnon = "https://www.transfermarkt.es/joris-gnagnon/profil/spieler/378954";
    String urlAcuna = "https://www.transfermarkt.es/marcos-acuna/profil/spieler/60410";
    String urlEscudero = "https://www.transfermarkt.es/sergio-escudero/profil/spieler/93935";
    String urlJesusNavas = "https://www.transfermarkt.es/jesus-navas/profil/spieler/15956";
    String urlAleixVidal = "https://www.transfermarkt.es/aleix-vidal/profil/spieler/88490";
    String urlGudelj = "https://www.transfermarkt.es/nemanja-gudelj/profil/spieler/74294";
    String urlFernandoReges = "https://www.transfermarkt.es/fernando-reges/profil/spieler/51174";
    String urlJoanJordan = "https://www.transfermarkt.es/joan-jordan/profil/spieler/263727";
    String urlOliverTorres = "https://www.transfermarkt.es/oliver-torres/profil/spieler/214775";
    String urlRakitic = "https://www.transfermarkt.es/ivan-rakitic/profil/spieler/32467";
    String urlOscarRodriguez = "https://www.transfermarkt.es/oscar-rodriguez/profil/spieler/284884";
    String urlFrancoVazquez = "https://www.transfermarkt.es/franco-vazquez/profil/spieler/76163";
    String urlOcampos = "https://www.transfermarkt.es/lucas-ocampos/profil/spieler/189441";
    String urlSuso = "https://www.transfermarkt.es/suso/profil/spieler/111961";
    String urlPapuGomez = "https://www.transfermarkt.es/papu-gomez/profil/spieler/20005";
    String urlEnNessiry = "https://www.transfermarkt.es/youssef-en-nesyri/profil/spieler/433049";
    String urlLuukDeJong = "https://www.transfermarkt.es/luuk-de-jong/profil/spieler/72522";
    String urlMunir = "https://www.transfermarkt.es/munir-el-haddadi/profil/spieler/223725";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevilla);

        btnBono = findViewById(R.id.btnBono);
        btnVaclik = findViewById(R.id.btnVaclik);
        btnJaviDiaz = findViewById(R.id.btnJaviDiaz);
        btnKounde = findViewById(R.id.btnKounde);
        btnDiegoCarlos = findViewById(R.id.btnDiegoCarlos);
        btnSergiGomez = findViewById(R.id.btnSergiGomez);
        btnRekik = findViewById(R.id.btnRekik);
        btnGnagnon = findViewById(R.id.btnGnagnon);
        btnAcuna = findViewById(R.id.btnAcuna);
        btnSergioEscudero = findViewById(R.id.btnSergioEscudero);
        btnJesusNavas = findViewById(R.id.btnJesusNavas);
        btnAleixVidal = findViewById(R.id.btnAleixVidal);
        btnGudelj = findViewById(R.id.btnGudelj);
        btnFernandoReges = findViewById(R.id.btnFernandoReges);
        btnJoanJordan = findViewById(R.id.btnJoanJordan);
        btnOliverTorres = findViewById(R.id.btnOliverTorres);
        btnRakitic = findViewById(R.id.btnRakitic);
        btnOscarRodriguez = findViewById(R.id.btnOscarRodriguez);
        btnFrancoVazquez = findViewById(R.id.btnFrancoVazquez);
        btnOcampos = findViewById(R.id.btnOcampos);
        btnSuso = findViewById(R.id.btnSuso);
        btnPapu = findViewById(R.id.btnPapu);
        btnEnNesyri = findViewById(R.id.btnEnNesyri);
        btnLuukDeJong = findViewById(R.id.btnLuukDeJong);
        btnMunir = findViewById(R.id.btnMunir);


        btnBono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBono);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVaclik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVaclik);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviDiaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviDiaz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKounde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKounde);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiegoCarlos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiegoCarlos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergiGomez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergiGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRekik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRekik);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGnagnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGnagnon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAcuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAcuna);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioEscudero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEscudero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJesusNavas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJesusNavas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAleixVidal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAleixVidal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGudelj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGudelj);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFernandoReges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFernandoReges);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoanJordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoanJordan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOliverTorres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOliverTorres);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRakitic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRakitic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOscarRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOscarRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFrancoVazquez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFrancoVazquez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOcampos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOcampos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSuso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSuso);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPapu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPapuGomez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEnNesyri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEnNessiry);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuukDeJong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuukDeJong);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMunir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMunir);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}