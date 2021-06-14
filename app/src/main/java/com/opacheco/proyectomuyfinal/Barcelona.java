package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barcelona extends AppCompatActivity {


    Button btnTerStegen, btnNeto, btnInakiPena, btnAraujo, btnLenglet, btnPique, btnUmtiti, btnMingueza, btnJordiAlba, btnJuniorFirpo, btnSerginoDest, btnSergiRoberto, btnWague, btnBusquets, btnMatheusFernandes, btnFrenkieDeJong, btnPjanic, btnRiquiPuig, btnIllaixMoriba, btnPedri, btnCoutinho, btnAnsuFati, btnKonrad, btnMessi, btnDembele, btnTrincao, btnGriezmann, btnBraithwaite;

    String urlTerStegen = "https://www.transfermarkt.es/marc-andre-ter-stegen/profil/spieler/74857";
    String urlNeto = "https://www.transfermarkt.es/neto/profil/spieler/111819";
    String urlInakiPena = "https://www.transfermarkt.es/inaki-pena/profil/spieler/283170";
    String urlAraujo = "https://www.transfermarkt.es/ronald-araujo/profil/spieler/480267";
    String urlLenglet = "https://www.transfermarkt.es/clement-lenglet/profil/spieler/182904";
    String urlPique = "https://www.transfermarkt.es/gerard-pique/profil/spieler/18944";
    String urlUmtiti = "https://www.transfermarkt.es/samuel-umtiti/profil/spieler/126540";
    String urlMingueza = "https://www.transfermarkt.es/oscar-mingueza/profil/spieler/331505";
    String urlJordiAlba = "https://www.transfermarkt.es/jordi-alba/profil/spieler/69751";
    String urlJuniorFirpo = "https://www.transfermarkt.es/junior-firpo/profil/spieler/374139";
    String urlSerginoDest = "https://www.transfermarkt.es/sergino-dest/profil/spieler/361104";
    String urlSergiRoberto = "https://www.transfermarkt.es/sergi-roberto/profil/spieler/85370";
    String urlWague = "https://www.transfermarkt.es/moussa-wague/profil/spieler/364240";
    String urlBusquets = "https://www.transfermarkt.es/sergio-busquets/profil/spieler/65230";
    String urlMatheusFernandes = "https://www.transfermarkt.es/matheus-fernandes/profil/spieler/351892";
    String urlFrenkieDeJong = "https://www.transfermarkt.es/frenkie-de-jong/profil/spieler/326330";
    String urlPjanic = "https://www.transfermarkt.es/miralem-pjani%C4%87/profil/spieler/44162";
    String urlRiquiPuig = "https://www.transfermarkt.es/riqui-puig/profil/spieler/331511";
    String urlIllaix = "https://www.transfermarkt.es/ilaix-moriba/profil/spieler/617074";
    String urlPedri = "https://www.transfermarkt.es/pedri/profil/spieler/683840";
    String urlCoutinho = "https://www.transfermarkt.es/philippe-coutinho/profil/spieler/80444";
    String urlAnsuFati = "https://www.transfermarkt.es/ansu-fati/profil/spieler/466810";
    String urlKonrad = "https://www.transfermarkt.es/konrad-de-la-fuente/profil/spieler/466809";
    String urlMessi = "https://www.transfermarkt.es/lionel-messi/profil/spieler/28003";
    String urlDembele = "https://www.transfermarkt.es/ousmane-dembele/profil/spieler/288230";
    String urlTrincao = "https://www.transfermarkt.es/trincao/profil/spieler/412669";
    String urlGriezmann = "https://www.transfermarkt.es/antoine-griezmann/profil/spieler/125781";
    String urlBraithwaite = "https://www.transfermarkt.es/martin-braithwaite/profil/spieler/95732";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);


        btnTerStegen = findViewById(R.id.btnTerStegen);
        btnNeto = findViewById(R.id.btnNeto);
        btnInakiPena = findViewById(R.id.btnInakiPena);
        btnAraujo = findViewById(R.id.btnAraujo);
        btnLenglet = findViewById(R.id.btnLenglet);
        btnPique = findViewById(R.id.btnPique);
        btnUmtiti = findViewById(R.id.btnUmtiti);
        btnMingueza = findViewById(R.id.btnMingueza);
        btnJordiAlba = findViewById(R.id.btnJordiAlba);
        btnJuniorFirpo = findViewById(R.id.btnJuniorFirpo);
        btnSerginoDest = findViewById(R.id.btnSerginoDest);
        btnSergiRoberto = findViewById(R.id.btnSergiRoberto);
        btnWague = findViewById(R.id.btnWague);
        btnBusquets = findViewById(R.id.btnBusquets);
        btnMatheusFernandes = findViewById(R.id.btnMatheusFernandes);
        btnFrenkieDeJong = findViewById(R.id.btnFrenkieDeJong);
        btnPjanic = findViewById(R.id.btnPjanic);
        btnRiquiPuig = findViewById(R.id.btnRiquiPuig);
        btnIllaixMoriba = findViewById(R.id.btnIllaixMoriba);
        btnPedri = findViewById(R.id.btnPedri);
        btnCoutinho = findViewById(R.id.btnCoutinho);
        btnAnsuFati = findViewById(R.id.btnAnsuFati);
        btnKonrad = findViewById(R.id.btnKonrad);
        btnMessi = findViewById(R.id.btnMessi);
        btnDembele = findViewById(R.id.btnDembele);
        btnTrincao = findViewById(R.id.btnTrincao);
        btnGriezmann = findViewById(R.id.btnGriezmann);
        btnBraithwaite = findViewById(R.id.btnBraithwaite);


        btnTerStegen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTerStegen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNeto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnInakiPena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInakiPena);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAraujo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAraujo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLenglet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLenglet);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPique);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnUmtiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlUmtiti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMingueza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMingueza);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJordiAlba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJordiAlba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuniorFirpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuniorFirpo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSerginoDest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSerginoDest);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergiRoberto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergiRoberto);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWague);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBusquets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBusquets);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMatheusFernandes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMatheusFernandes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFrenkieDeJong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFrenkieDeJong);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPjanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPjanic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRiquiPuig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRiquiPuig);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIllaixMoriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIllaix);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPedri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPedri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCoutinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCoutinho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAnsuFati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAnsuFati);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKonrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKonrad);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMessi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDembele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDembele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTrincao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTrincao);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGriezmann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGriezmann);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBraithwaite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBraithwaite);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });










    }
}