package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AstonVilla extends AppCompatActivity {


    Button btnEmilianoMartinez, btnTomHeaton, btnJedSteer, btnTyroneMings, btnEzriKonsa, btnHause, btnEngels, btnMargett, btnNeilTaylor, btnCash, btnElmohamady, btnDouglasLuiz, btnNakamba, btnMcginn, btnSanson, btnHourihane, btnRamsey, btnGrealish, btnTrezeguet, btnBertrandTraore, btnElGhazi, btnWatkings, btnWesley, btnKeinanDavis ;


    String urlEmilianoMartinez = "https://www.transfermarkt.es/emiliano-martinez/profil/spieler/111873";
    String urlTomHeaton = "https://www.transfermarkt.es/tom-heaton/profil/spieler/34130";
    String urlJedSteer = "https://www.transfermarkt.es/jed-steer/profil/spieler/110867";
    String urlTyroneMings = "https://www.transfermarkt.es/tyrone-mings/profil/spieler/253677";
    String urlEzriKonsa = "https://www.transfermarkt.es/ezri-konsa/profil/spieler/413403";
    String urlHause= "https://www.transfermarkt.es/kortney-hause/profil/spieler/233124" ;
    String urlEngels = "https://www.transfermarkt.es/bjorn-engels/profil/spieler/193469";
    String urlMargett = "https://www.transfermarkt.es/matt-targett/profil/spieler/250478";
    String urlNeilTaylor= "https://www.transfermarkt.es/neil-taylor/profil/spieler/67416" ;
    String urlCash = "https://www.transfermarkt.es/matty-cash/profil/spieler/425334";
    String urlElmohamady = "https://www.transfermarkt.es/ahmed-elmohamady/profil/spieler/66333";
    String urlDouglasLuiz = "https://www.transfermarkt.es/douglas-luiz/profil/spieler/447661";
    String urlNakamba = "https://www.transfermarkt.es/marvelous-nakamba/profil/spieler/324882";
    String urlMcginn = "https://www.transfermarkt.es/john-mcginn/profil/spieler/193116";
    String urlSanson = "https://www.transfermarkt.es/morgan-sanson/profil/spieler/174094";
    String urlHourihane = "https://www.transfermarkt.es/conor-hourihane/profil/spieler/61653";
    String urlRamsey = "https://www.transfermarkt.es/jacob-ramsey/profil/spieler/503749";
    String urlGrealish = "https://www.transfermarkt.es/jack-grealish/profil/spieler/203460";
    String urlTrezeguet = "https://www.transfermarkt.es/trezeguet/profil/spieler/234189";
    String urlBertrandTraore = "https://www.transfermarkt.es/bertrand-traore/profil/spieler/131996";
    String urlElGhazi = "https://www.transfermarkt.es/anwar-el-ghazi/profil/spieler/183720";
    String urlWatkings = "https://www.transfermarkt.es/ollie-watkins/profil/spieler/324358";
    String urlWesley = "https://www.transfermarkt.es/wesley/profil/spieler/381362";
    String urlKeinanDavis= "https://www.transfermarkt.es/keinan-davis/profil/spieler/412660" ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aston_villa);

        btnEmilianoMartinez = findViewById(R.id.btnEmilianoMartinez);
        btnTomHeaton = findViewById(R.id.btnTomHeaton);
        btnJedSteer = findViewById(R.id.btnJedSteer);
        btnTyroneMings = findViewById(R.id.btnTyroneMings);
        btnEzriKonsa = findViewById(R.id.btnEzriKonsa);
        btnHause = findViewById(R.id.btnHause);
        btnEngels = findViewById(R.id.btnEngels);
        btnMargett = findViewById(R.id.btnMargett);
        btnNeilTaylor = findViewById(R.id.btnNeilTaylor);
        btnCash = findViewById(R.id.btnCash);
        btnElmohamady = findViewById(R.id.btnElmohamady);
        btnDouglasLuiz = findViewById(R.id.btnDouglasLuiz);
        btnNakamba = findViewById(R.id.btnNakamba);
        btnMcginn = findViewById(R.id.btnMcginn);
        btnSanson = findViewById(R.id.btnSanson);
        btnHourihane = findViewById(R.id.btnHourihane);
        btnRamsey = findViewById(R.id.btnRamsey);
        btnGrealish = findViewById(R.id.btnGrealish);
        btnTrezeguet = findViewById(R.id.btnTrezeguet);
        btnBertrandTraore = findViewById(R.id.btnBertrandTraore);
        btnElGhazi = findViewById(R.id.btnElGhazi);
        btnWatkings = findViewById(R.id.btnWatkings);
        btnWesley = findViewById(R.id.btnWesley);
        btnKeinanDavis = findViewById(R.id.btnKeinanDavis);

        btnEmilianoMartinez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEmilianoMartinez);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTomHeaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTomHeaton);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJedSteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJedSteer);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTyroneMings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTyroneMings);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEzriKonsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEzriKonsa);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHause);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEngels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEngels);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMargett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMargett);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNeilTaylor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNeilTaylor);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlCash);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnElmohamady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlElmohamady);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnDouglasLuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlDouglasLuiz);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNakamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNakamba);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMcginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcginn);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSanson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSanson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnHourihane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlHourihane);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRamsey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRamsey);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnGrealish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlGrealish);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnTrezeguet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlTrezeguet);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBertrandTraore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBertrandTraore);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnElGhazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlElGhazi);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWatkings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWatkings);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWesley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWesley);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKeinanDavis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKeinanDavis);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}