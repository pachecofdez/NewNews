package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RealSociedad extends AppCompatActivity {

    Button btnAlexRemiro, btnMiguelAngelMoya, btnLeNormand, btnElustondo, btnSagnan, btnAihenMunoz, btnNachoMonreal, btnGorosabel, btnJosebaZaldua, btnZubeldia, btnZubimendi, btnIllarramendi, btnMikelMerino, btnAnderGuevara, btnGuridi, btnRobertoLopez, btnDavidSilva, btnSangalli, btnOyarzabal, btnBarrenetxea, btnMerquelanz, btnPortu, btnJanuzaj, btnIsak, btnCarlosFernandez, btnJonBautista;

    String urlAlexRemiro = "https://www.transfermarkt.es/alex-remiro/profil/spieler/212862";
    String urlMiguelAngelMoya = "https://www.transfermarkt.es/miguel-angel-moya/profil/spieler/26065";
    String urlLeNormand = "https://www.transfermarkt.es/robin-le-normand/profil/spieler/351809";
    String urlAritzElustondo = "https://www.transfermarkt.es/aritz-elustondo/profil/spieler/229804";
    String urlModiboSagnan = "https://www.transfermarkt.es/modibo-sagnan/profil/spieler/524925";
    String urlAihenMunoz = "https://www.transfermarkt.es/aihen-munoz/profil/spieler/517842";
    String urlNachoMonreal = "https://www.transfermarkt.es/nacho-monreal/profil/spieler/43003";
    String urlAndoniGorosabel = "https://www.transfermarkt.es/andoni-gorosabel/profil/spieler/289255";
    String urlJosebaZaldua = "https://www.transfermarkt.es/joseba-zaldua/profil/spieler/197135";
    String urlIgorZubeldia = "https://www.transfermarkt.es/igor-zubeldia/profil/spieler/355628";
    String urlMartinZubimendi = "https://www.transfermarkt.es/martin-zubimendi/profil/spieler/423440";
    String urlIllarramendi = "https://www.transfermarkt.es/asier-illarramendi/profil/spieler/59344";
    String urlMikelMerino = "https://www.transfermarkt.es/mikel-merino/profil/spieler/338424";
    String urlAnderGuevara = "https://www.transfermarkt.es/ander-guevara/profil/spieler/465967";
    String urlJonGuridi = "https://www.transfermarkt.es/jon-guridi/profil/spieler/289257";
    String urlRobertoLopez = "https://www.transfermarkt.es/roberto-lopez/profil/spieler/569866";
    String urlDavidSilva = "https://www.transfermarkt.es/david-silva/profil/spieler/35518";
    String urlLucaSangalli = "https://www.transfermarkt.es/luca-sangalli/profil/spieler/289286";
    String urlOyarzabal = "https://www.transfermarkt.es/mikel-oyarzabal/profil/spieler/351478";
    String urlAnderBarrenetxea = "https://www.transfermarkt.es/ander-barrenetxea/profil/spieler/616369";
    String urlMerquelanz = "https://www.transfermarkt.es/martin-merquelanz/profil/spieler/289272";
    String urlPortu = "https://www.transfermarkt.es/portu/profil/spieler/99353";
    String urlJanuzaj = "https://www.transfermarkt.es/adnan-januzaj/profil/spieler/177847";
    String urlAlexanderIsak = "https://www.transfermarkt.es/alexander-isak/profil/spieler/349066";
    String urlCarlosFernandez = "https://www.transfermarkt.es/carlos-fernandez/profil/spieler/216464";
    String urlJonBautista = "https://www.transfermarkt.es/jon-bautista/profil/spieler/289236";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_sociedad);

        btnAlexRemiro = findViewById(R.id.btnAlexRemiro);
        btnMiguelAngelMoya = findViewById(R.id.btnMiguelAngelMoya);
        btnLeNormand = findViewById(R.id.btnLeNormand);
        btnElustondo = findViewById(R.id.btnElustondo);
        btnSagnan = findViewById(R.id.btnSagnan);
        btnAihenMunoz = findViewById(R.id.btnAihenMunoz);
        btnNachoMonreal = findViewById(R.id.btnNachoMonreal);
        btnGorosabel = findViewById(R.id.btnGorosabel);
        btnJosebaZaldua = findViewById(R.id.btnJosebaZaldua);
        btnZubeldia = findViewById(R.id.btnZubeldia);
        btnZubimendi = findViewById(R.id.btnZubimendi);
        btnIllarramendi = findViewById(R.id.btnIllarramendi);
        btnMikelMerino = findViewById(R.id.btnMikelMerino);
        btnAnderGuevara = findViewById(R.id.btnAnderGuevara);
        btnGuridi = findViewById(R.id.btnGuridi);
        btnRobertoLopez = findViewById(R.id.btnRobertoLopez);
        btnDavidSilva = findViewById(R.id.btnDavidSilva);
        btnSangalli = findViewById(R.id.btnSangalli);
        btnOyarzabal = findViewById(R.id.btnOyarzabal);
        btnBarrenetxea = findViewById(R.id.btnBarrenetxea);
        btnMerquelanz = findViewById(R.id.btnMerquelanz);
        btnPortu = findViewById(R.id.btnPortu);
        btnJanuzaj = findViewById(R.id.btnJanuzaj);
        btnIsak = findViewById(R.id.btnIsak);
        btnCarlosFernandez = findViewById(R.id.btnCarlosFernandez);
        btnJonBautista = findViewById(R.id.btnJonBautista);

        btnAlexRemiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexRemiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelAngelMoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelAngelMoya);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLeNormand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLeNormand);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnElustondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAritzElustondo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSagnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlModiboSagnan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAihenMunoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAihenMunoz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNachoMonreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNachoMonreal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGorosabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndoniGorosabel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJosebaZaldua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJosebaZaldua);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZubeldia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIgorZubeldia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZubimendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMartinZubimendi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIllarramendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIllarramendi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMikelMerino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMikelMerino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnderGuevara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnderGuevara);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGuridi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonGuridi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobertoLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobertoLopez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSangalli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucaSangalli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOyarzabal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOyarzabal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBarrenetxea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnderBarrenetxea);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


        btnMerquelanz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMerquelanz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPortu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJanuzaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJanuzaj);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIsak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexanderIsak);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosFernandez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosFernandez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJonBautista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJonBautista);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}