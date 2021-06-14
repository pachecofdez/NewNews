package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tottenham extends AppCompatActivity {


    Button btnHugoLloris, btnJoeHart, btnWhiteMan, btnDavinsonSanchez, btnDier, btnAlderweireld, btnRodon, btnTanganga, btnCarterVickers, btnReguilon, btnBenDavies, btnDannyRose, btnAurier, btnDoherty, btnWinks, btnSkipp, btnNdombele, btnHojberg, btnLoCelso, btnSissoko, btnDeleAlli, btnHeungMinSon, btnBergwijm, btnLucasMoura, btnBale, btnLamela, btnClarke, btnKane, btnCarlosVinicius;


    String urlHugoLloris = "https://www.transfermarkt.es/hugo-lloris/profil/spieler/17965";
    String urlJoeHart = "https://www.transfermarkt.es/joe-hart/profil/spieler/40204";
    String urlWhiteMan = "https://www.transfermarkt.es/alfie-whiteman/profil/spieler/282823";
    String urlDavinsonSanchez = "https://www.transfermarkt.es/davinson-sanchez/profil/spieler/341429";
    String urlDier = "https://www.transfermarkt.es/eric-dier/profil/spieler/175722";
    String urlAlderweireld = "https://www.transfermarkt.es/toby-alderweireld/profil/spieler/42710";
    String urlRodon = "https://www.transfermarkt.es/joe-rodon/profil/spieler/297212";
    String urlTanganga = "https://www.transfermarkt.es/japhet-tanganga/profil/spieler/346478";
    String urlCarterVickers = "https://www.transfermarkt.es/cameron-carter-vickers/profil/spieler/341049";
    String urlReguilon = "https://www.transfermarkt.es/sergio-reguilon/profil/spieler/282429";
    String urlBenDavies = "https://www.transfermarkt.es/ben-davies/profil/spieler/192765";
    String urlDannyRose = "https://www.transfermarkt.es/danny-rose/profil/spieler/50174";
    String urlAurier = "https://www.transfermarkt.es/serge-aurier/profil/spieler/127032";
    String urlDoherty = "https://www.transfermarkt.es/matt-doherty/profil/spieler/171679";
    String urlWinks = "https://www.transfermarkt.es/harry-winks/profil/spieler/249126";
    String urlSkipp = "https://www.transfermarkt.es/oliver-skipp/profil/spieler/406638";
    String urlNdombele = "https://www.transfermarkt.es/tanguy-ndombele/profil/spieler/450936";
    String urlHojberg = "https://www.transfermarkt.es/pierre-emile-hojbjerg/profil/spieler/167799";
    String urlLoCelso = "https://www.transfermarkt.es/giovani-lo-celso/profil/spieler/348795";
    String urlSissoko = "https://www.transfermarkt.es/moussa-sissoko/profil/spieler/46001";
    String urlDeleAlli = "https://www.transfermarkt.es/dele-alli/profil/spieler/207929";
    String urlHeungMinSon = "https://www.transfermarkt.es/heung-min-son/profil/spieler/91845";
    String urlBergwijm = "https://www.transfermarkt.es/steven-bergwijn/profil/spieler/284165";
    String urlLucasMoura = "https://www.transfermarkt.es/lucas-moura/profil/spieler/77100";
    String urlBale = "https://www.transfermarkt.es/gareth-bale/profil/spieler/39381";
    String urlLamela = "https://www.transfermarkt.es/erik-lamela/profil/spieler/111630";
    String urlClarke = "https://www.transfermarkt.es/jack-clarke/profil/spieler/559794";
    String urlKane = "https://www.transfermarkt.es/harry-kane/profil/spieler/132098";
    String urlCarlosVinicius = "https://www.transfermarkt.es/carlos-vinicius/profil/spieler/525287";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tottenham);

        btnHugoLloris = findViewById(R.id.btnHugoLloris);
        btnJoeHart = findViewById(R.id.btnJoeHart);
        btnWhiteMan = findViewById(R.id.btnWhiteMan);
        btnDavinsonSanchez = findViewById(R.id.btnDavinsonSanchez);
        btnDier = findViewById(R.id.btnDier);
        btnAlderweireld = findViewById(R.id.btnAlderweireld);
        btnRodon = findViewById(R.id.btnRodon);
        btnTanganga = findViewById(R.id.btnTanganga);
        btnCarterVickers = findViewById(R.id.btnCarterVickers);
        btnReguilon = findViewById(R.id.btnReguilon);
        btnBenDavies = findViewById(R.id.btnBenDavies);
        btnDannyRose = findViewById(R.id.btnDannyRose);
        btnAurier = findViewById(R.id.btnAurier);
        btnDoherty = findViewById(R.id.btnDoherty);
        btnWinks = findViewById(R.id.btnWinks);
        btnSkipp = findViewById(R.id.btnSkipp);
        btnNdombele = findViewById(R.id.btnNdombele);
        btnHojberg = findViewById(R.id.btnHojberg);
        btnLoCelso = findViewById(R.id.btnLoCelso);
        btnSissoko = findViewById(R.id.btnSissoko);
        btnDeleAlli = findViewById(R.id.btnDeleAlli);
        btnHeungMinSon = findViewById(R.id.btnHeungMinSon);
        btnBergwijm = findViewById(R.id.btnBergwijm);
        btnLucasMoura = findViewById(R.id.btnLucasMoura);
        btnBale = findViewById(R.id.btnBale);
        btnLamela = findViewById(R.id.btnLamela);
        btnClarke = findViewById(R.id.btnClarke);
        btnKane = findViewById(R.id.btnKane);
        btnCarlosVinicius = findViewById(R.id.btnCarlosVinicius);


        btnHugoLloris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHugoLloris);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoeHart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoeHart);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWhiteMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWhiteMan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavinsonSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavinsonSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlderweireld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlderweireld);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTanganga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTanganga);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarterVickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarterVickers);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnReguilon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlReguilon);
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

        btnDannyRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDannyRose);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAurier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAurier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDoherty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDoherty);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWinks);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSkipp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSkipp);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNdombele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNdombele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHojberg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHojberg);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLoCelso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLoCelso);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnSissoko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSissoko);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeleAlli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeleAlli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHeungMinSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHeungMinSon);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBergwijm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBergwijm);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasMoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasMoura);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBale);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLamela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLamela);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnClarke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlClarke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlosVinicius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlosVinicius);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}