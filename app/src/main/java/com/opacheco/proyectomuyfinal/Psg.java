package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Psg extends AppCompatActivity {

    Button btnNavas, btnSergioRico, btnLetellier, btnFranchi, btnSaidana, btnMarquinhos, btnKimpembe, btnKehrer,btnDiallo, btnPembele, btnBernat, btnKurzawa, btnBakker, btnFlorenzi, btnDagba, btnParedes, btnPereira, btnGueye, btnVerratti, btnRafinha, btnHerrera, btnAtil, btnSimons, btnDraxler, btnMichut, btnNeymar, btnSarabia, btnDiMaria, btnMbappe, btnIcardi, btnKean ;

    String urlNavas = "https://www.transfermarkt.es/keylor-navas/profil/spieler/79422" ;
    String urlSergioRico = "https://www.transfermarkt.es/sergio-rico/profil/spieler/207302";
    String urlLetellier = "https://www.transfermarkt.es/alexandre-letellier/profil/spieler/93730";
    String urlFranchi= "https://www.transfermarkt.es/denis-franchi/profil/spieler/606576" ;
    String urlSaidana = "https://www.transfermarkt.es/yanis-saidani/profil/spieler/618342";
    String urlMarquinhos = "https://www.transfermarkt.es/marquinhos/profil/spieler/181767";
    String urlKimpembe= "https://www.transfermarkt.es/presnel-kimpembe/profil/spieler/282041" ;
    String urlKehrer= "https://www.transfermarkt.es/thilo-kehrer/profil/spieler/228948" ;
    String urlDiallo = "https://www.transfermarkt.es/abdou-diallo/profil/spieler/229005";
    String urlPembele = "https://www.transfermarkt.es/timothee-pembele/profil/spieler/538998";
    String urlBernat= "https://www.transfermarkt.es/juan-bernat/profil/spieler/126719" ;
    String urlKurzawa = "https://www.transfermarkt.es/layvin-kurzawa/profil/spieler/126710";
    String urlBakker = "https://www.transfermarkt.es/mitchel-bakker/profil/spieler/361065";
    String urlFlorenzi = "https://www.transfermarkt.es/alessandro-florenzi/profil/spieler/130365";
    String urlDagba = "https://www.transfermarkt.es/colin-dagba/profil/spieler/460629";
    String urlParedes = "https://www.transfermarkt.es/leandro-paredes/profil/spieler/166237";
    String urlPereira = "https://www.transfermarkt.es/danilo-pereira/profil/spieler/141050";
    String urlGueye = "https://www.transfermarkt.es/idrissa-gueye/profil/spieler/126665";
    String urlVerratti = "https://www.transfermarkt.es/marco-verratti/profil/spieler/102558";
    String urlRafinha= "https://www.transfermarkt.es/rafinha/profil/spieler/129473" ;
    String urlHerrera = "https://www.transfermarkt.es/ander-herrera/profil/spieler/99343";
    String urlAtil = "https://www.transfermarkt.es/kays-ruiz-atil/profil/spieler/538045";
    String urlSimons = "https://www.transfermarkt.es/xavi-simons/profil/spieler/566931";
    String urlDraxler = "https://www.transfermarkt.es/julian-draxler/profil/spieler/85148";
    String urlMichut= "https://www.transfermarkt.es/edouard-michut/profil/spieler/659521" ;
    String urlNeymar = "https://www.transfermarkt.es/neymar/profil/spieler/68290";
    String urlSarabia = "https://www.transfermarkt.es/pablo-sarabia/profil/spieler/74230";
    String urlDiMaria = "https://www.transfermarkt.es/angel-di-maria/profil/spieler/45320";
    String urlMbappe = "https://www.transfermarkt.es/kylian-mbappe/profil/spieler/342229";
    String urlIcardi = "https://www.transfermarkt.es/mauro-icardi/profil/spieler/68863";
    String urlKean = "https://www.transfermarkt.es/moise-kean/profil/spieler/364135";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psg);

        btnNavas = findViewById(R.id.btnNavas);
        btnSergioRico = findViewById(R.id.btnSergioRico);
        btnLetellier = findViewById(R.id.btnLetellier);
        btnFranchi = findViewById(R.id.btnFranchi);
        btnSaidana = findViewById(R.id.btnSaidana);
        btnMarquinhos = findViewById(R.id.btnMarquinhos);
        btnKimpembe = findViewById(R.id.btnKimpembe);
        btnKehrer = findViewById(R.id.btnKehrer);
        btnDiallo = findViewById(R.id.btnDiallo);
        btnPembele = findViewById(R.id.btnPembele);
        btnBernat = findViewById(R.id.btnBernat);
        btnKurzawa = findViewById(R.id.btnKurzawa);
        btnBakker = findViewById(R.id.btnBakker);
        btnFlorenzi = findViewById(R.id.btnFlorenzi);
        btnDagba = findViewById(R.id.btnDagba);
        btnParedes = findViewById(R.id.btnParedes);
        btnPereira = findViewById(R.id.btnPereira);
        btnGueye = findViewById(R.id.btnGueye);
        btnVerratti = findViewById(R.id.btnVerratti);
        btnRafinha = findViewById(R.id.btnRafinha);
        btnHerrera = findViewById(R.id.btnHerrera);
        btnAtil = findViewById(R.id.btnAtil);
        btnSimons = findViewById(R.id.btnSimons);
        btnDraxler = findViewById(R.id.btnDraxler);
        btnMichut = findViewById(R.id.btnMichut);
        btnNeymar = findViewById(R.id.btnNeymar);
        btnSarabia = findViewById(R.id.btnSarabia);
        btnDiMaria = findViewById(R.id.btnDiMaria);
        btnMbappe = findViewById(R.id.btnMbappe);
        btnIcardi = findViewById(R.id.btnIcardi);
        btnKean = findViewById(R.id.btnKean);

        btnNavas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNavas);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSergioRico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSergioRico);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLetellier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLetellier);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFranchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFranchi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSaidana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSaidana);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarquinhos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarquinhos);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKimpembe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKimpembe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKehrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKehrer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiallo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPembele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPembele);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBernat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBernat);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKurzawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKurzawa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBakker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBakker);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFlorenzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFlorenzi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDagba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDagba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnParedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlParedes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnPereira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlPereira);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGueye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGueye);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnVerratti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlVerratti);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRafinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRafinha);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHerrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHerrera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAtil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAtil);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSimons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSimons);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
        btnDraxler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDraxler);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMichut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMichut);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNeymar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNeymar);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSarabia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSarabia);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDiMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDiMaria);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMbappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMbappe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnIcardi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlIcardi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKean);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });



    }
}