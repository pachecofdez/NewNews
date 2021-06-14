package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fulham extends AppCompatActivity {

    Button btnAreola, btnRodak, btnBettinelli, btnFabri, btnAndersen, btnTosin, btnAlfie, btnMichaelHector, btnTerenceKongolo, btnTimReam, btnAntonee, btnJoeBryan, btnOlaAina, btnKennyTete, btnSessegnon, btnCyrus, btnDenisOdoi, btnAnguissa, btnKevinMcdonald, btnHarrisonReed, btnTomCairney, btnJohansen, btnBobbyReid, btnJoshOnomah, btnKebano, btnLookman, btnCabaleiro, btnKnockaert, btnMitrovic, btnMaja;

    String urlAreola = "https://www.transfermarkt.es/alphonse-areola/profil/spieler/120629";
    String urlRodak = "https://www.transfermarkt.es/marek-rodak/profil/spieler/186901";
    String urlBettinelli = "https://www.transfermarkt.es/marcus-bettinelli/profil/spieler/116648";
    String urlFabri= "https://www.transfermarkt.es/fabri/profil/spieler/45882" ;
    String urlAndersen = "https://www.transfermarkt.es/joachim-andersen/profil/spieler/260827";
    String urlTosin = "https://www.transfermarkt.es/tosin-adarabioyo/profil/spieler/258878";
    String urlAlfie = "https://www.transfermarkt.es/alfie-mawson/profil/spieler/287431";
    String urlMichaelHector = "https://www.transfermarkt.es/michael-hector/profil/spieler/157490";
    String urlTerenceKongolo = "https://www.transfermarkt.es/terence-kongolo/profil/spieler/152651";
    String urlTimReam= "https://www.transfermarkt.es/tim-ream/profil/spieler/145466" ;
    String urlAntonee = "https://www.transfermarkt.es/antonee-robinson/profil/spieler/349701";
    String urlJoeBryan= "https://www.transfermarkt.es/joe-bryan/profil/spieler/194460" ;
    String urlOlaAina = "https://www.transfermarkt.es/ola-aina/profil/spieler/236490";
    String urlKennyTete= "https://www.transfermarkt.es/kenny-tete/profil/spieler/206746" ;
    String urlSessegnon = "https://www.transfermarkt.es/steven-sessegnon/profil/spieler/406558";
    String urlCyrus= "https://www.transfermarkt.es/cyrus-christie/profil/spieler/158623" ;
    String urlDenisOdoi = "https://www.transfermarkt.es/denis-odoi/profil/spieler/59641";
    String urlAnguissa= "https://www.transfermarkt.es/andre-zambo-anguissa/profil/spieler/354361" ;
    String urlKevinMcdonald = "https://www.transfermarkt.es/kevin-mcdonald/profil/spieler/36529";
    String urlHarrisonReed = "https://www.transfermarkt.es/harrison-reed/profil/spieler/226973";
    String urlTomCairney= "https://www.transfermarkt.es/tom-cairney/profil/spieler/123275" ;
    String urlJohansen = "https://www.transfermarkt.es/stefan-johansen/profil/spieler/62008";
    String urlBobbyReid = "https://www.transfermarkt.es/bobby-reid/profil/spieler/186186";
    String urlJoshOnomah = "https://www.transfermarkt.es/josh-onomah/profil/spieler/243589";
    String urlKebano = "https://www.transfermarkt.es/neeskens-kebano/profil/spieler/111422";
    String urlLookman = "https://www.transfermarkt.es/ademola-lookman/profil/spieler/406040";
    String urlCabaleiro = "https://www.transfermarkt.es/ivan-cavaleiro/profil/spieler/149716";
    String urlKnockaert = "https://www.transfermarkt.es/anthony-knockaert/profil/spieler/149237";
    String urlMitrovic = "https://www.transfermarkt.es/aleksandar-mitrovic/profil/spieler/51152";
    String urlMaja= "https://www.transfermarkt.es/josh-maja/profil/spieler/453824" ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fulham);

        btnAreola = findViewById(R.id.btnAreola);
        btnRodak = findViewById(R.id.btnRodak);
        btnBettinelli = findViewById(R.id.btnBettinelli);
        btnFabri = findViewById(R.id.btnFabri);
        btnAndersen = findViewById(R.id.btnAndersen);
        btnTosin = findViewById(R.id.btnTosin);
        btnAlfie = findViewById(R.id.btnAlfie);
        btnMichaelHector = findViewById(R.id.btnMichaelHector);
        btnTerenceKongolo = findViewById(R.id.btnTerenceKongolo);
        btnTimReam = findViewById(R.id.btnTimReam);
        btnAntonee = findViewById(R.id.btnAntonee);
        btnJoeBryan = findViewById(R.id.btnJoeBryan);
        btnOlaAina = findViewById(R.id.btnOlaAina);
        btnKennyTete = findViewById(R.id.btnKennyTete);
        btnSessegnon = findViewById(R.id.btnSessegnon);
        btnCyrus = findViewById(R.id.btnCyrus);
        btnDenisOdoi = findViewById(R.id.btnDenisOdoi);
        btnAnguissa = findViewById(R.id.btnAnguissa);
        btnKevinMcdonald = findViewById(R.id.btnKevinMcdonald);
        btnHarrisonReed = findViewById(R.id.btnHarrisonReed);
        btnTomCairney = findViewById(R.id.btnTomCairney);
        btnJohansen = findViewById(R.id.btnJohansen);
        btnBobbyReid = findViewById(R.id.btnBobbyReid);
        btnJoshOnomah = findViewById(R.id.btnJoshOnomah);
        btnKebano = findViewById(R.id.btnKebano);
        btnLookman = findViewById(R.id.btnLookman);
        btnCabaleiro = findViewById(R.id.btnCabaleiro);
        btnKnockaert = findViewById(R.id.btnKnockaert);
        btnMitrovic = findViewById(R.id.btnMitrovic);
        btnMaja = findViewById(R.id.btnMaja);


        btnAreola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAreola);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodak);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBettinelli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBettinelli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFabri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFabri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndersen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTosin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTosin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlfie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlfie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichaelHector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichaelHector);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTerenceKongolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTerenceKongolo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTimReam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTimReam);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonee);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoeBryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoeBryan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOlaAina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOlaAina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKennyTete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKennyTete);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSessegnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSessegnon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCyrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCyrus);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDenisOdoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDenisOdoi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnguissa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnguissa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKevinMcdonald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKevinMcdonald);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHarrisonReed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHarrisonReed);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomCairney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomCairney);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJohansen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJohansen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBobbyReid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBobbyReid);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoshOnomah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoshOnomah);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKebano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKebano);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLookman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLookman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCabaleiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCabaleiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKnockaert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKnockaert);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMitrovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMitrovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaja);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });







    }
}