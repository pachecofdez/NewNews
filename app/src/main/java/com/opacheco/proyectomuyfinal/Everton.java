package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Everton extends AppCompatActivity {

    Button btnJordanPickford, btnRobinOlsen, btnMichaleKeane, btnBenGodfrey, btnYerryMina, btnMasonHolgate, btnJarradBranthwaite, btnPennigton, btnLucasDigne, btnNkounkou, btnSeamusColeman, btnGbamin, btnBesic, btnDoucoure, btnAllan, btnAndreGomes, btnTomDavies, btnFabianDelph, btnBaningime, btnJamesRodriguez, btnSigurdsson, btnAlexIwobi, btnBerard, btnBolasie, btnWalcott, btnJoshuaKing, btnRicharlison, btnCalvertLewin;

    String urlJordanPickford= "https://www.transfermarkt.es/jordan-pickford/profil/spieler/130164" ;
    String urlRobinOlsen = "https://www.transfermarkt.es/robin-olsen/profil/spieler/75458";
    String urlMichaleKeane = "https://www.transfermarkt.es/michael-keane/profil/spieler/118534";
    String urlBenGodfrey = "https://www.transfermarkt.es/ben-godfrey/profil/spieler/343475";
    String urlYerryMina = "https://www.transfermarkt.es/yerry-mina/profil/spieler/289446";
    String urlMasonHolgate = "https://www.transfermarkt.es/mason-holgate/profil/spieler/348623";
    String urlJarradBranthwaite = "https://www.transfermarkt.es/jarrad-branthwaite/profil/spieler/661053";
    String urlPennigton = "https://www.transfermarkt.es/matthew-pennington/profil/spieler/220755";
    String urlLucasDigne = "https://www.transfermarkt.es/lucas-digne/profil/spieler/126664";
    String urlNkounkou= "https://www.transfermarkt.es/niels-nkounkou/profil/spieler/591193" ;
    String urlSeamusColeman = "https://www.transfermarkt.es/seamus-coleman/profil/spieler/68390";
    String urlGbamin = "https://www.transfermarkt.es/jean-philippe-gbamin/profil/spieler/182894";
    String urlBesic = "https://www.transfermarkt.es/muhamed-besic/profil/spieler/93905";
    String urlDoucoure = "https://www.transfermarkt.es/abdoulaye-doucoure/profil/spieler/127187";
    String urlAllan= "https://www.transfermarkt.es/allan/profil/spieler/126422" ;
    String urlAndreGomes = "https://www.transfermarkt.es/andre-gomes/profil/spieler/221025";
    String urlTomDavies = "https://www.transfermarkt.es/tom-davies/profil/spieler/314210";
    String urlFabianDelph = "https://www.transfermarkt.es/fabian-delph/profil/spieler/50362";
    String urlBaningime = "https://www.transfermarkt.es/beni-baningime/profil/spieler/399369";
    String urlJamesRodriguez = "https://www.transfermarkt.es/james-rodriguez/profil/spieler/88103";
    String urlSigurdsson = "https://www.transfermarkt.es/gylfi-sigurdsson/profil/spieler/90466";
    String urlAlexIwobi = "https://www.transfermarkt.es/alex-iwobi/profil/spieler/242631";
    String urlBerard = "https://www.transfermarkt.es/bernard/profil/spieler/175169";
    String urlBolasie = "https://www.transfermarkt.es/yannick-bolasie/profil/spieler/75471";
    String urlWalcott= "https://www.transfermarkt.es/theo-walcott/profil/spieler/33713" ;
    String urlJoshuaKing = "https://www.transfermarkt.es/joshua-king/profil/spieler/91059";
    String urlRicharlison = "https://www.transfermarkt.es/richarlison/profil/spieler/378710";
    String urlCalvertLewin = "https://www.transfermarkt.es/dominic-calvert-lewin/profil/spieler/306024";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everton);

        btnJordanPickford = findViewById(R.id.btnJordanPickford);
        btnRobinOlsen = findViewById(R.id.btnRobinOlsen);
        btnMichaleKeane = findViewById(R.id.btnMichaleKeane);
        btnBenGodfrey = findViewById(R.id.btnBenGodfrey);
        btnYerryMina = findViewById(R.id.btnYerryMina);
        btnMasonHolgate = findViewById(R.id.btnMasonHolgate);
        btnJarradBranthwaite = findViewById(R.id.btnJarradBranthwaite);
        btnPennigton = findViewById(R.id.btnPennigton);
        btnLucasDigne = findViewById(R.id.btnLucasDigne);
        btnNkounkou = findViewById(R.id.btnNkounkou);
        btnSeamusColeman = findViewById(R.id.btnSeamusColeman);
        btnGbamin = findViewById(R.id.btnGbamin);
        btnBesic = findViewById(R.id.btnBesic);
        btnDoucoure = findViewById(R.id.btnDoucoure);
        btnAllan = findViewById(R.id.btnAllan);
        btnAndreGomes = findViewById(R.id.btnAndreGomes);
        btnTomDavies = findViewById(R.id.btnTomDavies);
        btnFabianDelph = findViewById(R.id.btnFabianDelph);
        btnBaningime = findViewById(R.id.btnBaningime);
        btnJamesRodriguez = findViewById(R.id.btnJamesRodriguez);
        btnSigurdsson = findViewById(R.id.btnSigurdsson);
        btnAlexIwobi = findViewById(R.id.btnAlexIwobi);
        btnBerard = findViewById(R.id.btnBerard);
        btnBolasie = findViewById(R.id.btnBolasie);
        btnWalcott = findViewById(R.id.btnWalcott);
        btnJoshuaKing = findViewById(R.id.btnJoshuaKing);
        btnRicharlison = findViewById(R.id.btnRicharlison);
        btnCalvertLewin = findViewById(R.id.btnCalvertLewin);

        btnJordanPickford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJordanPickford);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobinOlsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobinOlsen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichaleKeane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichaleKeane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenGodfrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenGodfrey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnYerryMina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYerryMina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMasonHolgate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMasonHolgate);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJarradBranthwaite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJarradBranthwaite);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPennigton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPennigton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasDigne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasDigne);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNkounkou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNkounkou);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSeamusColeman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSeamusColeman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGbamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGbamin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBesic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBesic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDoucoure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDoucoure);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAllan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAllan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndreGomes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndreGomes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomDavies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomDavies);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFabianDelph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFabianDelph);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBaningime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBaningime);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJamesRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJamesRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSigurdsson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSigurdsson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexIwobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexIwobi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBerard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBerard);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnBolasie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBolasie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWalcott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWalcott);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnJoshuaKing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoshuaKing);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRicharlison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRicharlison);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCalvertLewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCalvertLewin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}