package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Getafe extends AppCompatActivity {

    Button btnDavidSoria, btnRubenYanez, btnDjene, btnErickCabaco, btnXabiEtxeita, btnChema, btnSoufianeChakla, btnMathiasOlivera, btnAllanNyom, btnDamianSuarez, btnDavidTimor, btnMauroArambarri, btnNemanjaMaksimovic, btnCarlesAlena, btnMarcCucurella, btnTakefusaKubo, btnFranciscoPortillo, btnCucho, btnEnesUnal, btnJaimeMata, btnAngelRodriguez, btnDarioPoveda;

    String urlDavidSoria = "https://www.transfermarkt.es/david-soria/profil/spieler/226012";
    String urlRubenYanez = "https://www.transfermarkt.es/ruben-yanez/profil/spieler/246335";
    String urlDjene = "https://www.transfermarkt.es/djene/profil/spieler/221150";
    String urlErickCabaco = "https://www.transfermarkt.es/erick-cabaco/profil/spieler/302991";
    String urlXabiEtxeita = "https://www.transfermarkt.es/xabi-etxeita/profil/spieler/71559";
    String urlChema = "https://www.transfermarkt.es/chema/profil/spieler/248330";
    String urlChakla = "https://www.transfermarkt.es/soufiane-chakla/profil/spieler/236956";
    String urlMathiasOlivera = "https://www.transfermarkt.es/mathi-shy-as-olivera/profil/spieler/376514";
    String urlNyom = "https://www.transfermarkt.es/allan-nyom/profil/spieler/111508";
    String urlDamianSuarez = "https://www.transfermarkt.es/damian-suarez/profil/spieler/76746";
    String urlDavidTimor = "https://www.transfermarkt.es/david-timor/profil/spieler/158795";
    String urlMauroArambarri = "https://www.transfermarkt.es/mauro-arambarri/profil/spieler/290249";
    String urlMaksimovic = "https://www.transfermarkt.es/nemanja-maksimovic/profil/spieler/273152";
    String urlCarlesAlena = "https://www.transfermarkt.es/carles-alena/profil/spieler/284854";
    String urlMarcCucurella = "https://www.transfermarkt.es/marc-cucurella/profil/spieler/284857";
    String urlTakefusaKubo = "https://www.transfermarkt.es/takefusa-kubo/profil/spieler/405398";
    String urlFranciscoPortillo = "https://www.transfermarkt.es/francisco-portillo/profil/spieler/138803";
    String urlCucho = "https://www.transfermarkt.es/cucho/profil/spieler/459463";
    String urlEnesUnal = "https://www.transfermarkt.es/enes-unal/profil/spieler/251106";
    String urlJaimeMata = "https://www.transfermarkt.es/jaime-mata/profil/spieler/227961";
    String urlAngelRodriguez = "https://www.transfermarkt.es/angel-rodriguez/profil/spieler/51510";
    String urlPatrickFinn = "https://www.transfermarkt.es/john-joe-patrick-finn/profil/spieler/841121";
    String urlDarioPoveda = "https://www.transfermarkt.es/dario-poveda/profil/spieler/399780";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getafe);

        btnDavidSoria = findViewById(R.id.btnDavidSoria);
        btnRubenYanez = findViewById(R.id.btnRubenYanez);
        btnDjene = findViewById(R.id.btnDjene);
        btnErickCabaco = findViewById(R.id.btnErickCabaco);
        btnXabiEtxeita = findViewById(R.id.btnXabiEtxeita);
        btnChema = findViewById(R.id.btnChema);
        btnSoufianeChakla = findViewById(R.id.btnSoufianeChakla);
        btnMathiasOlivera = findViewById(R.id.btnMathiasOlivera);
        btnAllanNyom = findViewById(R.id.btnAllanNyom);
        btnDamianSuarez = findViewById(R.id.btnDamianSuarez);
        btnDavidTimor = findViewById(R.id.btnDavidTimor);
        btnMauroArambarri = findViewById(R.id.btnMauroArambarri);
        btnNemanjaMaksimovic = findViewById(R.id.btnNemanjaMaksimovic);
        btnCarlesAlena = findViewById(R.id.btnCarlesAlena);
        btnMarcCucurella = findViewById(R.id.btnMarcCucurella);
        btnTakefusaKubo = findViewById(R.id.btnTakefusaKubo);
        btnFranciscoPortillo = findViewById(R.id.btnFranciscoPortillo);
        btnCucho = findViewById(R.id.btnCucho);
        btnEnesUnal = findViewById(R.id.btnEnesUnal);
        btnJaimeMata = findViewById(R.id.btnJaimeMata);
        btnAngelRodriguez = findViewById(R.id.btnAngelRodriguez);
        btnDarioPoveda = findViewById(R.id.btnDarioPoveda);

        btnDavidSoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidSoria);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRubenYanez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRubenYanez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDjene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDjene);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnErickCabaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlErickCabaco);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnXabiEtxeita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlXabiEtxeita);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnChema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChema);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSoufianeChakla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlChakla);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMathiasOlivera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMathiasOlivera);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAllanNyom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNyom);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDamianSuarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDamianSuarez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDavidTimor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDavidTimor);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMauroArambarri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMauroArambarri);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNemanjaMaksimovic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMaksimovic);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCarlesAlena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCarlesAlena);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMarcCucurella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMarcCucurella);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTakefusaKubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTakefusaKubo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFranciscoPortillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFranciscoPortillo);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCucho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCucho);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEnesUnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEnesUnal);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJaimeMata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJaimeMata);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnAngelRodriguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlAngelRodriguez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDarioPoveda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDarioPoveda);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

    }
}