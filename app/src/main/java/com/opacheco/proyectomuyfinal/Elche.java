package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elche extends AppCompatActivity {

    Button btnPauloGazzaniga, btnEdgarBadia, btnDaniCalvo, btnJosema, btnDiegoGonzalez, btnGonzaloVerdu, btnJohanMojica, btnHelibeltonPalacios, btnAntonioBarragan, btnMiguelCifuentes, btnIvanMarcone, btnOmenukeMfulu, btnLuismi, btnRaulGuti, btnFidel, btnPabloPiatti, btnTeteMorente, btnPereMilla, btnVictorRodriguez, btnEmilianoRigoni, btnJosan, btnLucasBoye, btnGuidoCarrillo, btnNino;


    String urlPazzaniga = "https://www.transfermarkt.es/paulo-gazzaniga/profil/spieler/195488";
    String urlEdgarBadia = "https://www.transfermarkt.es/edgar-badia/profil/spieler/102146";
    String urlDaniCalvo = "https://www.transfermarkt.es/dani-calvo/profil/spieler/326416";
    String urlJosema = "https://www.transfermarkt.es/josema/profil/spieler/255892";
    String urlDiegoGonzalez = "https://www.transfermarkt.es/diego-gonzalez/profil/spieler/349836";
    String urlGonzaloVerdu = "https://www.transfermarkt.es/gonzalo-verdu/profil/spieler/184779";
    String urlMojica = "https://www.transfermarkt.es/johan-mojica/profil/spieler/262939";
    String urlPalacios = "https://www.transfermarkt.es/helibelton-palacios/profil/spieler/211389";
    String urlAntonioBarragan = "transfermarkt.es/antonio-barragan/profil/spieler/32522";
    String urlMiguelCifuentes = "https://www.transfermarkt.es/miguel-cifuentes/profil/spieler/175836";
    String urlIvanMarcone = "https://www.transfermarkt.es/ivan-marcone/profil/spieler/90451";
    String urlMfulu = "https://www.transfermarkt.es/omenuke-mfulu/profil/spieler/203516";
    String urlLuismi = "https://www.transfermarkt.es/luismi/profil/spieler/207922";
    String urlRaulGuti = "https://www.transfermarkt.es/raul-guti/profil/spieler/330352";
    String urlFidel = "https://www.transfermarkt.es/fidel/profil/spieler/149231";
    String urlPabloPiatti = "https://www.transfermarkt.es/pablo-piatti/profil/spieler/56067";
    String urlTeteMorente = "https://www.transfermarkt.es/tete-morente/profil/spieler/339816";
    String urlPereMilla = "https://www.transfermarkt.es/pere-milla/profil/spieler/225593";
    String urlVictorRodriguez = "https://www.transfermarkt.es/victor-rodriguez/profil/spieler/129753";
    String urlRigoni = "https://www.transfermarkt.es/emiliano-rigoni/profil/spieler/282544";
    String urlJosan = "https://www.transfermarkt.es/josan/profil/spieler/277533";
    String urlLucasBoye = "https://www.transfermarkt.es/lucas-boye/profil/spieler/334222";
    String urlGuidoCarrillo = "https://www.transfermarkt.es/guido-carrillo/profil/spieler/184672";
    String urlNino = "https://www.transfermarkt.es/nino/profil/spieler/29178";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elche);

        btnPauloGazzaniga = findViewById(R.id.btnPauloGazzaniga);
        btnEdgarBadia = findViewById(R.id.btnEdgarBadia);
        btnDaniCalvo = findViewById(R.id.btnDaniCalvo);
        btnJosema = findViewById(R.id.btnJosema);
        btnDiegoGonzalez = findViewById(R.id.btnDiegoGonzalez);
        btnGonzaloVerdu = findViewById(R.id.btnGonzaloVerdu);
        btnJohanMojica = findViewById(R.id.btnJohanMojica);
        btnHelibeltonPalacios = findViewById(R.id.btnHelibeltonPalacios);
        btnAntonioBarragan = findViewById(R.id.btnAntonioBarragan);
        btnMiguelCifuentes = findViewById(R.id.btnMiguelCifuentes);
        btnIvanMarcone = findViewById(R.id.btnIvanMarcone);
        btnOmenukeMfulu = findViewById(R.id.btnOmenukeMfulu);
        btnLuismi = findViewById(R.id.btnLuismi);
        btnRaulGuti = findViewById(R.id.btnRaulGuti);
        btnFidel = findViewById(R.id.btnFidel);
        btnPabloPiatti = findViewById(R.id.btnPabloPiatti);
        btnTeteMorente = findViewById(R.id.btnTeteMorente);
        btnPereMilla = findViewById(R.id.btnPereMilla);
        btnVictorRodriguez = findViewById(R.id.btnVictorRodriguez);
        btnEmilianoRigoni = findViewById(R.id.btnEmilianoRigoni);
        btnJosan = findViewById(R.id.btnJosan);
        btnLucasBoye = findViewById(R.id.btnLucasBoye);
        btnGuidoCarrillo = findViewById(R.id.btnGuidoCarrillo);
        btnNino = findViewById(R.id.btnNino);

        btnPauloGazzaniga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPazzaniga);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEdgarBadia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEdgarBadia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniCalvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniCalvo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJosema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJosema);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiegoGonzalez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiegoGonzalez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGonzaloVerdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGonzaloVerdu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJohanMojica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMojica);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHelibeltonPalacios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPalacios);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAntonioBarragan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAntonioBarragan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMiguelCifuentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMiguelCifuentes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIvanMarcone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIvanMarcone);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOmenukeMfulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMfulu);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLuismi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLuismi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRaulGuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRaulGuti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFidel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFidel);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPabloPiatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPabloPiatti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTeteMorente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTeteMorente);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPereMilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPereMilla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVictorRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVictorRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmilianoRigoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRigoni);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJosan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJosan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLucasBoye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLucasBoye);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGuidoCarrillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGuidoCarrillo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNino);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}