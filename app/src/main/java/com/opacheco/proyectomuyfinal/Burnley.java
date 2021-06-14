package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Burnley extends AppCompatActivity {


    Button btnPope, btnPeacock, btnWillNorris, btnTarkowski, btnBenMee,btnBenGibson, btnKevinLong, btnDunne, btnCharlieTaylor, btnPieters, btnLowton, btnBardsley, btnCork, btnWestWood, btnBrownhill, btnDaleStephens, btnJoshBenson, btnRobbieBrady, btnDwightMcneil, btnJohannBerg, btnChrisWood, btnAshleyBarnes, btnJayRodriguez, btnVydra, btnNumbongo;

    String urlPope = "https://www.transfermarkt.es/nick-pope/profil/spieler/192080";
    String urlPeacock = "https://www.transfermarkt.es/bailey-peacock-farrell/profil/spieler/410436";
    String urlWillNorris = "https://www.transfermarkt.es/will-norris/profil/spieler/285033";
    String urlTarkowski= "https://www.transfermarkt.es/james-tarkowski/profil/spieler/173504" ;
    String urlBenMee = "https://www.transfermarkt.es/ben-mee/profil/spieler/74810";
    String urlBenGibson = "https://www.transfermarkt.es/ben-gibson/profil/spieler/128904";
    String urlKevinLong = "https://www.transfermarkt.es/kevin-long/profil/spieler/111114";
    String urlDunne = "https://www.transfermarkt.es/jimmy-dunne/profil/spieler/396174";
    String urlCharlieTaylor = "https://www.transfermarkt.es/charlie-taylor/profil/spieler/195633";
    String urlPieters = "https://www.transfermarkt.es/erik-pieters/profil/spieler/43763";
    String urlLowton = "https://www.transfermarkt.es/matthew-lowton/profil/spieler/102258";
    String urlBardsley = "https://www.transfermarkt.es/phil-bardsley/profil/spieler/15773";
    String urlCork = "https://www.transfermarkt.es/jack-cork/profil/spieler/40613";
    String urlWestWood = "https://www.transfermarkt.es/ashley-westwood/profil/spieler/91317";
    String urlBrownhill = "https://www.transfermarkt.es/josh-brownhill/profil/spieler/293569";
    String urlDaleStephens = "https://www.transfermarkt.es/dale-stephens/profil/spieler/49755";
    String urlJoshBenson = "https://www.transfermarkt.es/josh-benson/profil/spieler/397102";
    String urlRobbieBrady = "https://www.transfermarkt.es/robbie-brady/profil/spieler/128229";
    String urlDwightMcneil= "https://www.transfermarkt.es/dwight-mcneil/profil/spieler/584769" ;
    String urlJohannBerg = "https://www.transfermarkt.es/johann-berg-gudmundsson/profil/spieler/89231";
    String urlChrisWood = "https://www.transfermarkt.es/chris-wood/profil/spieler/108725";
    String urlAshleyBarnes= "https://www.transfermarkt.es/ashley-barnes/profil/spieler/63200" ;
    String urlJayRodriguez = "https://www.transfermarkt.es/jay-rodriguez/profil/spieler/53360";
    String urlVydra = "https://www.transfermarkt.es/matej-vydra/profil/spieler/101500";
    String urlNumbongo = "https://www.transfermarkt.es/joel-mumbongo/profil/spieler/381156";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burnley);

        btnPope = findViewById(R.id.btnPope);
        btnPeacock = findViewById(R.id.btnPeacock);
        btnWillNorris = findViewById(R.id.btnWillNorris);
        btnTarkowski = findViewById(R.id.btnTarkowski);
        btnBenMee = findViewById(R.id.btnBenMee);
        btnBenGibson = findViewById(R.id.btnBenGibson);
        btnKevinLong = findViewById(R.id.btnKevinLong);
        btnDunne = findViewById(R.id.btnDunne);
        btnCharlieTaylor = findViewById(R.id.btnCharlieTaylor);
        btnPieters = findViewById(R.id.btnPieters);
        btnLowton = findViewById(R.id.btnLowton);
        btnBardsley = findViewById(R.id.btnBardsley);
        btnCork = findViewById(R.id.btnCork);
        btnWestWood = findViewById(R.id.btnWestWood);
        btnBrownhill = findViewById(R.id.btnBrownhill);
        btnDaleStephens = findViewById(R.id.btnDaleStephens);
        btnJoshBenson = findViewById(R.id.btnJoshBenson);
        btnRobbieBrady = findViewById(R.id.btnRobbieBrady);
        btnDwightMcneil = findViewById(R.id.btnDwightMcneil);
        btnJohannBerg = findViewById(R.id.btnJohannBerg);
        btnChrisWood = findViewById(R.id.btnChrisWood);
        btnAshleyBarnes = findViewById(R.id.btnAshleyBarnes);
        btnJayRodriguez = findViewById(R.id.btnJayRodriguez);
        btnVydra = findViewById(R.id.btnVydra);
        btnNumbongo = findViewById(R.id.btnNumbongo);



        btnPope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPope);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPeacock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPeacock);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWillNorris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWillNorris);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTarkowski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTarkowski);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenMee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenMee);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBenGibson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBenGibson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKevinLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKevinLong);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDunne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDunne);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnCharlieTaylor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCharlieTaylor);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnPieters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPieters);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLowton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLowton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBardsley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBardsley);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCork);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWestWood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWestWood);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrownhill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrownhill);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaleStephens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaleStephens);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoshBenson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoshBenson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobbieBrady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobbieBrady);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDwightMcneil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDwightMcneil);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJohannBerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJohannBerg);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChrisWood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChrisWood);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAshleyBarnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAshleyBarnes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJayRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJayRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVydra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVydra);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNumbongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNumbongo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });





    }
}