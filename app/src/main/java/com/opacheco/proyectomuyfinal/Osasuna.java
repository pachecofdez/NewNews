package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Osasuna extends AppCompatActivity {

    Button btnSergioHerrera, btnRubenMartinez, btnJuanPerez, btnDavidGarcia, btnAridaneHernandez, btnUnaiGarcia, btnJonasRamalho, btnManuSanchez, btnJuanCruz, btnNachoVidal, btnFacundoRoncaglia, btnLucasTorro, btnOier, btnJonMoncayola, btnDarkoBrasanac, btnInigoPerez, btnRobertoTorres, btnJaviMartinez, btnJony, btnRubenGarcia, btnKikeBarja, btnChimyAvila, btnAnteBudimir, btnJonathanCalleri, btnEnricGallego, btnAdrianLopez;

    String urlSergioHerrera = "https://www.transfermarkt.es/sergio-herrera/profil/spieler/248738";
    String urlRubenMartinez = "https://www.transfermarkt.es/ruben-martinez/profil/spieler/8184";
    String urlJuanPerez = "https://www.transfermarkt.es/juan-perez/profil/spieler/298613";
    String urlDavidGarcia = "https://www.transfermarkt.es/david-garcia/profil/spieler/298589";
    String urlAridaneHernandez = "https://www.transfermarkt.es/aridane-hernandez/profil/spieler/82503";
    String urlUnaiGarcia = "https://www.transfermarkt.es/unai-garcia/profil/spieler/197122";
    String urlJonasRamalho = "https://www.transfermarkt.es/jonas-ramalho/profil/spieler/69660";
    String urlManuSanchez = "https://www.transfermarkt.es/manu-sanchez/profil/spieler/618809";
    String urlJuanCruz = "https://www.transfermarkt.es/juan-cruz/profil/spieler/169497";
    String urlNachoVidal = "https://www.transfermarkt.es/nacho-vidal/profil/spieler/216870";
    String urlFacundoRoncaglia = "https://www.transfermarkt.es/facundo-roncaglia/profil/spieler/61546";
    String urlLucasTorro = "https://www.transfermarkt.es/lucas-torro/profil/spieler/213670";
    String urlOier = "https://www.transfermarkt.es/oier/profil/spieler/63040";
    String urlJonMoncayola = "https://www.transfermarkt.es/jon-moncayola/profil/spieler/552425";
    String urlDarkoBrasanac = "https://www.transfermarkt.es/darko-brasanac/profil/spieler/95641";
    String urlInigoPerez = "https://www.transfermarkt.es/inigo-perez/profil/spieler/71579";
    String urlRobertoTorres = "https://www.transfermarkt.es/roberto-torres/profil/spieler/63056";
    String urlJaviMartinez = "https://www.transfermarkt.es/javi-martinez/profil/spieler/471474";
    String urlJony = "https://www.transfermarkt.es/jony/profil/spieler/228761";
    String urlRubenGarcia = "https://www.transfermarkt.es/ruben-garcia/profil/spieler/213260";
    String urlKikeBarja = "https://www.transfermarkt.es/kike-barja/profil/spieler/298575";
    String urlChimyAvila = "https://www.transfermarkt.es/chimy-avila/profil/spieler/167721";
    String urlAnteBudimir = "https://www.transfermarkt.es/ante-budimir/profil/spieler/46413";
    String urlJonathanCalleri = "https://www.transfermarkt.es/jonathan-calleri/profil/spieler/284727";
    String urlEnricGallego = "https://www.transfermarkt.es/enric-gallego/profil/spieler/114060";
    String urlAdrianLopez = "https://www.transfermarkt.es/adrian-lopez/profil/spieler/45383";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osasuna);


        btnSergioHerrera = findViewById(R.id.btnSergioHerrera);
        btnRubenMartinez = findViewById(R.id.btnRubenMartinez);
        btnJuanPerez = findViewById(R.id.btnJuanPerez);
        btnDavidGarcia = findViewById(R.id.btnDavidGarcia);
        btnAridaneHernandez = findViewById(R.id.btnAridaneHernandez);
        btnUnaiGarcia = findViewById(R.id.btnUnaiGarcia);
        btnJonasRamalho = findViewById(R.id.btnJonasRamalho);
        btnManuSanchez = findViewById(R.id.btnManuSanchez);
        btnJuanCruz = findViewById(R.id.btnJuanCruz);
        btnNachoVidal = findViewById(R.id.btnNachoVidal);
        btnFacundoRoncaglia = findViewById(R.id.btnFacundoRoncaglia);
        btnLucasTorro = findViewById(R.id.btnLucasTorro);
        btnOier = findViewById(R.id.btnOier);
        btnJonMoncayola = findViewById(R.id.btnJonMoncayola);
        btnDarkoBrasanac = findViewById(R.id.btnDarkoBrasanac);
        btnInigoPerez = findViewById(R.id.btnInigoPerez);
        btnRobertoTorres = findViewById(R.id.btnRobertoTorres);
        btnJaviMartinez = findViewById(R.id.btnJaviMartinez);
        btnJony = findViewById(R.id.btnJony);
        btnRubenGarcia = findViewById(R.id.btnRubenGarcia);
        btnKikeBarja = findViewById(R.id.btnKikeBarja);
        btnChimyAvila = findViewById(R.id.btnChimyAvila);
        btnAnteBudimir = findViewById(R.id.btnAnteBudimir);
        btnJonathanCalleri = findViewById(R.id.btnJonathanCalleri);
        btnEnricGallego = findViewById(R.id.btnEnricGallego);
        btnAdrianLopez = findViewById(R.id.btnAdrianLopez);

        btnSergioHerrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioHerrera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanPerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanPerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAridaneHernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAridaneHernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUnaiGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUnaiGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonasRamalho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonasRamalho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnManuSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlManuSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanCruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanCruz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNachoVidal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNachoVidal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFacundoRoncaglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFacundoRoncaglia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasTorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasTorro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonMoncayola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonMoncayola);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarkoBrasanac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarkoBrasanac);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnInigoPerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInigoPerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobertoTorres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertoTorres);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJony);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKikeBarja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKikeBarja);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChimyAvila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChimyAvila);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnteBudimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnteBudimir);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonathanCalleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonathanCalleri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEnricGallego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEnricGallego);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAdrianLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAdrianLopez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}