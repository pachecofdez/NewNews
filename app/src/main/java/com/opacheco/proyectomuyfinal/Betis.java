package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Betis extends AppCompatActivity {

    Button btnJoelRobles, btnDaniMartin, btnClaudioBravo, btnMarcBartra, btnAissaMandi, btnSidnei, btnVictorRuiz, btnJuanMiranda, btnAlexMoreno, btnEmersonRoyal, btnMartinMontoya, btnGuidoRodriguez, btnWilliamCarvalho, btnVictorCamarasa, btnAndresGuardado, btnPaulAkouokou, btnNabilFekir, btnSergioCanales, btnRodriSanchez, btnCristianTello, btnDiegoLainez, btnFekir, btnJuanmi, btnAitorRuibal, btnJoaquin, btnLorenMoron, btnBorjaIglesias;

    String urlJoelRobles = "https://www.transfermarkt.es/joel-robles/profil/spieler/101118";
    String urlDaniMartin = "https://www.transfermarkt.es/dani-martin/profil/spieler/335221";
    String urlClaudioBravo = "https://www.transfermarkt.es/claudio-bravo/profil/spieler/40423";
    String urlMarcBartra = "https://www.transfermarkt.es/marc-bartra/profil/spieler/99922";
    String urlMandi = "https://www.transfermarkt.es/aissa-mandi/profil/spieler/80293";
    String urlSidnei = "https://www.transfermarkt.es/sidnei/profil/spieler/27374";
    String urlVictorRuiz = "https://www.transfermarkt.es/victor-ruiz/profil/spieler/62920";
    String urlJuanMiranda = "https://www.transfermarkt.es/juan-miranda/profil/spieler/341227";
    String urlAlexMoreno = "https://www.transfermarkt.es/alex-moreno/profil/spieler/193098";
    String urlEmersonRoyal = "https://www.transfermarkt.es/emerson-royal/profil/spieler/476344";
    String urlMartinMontoya = "https://www.transfermarkt.es/martin-montoya/profil/spieler/68645";
    String urlGuidoRodriguez = "https://www.transfermarkt.es/guido-rodriguez/profil/spieler/342385";
    String urlWilliamCarvalho = "https://www.transfermarkt.es/william-carvalho/profil/spieler/100131";
    String urlVictorCamarasa = "https://www.transfermarkt.es/victor-camarasa/profil/spieler/263856";
    String urlAndresGuardado = "https://www.transfermarkt.es/andres-guardado/profil/spieler/20506";
    String urlAkoukou = "https://www.transfermarkt.es/paul-akouokou/profil/spieler/429901";
    String urlNabilFekir = "https://www.transfermarkt.es/nabil-fekir/profil/spieler/203496";
    String urlSergioCanales = "https://www.transfermarkt.es/sergio-canales/profil/spieler/66106";
    String urlRodriSanchez = "https://www.transfermarkt.es/rodri-sanchez/profil/spieler/630995";
    String urlCristianTello = "https://www.transfermarkt.es/cristian-tello/profil/spieler/141834";
    String urlDiegoLainez = "https://www.transfermarkt.es/diego-lainez/profil/spieler/371174";
    String urlYassinFekir = "https://www.transfermarkt.es/yassin-fekir/profil/spieler/395694";
    String urlJuanmi = "https://www.transfermarkt.es/juanmi/profil/spieler/126737";
    String urlAitorRuibal = "https://www.transfermarkt.es/aitor-ruibal/profil/spieler/378139";
    String urlJoaquin = "https://www.transfermarkt.es/joaquin/profil/spieler/7663";
    String urlLorenMoron = "https://www.transfermarkt.es/loren-moron/profil/spieler/354741";
    String urlBorjaIglesias = "https://www.transfermarkt.es/borja-iglesias/profil/spieler/278359";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_betis);

        btnJoelRobles = findViewById(R.id.btnJoelRobles);
        btnDaniMartin = findViewById(R.id.btnDaniMartin);
        btnClaudioBravo = findViewById(R.id.btnClaudioBravo);
        btnMarcBartra = findViewById(R.id.btnMarcBartra);
        btnAissaMandi = findViewById(R.id.btnAissaMandi);
        btnSidnei = findViewById(R.id.btnSidnei);
        btnVictorRuiz = findViewById(R.id.btnVictorRuiz);
        btnJuanMiranda = findViewById(R.id.btnJuanMiranda);
        btnAlexMoreno = findViewById(R.id.btnAlexMoreno);
        btnEmersonRoyal = findViewById(R.id.btnEmersonRoyal);
        btnMartinMontoya = findViewById(R.id.btnMartinMontoya);
        btnGuidoRodriguez = findViewById(R.id.btnGuidoRodriguez);
        btnWilliamCarvalho = findViewById(R.id.btnWilliamCarvalho);
        btnVictorCamarasa = findViewById(R.id.btnVictorCamarasa);
        btnAndresGuardado = findViewById(R.id.btnAndresGuardado);
        btnPaulAkouokou = findViewById(R.id.btnPaulAkouokou);
        btnNabilFekir = findViewById(R.id.btnNabilFekir);
        btnSergioCanales = findViewById(R.id.btnSergioCanales);
        btnRodriSanchez = findViewById(R.id.btnRodriSanchez);
        btnCristianTello = findViewById(R.id.btnCristianTello);
        btnDiegoLainez = findViewById(R.id.btnDiegoLainez);
        btnFekir = findViewById(R.id.btnFekir);
        btnJuanmi = findViewById(R.id.btnJuanmi);
        btnAitorRuibal = findViewById(R.id.btnAitorRuibal);
        btnJoaquin = findViewById(R.id.btnJoaquin);
        btnLorenMoron = findViewById(R.id.btnLorenMoron);
        btnBorjaIglesias = findViewById(R.id.btnBorjaIglesias);


        btnJoelRobles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoelRobles);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDaniMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDaniMartin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnClaudioBravo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlClaudioBravo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcBartra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcBartra);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAissaMandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMandi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSidnei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSidnei);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVictorRuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVictorRuiz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanMiranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanMiranda);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAlexMoreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAlexMoreno);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEmersonRoyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmersonRoyal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMartinMontoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMartinMontoya);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGuidoRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGuidoRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWilliamCarvalho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWilliamCarvalho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVictorCamarasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVictorCamarasa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAndresGuardado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAndresGuardado);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPaulAkouokou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAkoukou);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNabilFekir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNabilFekir);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioCanales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioCanales);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodriSanchez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodriSanchez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCristianTello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCristianTello);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiegoLainez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiegoLainez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFekir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlYassinFekir);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJuanmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJuanmi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAitorRuibal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAitorRuibal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJoaquin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJoaquin);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLorenMoron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLorenMoron);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBorjaIglesias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBorjaIglesias);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}