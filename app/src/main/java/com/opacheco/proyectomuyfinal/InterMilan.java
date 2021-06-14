package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InterMilan extends AppCompatActivity {

    Button btnRadu, btnHandanovic, btnStankovic, btnPadelli, btnSkriniar, btnBastoni, btnDeVrij, btnRanocchia, btnKolarov, btnDarmian, btnAmbrossio, btnBrozovic, btnBarella, btnCagliardini, btnSensi, btnVecino, btnVidal, btnAchraf, btnPerisic, btnAshleyYoung, btnEriksen, btnLukaku, btnLautaro, btnPinamonti, btnAlexisSanchez ;

    String urlRadu = "https://www.transfermarkt.es/ionut-radu/profil/spieler/303657";
    String urlHandanovic = "https://www.transfermarkt.es/samir-handanovic/profil/spieler/28021";
    String urlStankovic = "https://www.transfermarkt.es/filip-stankovic/profil/spieler/552223";
    String urlPadelli = "https://www.transfermarkt.es/daniele-padelli/profil/spieler/27807";
    String urlSkriniar = "https://www.transfermarkt.es/milan-skriniar/profil/spieler/204069";
    String urlBastoni = "https://www.transfermarkt.es/alessandro-bastoni/profil/spieler/315853";
    String urlDeVrij = "https://www.transfermarkt.es/stefan-de-vrij/profil/spieler/111196";
    String urlRannochia = "https://www.transfermarkt.es/andrea-ranocchia/profil/spieler/44327";
    String urlKolarov = "https://www.transfermarkt.es/aleksandar-kolarov/profil/spieler/46156";
    String urlDarmian = "https://www.transfermarkt.es/matteo-darmian/profil/spieler/54906";
    String urlAmbrossio = "https://www.transfermarkt.es/danilo-dambrosio/profil/spieler/55769";
    String urlBrozovic = "https://www.transfermarkt.es/marcelo-brozovic/profil/spieler/156617";
    String urlBarella = "https://www.transfermarkt.es/nicolo-barella/profil/spieler/255942";
    String urlCagliardini = "https://www.transfermarkt.es/roberto-gagliardini/profil/spieler/197471";
    String urlSensi = "https://www.transfermarkt.es/stefano-sensi/profil/spieler/216179";
    String urlVecino = "https://www.transfermarkt.es/matias-vecino/profil/spieler/143812";
    String urlVidal = "https://www.transfermarkt.es/arturo-vidal/profil/spieler/37666";
    String urlAchraf = "https://www.transfermarkt.es/achraf-hakimi/profil/spieler/398073";
    String urlPerisic = "https://www.transfermarkt.es/ivan-perisic/profil/spieler/42460";
    String urlAshleyYoung = "https://www.transfermarkt.es/ashley-young/profil/spieler/14086";
    String urlEriksen = "https://www.transfermarkt.es/christian-eriksen/profil/spieler/69633";
    String urlLukaku = "https://www.transfermarkt.es/romelu-lukaku/profil/spieler/96341";
    String urlLautaro = "https://www.transfermarkt.es/lautaro-martinez/profil/spieler/406625";
    String urlPinamonti = "https://www.transfermarkt.es/andrea-pinamonti/profil/spieler/315865";
    String urlAlexisSanchez = "https://www.transfermarkt.es/alexis-sanchez/profil/spieler/40433";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_milan);

        btnRadu = findViewById(R.id.btnRadu);
        btnHandanovic = findViewById(R.id.btnHandanovic);
        btnStankovic = findViewById(R.id.btnStankovic);
        btnPadelli = findViewById(R.id.btnPadelli);
        btnSkriniar = findViewById(R.id.btnSkriniar);
        btnBastoni = findViewById(R.id.btnBastoni);
        btnDeVrij = findViewById(R.id.btnDeVrij);
        btnRanocchia = findViewById(R.id.btnRanocchia);
        btnKolarov = findViewById(R.id.btnKolarov);
        btnDarmian = findViewById(R.id.btnDarmian);
        btnAmbrossio = findViewById(R.id.btnAmbrossio);
        btnBrozovic = findViewById(R.id.btnBrozovic);
        btnBarella = findViewById(R.id.btnBarella);
        btnCagliardini = findViewById(R.id.btnCagliardini);
        btnSensi = findViewById(R.id.btnSensi);
        btnVecino = findViewById(R.id.btnVecino);
        btnVidal = findViewById(R.id.btnVidal);
        btnAchraf = findViewById(R.id.btnAchraf);
        btnPerisic = findViewById(R.id.btnPerisic);
        btnAshleyYoung = findViewById(R.id.btnAshleyYoung);
        btnEriksen = findViewById(R.id.btnEriksen);
        btnLukaku = findViewById(R.id.btnLukaku);
        btnLautaro = findViewById(R.id.btnLautaro);
        btnPinamonti = findViewById(R.id.btnPinamonti);
        btnAlexisSanchez = findViewById(R.id.btnAlexisSanchez);


        btnRadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRadu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHandanovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHandanovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnStankovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlStankovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPadelli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPadelli);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSkriniar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSkriniar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBastoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBastoni);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDeVrij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDeVrij);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRanocchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRannochia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKolarov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKolarov);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarmian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarmian);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAmbrossio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAmbrossio);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrozovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrozovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBarella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBarella);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCagliardini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCagliardini);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSensi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVecino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVecino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVidal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVidal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAchraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAchraf);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPerisic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPerisic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAshleyYoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAshleyYoung);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEriksen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEriksen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLukaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLukaku);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLautaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLautaro);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPinamonti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPinamonti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexisSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexisSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}