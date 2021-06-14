package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sheffield extends AppCompatActivity {

    Button btnRamsdale, btnWes, btnSimonMoore, btnEastwood, btnJohnEgan, btnConnell, btnBasham, btnKeanBryan, btnJagielka, btnEndaStevens, btnLowe, btnRobinson, btnRhys, btnBogle, btnBaldock, btnBerge, btnRodwell, btnLundstram, btnNorwood, btnFleck, btnOsborn, btnFreeman, btnMcburnie, btnBrewster, btnMousset, btnBurke, btnMcgoldrick, btnBillySharp, btnJesbbison;


    String urlRamsdale = "https://www.transfermarkt.es/aaron-ramsdale/profil/spieler/427568";
    String urlWes = "https://www.transfermarkt.es/wes-foderingham/profil/spieler/61697";
    String urlSimonMoore = "https://www.transfermarkt.es/simon-moore/profil/spieler/123536";
    String urlEastwood = "https://www.transfermarkt.es/jake-eastwood/profil/spieler/526873";
    String urlJohnEgan = "https://www.transfermarkt.es/john-egan/profil/spieler/121324";
    String urlConnell= "https://www.transfermarkt.es/jack-oconnell/profil/spieler/212829" ;
    String urlBasham = "https://www.transfermarkt.es/chris-basham/profil/spieler/52495";
    String urlKeanBryan = "https://www.transfermarkt.es/kean-bryan/profil/spieler/214928";
    String urlJagielka = "https://www.transfermarkt.es/phil-jagielka/profil/spieler/13520";
    String urlEndaStevens= "https://www.transfermarkt.es/enda-stevens/profil/spieler/85706" ;
    String urlLowe= "https://www.transfermarkt.es/max-lowe/profil/spieler/258885" ;
    String urlRobinson = "https://www.transfermarkt.es/jack-robinson/profil/spieler/128909";
    String urlRhys = "https://www.transfermarkt.es/rhys-norrington-davies/profil/spieler/543164";
    String urlBogle = "https://www.transfermarkt.es/jayden-bogle/profil/spieler/465717";
    String urlBaldock = "https://www.transfermarkt.es/george-baldock/profil/spieler/146690";
    String urlBerge = "https://www.transfermarkt.es/sander-berge/profil/spieler/333014";
    String urlRodwell = "https://www.transfermarkt.es/jack-rodwell/profil/spieler/57079";
    String urlLundstram = "https://www.transfermarkt.es/john-lundstram/profil/spieler/156941";
    String urlNorwood= "https://www.transfermarkt.es/oliver-norwood/profil/spieler/73547" ;
    String urlFleck = "https://www.transfermarkt.es/john-fleck/profil/spieler/54383";
    String urlOsborn = "https://www.transfermarkt.es/ben-osborn/profil/spieler/218087";
    String urlFreeman = "https://www.transfermarkt.es/luke-freeman/profil/spieler/66923";
    String urlMcBurnie = "https://www.transfermarkt.es/oliver-mcburnie/profil/spieler/298477";
    String urlBrewster= "https://www.transfermarkt.es/rhian-brewster/profil/spieler/406560" ;
    String urlMousset = "https://www.transfermarkt.es/lys-mousset/profil/spieler/291422";
    String urlBurke = "https://www.transfermarkt.es/oliver-burke/profil/spieler/341317";
    String urlMcgoldrick= "https://www.transfermarkt.es/david-mcgoldrick/profil/spieler/35416" ;
    String urlBillySharp = "https://www.transfermarkt.es/billy-sharp/profil/spieler/49542";
    String urlJesbbison= "https://www.transfermarkt.es/daniel-jebbison/profil/spieler/746740" ;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheffield);

        btnRamsdale = findViewById(R.id.btnRamsdale);
        btnWes = findViewById(R.id.btnWes);
        btnSimonMoore = findViewById(R.id.btnSimonMoore);
        btnEastwood = findViewById(R.id.btnEastwood);
        btnJohnEgan = findViewById(R.id.btnJohnEgan);
        btnConnell = findViewById(R.id.btnConnell);
        btnBasham = findViewById(R.id.btnBasham);
        btnKeanBryan = findViewById(R.id.btnKeanBryan);
        btnJagielka = findViewById(R.id.btnJagielka);
        btnEndaStevens = findViewById(R.id.btnEndaStevens);
        btnLowe = findViewById(R.id.btnLowe);
        btnRobinson = findViewById(R.id.btnRobinson);
        btnRhys = findViewById(R.id.btnRhys);
        btnBogle = findViewById(R.id.btnBogle);
        btnBaldock = findViewById(R.id.btnBaldock);
        btnBerge = findViewById(R.id.btnBerge);
        btnRodwell = findViewById(R.id.btnRodwell);
        btnLundstram = findViewById(R.id.btnLundstram);
        btnNorwood = findViewById(R.id.btnNorwood);
        btnFleck = findViewById(R.id.btnFleck);
        btnOsborn = findViewById(R.id.btnOsborn);
        btnFreeman = findViewById(R.id.btnFreeman);
        btnMcburnie = findViewById(R.id.btnMcburnie);
        btnBrewster = findViewById(R.id.btnBrewster);
        btnMousset = findViewById(R.id.btnMousset);
        btnBurke = findViewById(R.id.btnBurke);
        btnMcgoldrick = findViewById(R.id.btnMcgoldrick);
        btnBillySharp = findViewById(R.id.btnBillySharp);
        btnJesbbison = findViewById(R.id.btnJesbbison);


        btnRamsdale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRamsdale);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnWes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlWes);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnSimonMoore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlSimonMoore);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEastwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEastwood);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJohnEgan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJohnEgan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnConnell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlConnell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBasham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBasham);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnKeanBryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlKeanBryan);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJagielka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJagielka);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnEndaStevens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlEndaStevens);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLowe);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRobinson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRobinson);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRhys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRhys);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBogle);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBaldock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBaldock);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBerge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBerge);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnRodwell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlRodwell);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnLundstram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlLundstram);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnNorwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlNorwood);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFleck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFleck);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnOsborn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlOsborn);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnFreeman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlFreeman);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMcburnie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcBurnie);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBrewster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBrewster);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMousset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMousset);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBurke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBurke);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnMcgoldrick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlMcgoldrick);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnBillySharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlBillySharp);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });

        btnJesbbison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _link = Uri.parse(urlJesbbison);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });




    }
}