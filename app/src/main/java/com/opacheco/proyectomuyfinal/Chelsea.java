package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chelsea extends AppCompatActivity {


    Button btnEdouardMendy, btnKepa, btnCaballero, btnZouma, btnChristensen, btnRudiger, btnThiagoSilva, btnChillwell, btnMarcosAlonso, btnEmerson, btnReeceJames, btnAzpilicueta, btnJorginho, btnKante, btnKovacic, btnGilmour, btnMount, btnHavertz, btnZiyech, btnMusonda, btnHudsonOdoi, btnPulisic, btnWerner, btnAbraham, btnGiroud;

    String urlEdouardMendy = "https://www.transfermarkt.es/edouard-mendy/profil/spieler/442531";
    String urlKepa = "https://www.transfermarkt.es/kepa/profil/spieler/192279";
    String urlCaballero = "https://www.transfermarkt.es/willy-caballero/profil/spieler/19948";
    String urlZouma = "https://www.transfermarkt.es/kurt-zouma/profil/spieler/157509";
    String urlChristensen = "https://www.transfermarkt.es/andreas-christensen/profil/spieler/196948";
    String urlRudiger = "https://www.transfermarkt.es/antonio-rudiger/profil/spieler/86202";
    String urlThiagoSilva = "https://www.transfermarkt.es/thiago-silva/profil/spieler/29241";
    String urlChillwell = "https://www.transfermarkt.es/ben-chilwell/profil/spieler/316125";
    String urlMarcosAlonso = "https://www.transfermarkt.es/marcos-alonso/profil/spieler/112515";
    String urlEmerson = "https://www.transfermarkt.es/emerson/profil/spieler/181778";
    String urlReeceJames = "https://www.transfermarkt.es/reece-james/profil/spieler/472423";
    String urlAzpilicueta = "https://www.transfermarkt.es/cesar-azpilicueta/profil/spieler/57500";
    String urlJorginho = "https://www.transfermarkt.es/jorginho/profil/spieler/102017";
    String urlKante = "https://www.transfermarkt.es/ngolo-kante/profil/spieler/225083";
    String urlKovacic = "https://www.transfermarkt.es/mateo-kovacic/profil/spieler/51471";
    String urlGilmour = "https://www.transfermarkt.es/billy-gilmour/profil/spieler/423744";
    String urlMount = "https://www.transfermarkt.es/mason-mount/profil/spieler/346483";
    String urlHavertz = "https://www.transfermarkt.es/kai-havertz/profil/spieler/309400";
    String urlZiyech = "https://www.transfermarkt.es/hakim-ziyech/profil/spieler/217111";
    String urlMusonda = "https://www.transfermarkt.es/charly-musonda-jr-/profil/spieler/177862";
    String urlHudsonOdoi = "https://www.transfermarkt.es/callum-hudson-odoi/profil/spieler/392768";
    String urlPulisic = "https://www.transfermarkt.es/christian-pulisic/profil/spieler/315779";
    String urlWerner = "https://www.transfermarkt.es/timo-werner/profil/spieler/170527";
    String urlAbraham = "https://www.transfermarkt.es/tammy-abraham/profil/spieler/331726";
    String urlGiroud = "https://www.transfermarkt.es/olivier-giroud/profil/spieler/82442";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chelsea);

        btnEdouardMendy = findViewById(R.id.btnEdouardMendy);
        btnKepa = findViewById(R.id.btnKepa);
        btnCaballero = findViewById(R.id.btnCaballero);
        btnZouma = findViewById(R.id.btnZouma);
        btnChristensen = findViewById(R.id.btnChristensen);
        btnRudiger = findViewById(R.id.btnRudiger);
        btnThiagoSilva = findViewById(R.id.btnThiagoSilva);
        btnChillwell = findViewById(R.id.btnChillwell);
        btnMarcosAlonso = findViewById(R.id.btnMarcosAlonso);
        btnEmerson = findViewById(R.id.btnEmerson);
        btnReeceJames = findViewById(R.id.btnReeceJames);
        btnAzpilicueta = findViewById(R.id.btnAzpilicueta);
        btnJorginho = findViewById(R.id.btnJorginho);
        btnKante = findViewById(R.id.btnKante);
        btnKovacic = findViewById(R.id.btnKovacic);
        btnGilmour = findViewById(R.id.btnGilmour);
        btnMount = findViewById(R.id.btnMount);
        btnHavertz = findViewById(R.id.btnHavertz);
        btnZiyech = findViewById(R.id.btnZiyech);
        btnMusonda = findViewById(R.id.btnMusonda);
        btnHudsonOdoi = findViewById(R.id.btnHudsonOdoi);
        btnPulisic = findViewById(R.id.btnPulisic);
        btnWerner = findViewById(R.id.btnWerner);
        btnAbraham = findViewById(R.id.btnAbraham);
        btnGiroud = findViewById(R.id.btnGiroud);


        btnEdouardMendy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEdouardMendy);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKepa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKepa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCaballero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCaballero);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZouma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZouma);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChristensen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChristensen);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRudiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRudiger);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnThiagoSilva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlThiagoSilva);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChillwell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChillwell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcosAlonso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcosAlonso);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmerson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnReeceJames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlReeceJames);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAzpilicueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAzpilicueta);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJorginho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJorginho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKante);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKovacic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKovacic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGilmour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGilmour);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMount);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHavertz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHavertz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnZiyech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlZiyech);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMusonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMusonda);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHudsonOdoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHudsonOdoi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPulisic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPulisic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWerner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWerner);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAbraham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAbraham);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGiroud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGiroud);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });


    }
}