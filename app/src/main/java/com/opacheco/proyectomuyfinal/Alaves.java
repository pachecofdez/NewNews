package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alaves extends AppCompatActivity {

    Button btnFernandoPacheco, btnAntonioSivera, btnVictorLaguardia, btnFlorianLejeune, btnRodrigoEly, btnTachi, btnRubenDuarte, btnJaviLopez, btnMartinAguirregabiria, btnXimoNavarro, btnPerePons, btnManuGarcia, btnRodrigoBattaglia, btnTomasPina, btnInigoCordoba, btnBorjaSainz, btnLuisRioja, btnBurgui, btnFacundoPellistri, btnEdgarMendez, btnJotaPeleteiro, btnLucasPerez, btnJoselu, btnDeyverson, btnJohnGuidetti;

    String urlFernandoPacheco = "https://www.transfermarkt.es/fernando-pacheco/profil/spieler/172015";
    String urlAntonioSivera = "https://www.transfermarkt.es/antonio-sivera/profil/spieler/298197";
    String urlVictorLaguardia = "https://www.transfermarkt.es/victor-laguardia/profil/spieler/67080";
    String urlFlorianLejeune = "https://www.transfermarkt.es/florian-lejeune/profil/spieler/127108";
    String urlRodrigoEly = "https://www.transfermarkt.es/rodrigo-ely/profil/spieler/176140";
    String urlTachi = "https://www.transfermarkt.es/tachi/profil/spieler/354697";
    String urlRubenDuarte = "https://www.transfermarkt.es/ruben-duarte/profil/spieler/177046";
    String urlJaviLopez = "https://www.transfermarkt.es/javi-lopez/profil/spieler/568158";
    String urlMartinAguirregabiria = "https://www.transfermarkt.es/martin-aguirregabiria/profil/spieler/483573";
    String urlXimoNavarro = "https://www.transfermarkt.es/ximo-navarro/profil/spieler/184767";
    String urlPerePons = "https://www.transfermarkt.es/pere-pons/profil/spieler/242497";
    String urlManuGarcia = "https://www.transfermarkt.es/manu-garcia/profil/spieler/76273";
    String urlRodrigoBattaglia = "https://www.transfermarkt.es/rodrigo-battaglia/profil/spieler/89297";
    String urlTomasPina = "https://www.transfermarkt.es/tomas-pina/profil/spieler/139895";
    String urlInigoCordoba = "https://www.transfermarkt.es/inigo-cordoba/profil/spieler/251848";
    String urlBorjaSainz = "https://www.transfermarkt.es/borja-sainz/profil/spieler/634461";
    String urlLuisRioja = "https://www.transfermarkt.es/luis-rioja/profil/spieler/278837";
    String urlBurgui = "https://www.transfermarkt.es/burgui/profil/spieler/246277";
    String urlFacundoPellistri = "https://www.transfermarkt.es/facundo-pellistri/profil/spieler/676318";
    String urlEdgarMendez = "https://www.transfermarkt.es/edgar-mendez/profil/spieler/133794";
    String urlJotaPeleteiro = "https://www.transfermarkt.es/jota-peleteiro/profil/spieler/176591";
    String urlLucasPerez = "https://www.transfermarkt.es/lucas-perez/profil/spieler/73185";
    String urlJoselu = "https://www.transfermarkt.es/joselu/profil/spieler/81999";
    String urlDeyverson = "https://www.transfermarkt.es/deyverson/profil/spieler/243541";
    String urlGuidetti = "https://www.transfermarkt.es/john-guidetti/profil/spieler/98596";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaves);

        btnFernandoPacheco = findViewById(R.id.btnFernandoPacheco);
        btnAntonioSivera = findViewById(R.id.btnAntonioSivera);
        btnVictorLaguardia = findViewById(R.id.btnVictorLaguardia);
        btnFlorianLejeune = findViewById(R.id.btnFlorianLejeune);
        btnRodrigoEly = findViewById(R.id.btnRodrigoEly);
        btnTachi = findViewById(R.id.btnTachi);
        btnRubenDuarte = findViewById(R.id.btnRubenDuarte);
        btnJaviLopez = findViewById(R.id.btnJaviLopez);
        btnMartinAguirregabiria = findViewById(R.id.btnMartinAguirregabiria);
        btnXimoNavarro = findViewById(R.id.btnXimoNavarro);
        btnPerePons = findViewById(R.id.btnPerePons);
        btnManuGarcia = findViewById(R.id.btnManuGarcia);
        btnRodrigoBattaglia = findViewById(R.id.btnRodrigoBattaglia);
        btnTomasPina = findViewById(R.id.btnTomasPina);
        btnInigoCordoba = findViewById(R.id.btnInigoCordoba);
        btnBorjaSainz = findViewById(R.id.btnBorjaSainz);
        btnLuisRioja = findViewById(R.id.btnLuisRioja);
        btnBurgui = findViewById(R.id.btnBurgui);
        btnFacundoPellistri = findViewById(R.id.btnFacundoPellistri);
        btnEdgarMendez = findViewById(R.id.btnEdgarMendez);
        btnJotaPeleteiro = findViewById(R.id.btnJotaPeleteiro);
        btnLucasPerez = findViewById(R.id.btnLucasPerez);
        btnJoselu = findViewById(R.id.btnJoselu);
        btnDeyverson = findViewById(R.id.btnDeyverson);
        btnJohnGuidetti = findViewById(R.id.btnJohnGuidetti);

        btnFernandoPacheco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFernandoPacheco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonioSivera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonioSivera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVictorLaguardia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVictorLaguardia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFlorianLejeune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFlorianLejeune);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodrigoEly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodrigoEly);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTachi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenDuarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenDuarte);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaviLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaviLopez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMartinAguirregabiria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMartinAguirregabiria);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnXimoNavarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlXimoNavarro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPerePons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPerePons);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnManuGarcia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlManuGarcia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodrigoBattaglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodrigoBattaglia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomasPina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomasPina);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnInigoCordoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlInigoCordoba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBorjaSainz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBorjaSainz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuisRioja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuisRioja);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBurgui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBurgui);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFacundoPellistri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFacundoPellistri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEdgarMendez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEdgarMendez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJotaPeleteiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJotaPeleteiro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasPerez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasPerez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoselu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoselu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeyverson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeyverson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJohnGuidetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGuidetti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}