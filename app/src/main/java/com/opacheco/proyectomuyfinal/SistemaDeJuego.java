package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SistemaDeJuego extends AppCompatActivity {

    ImageButton unocuatrotrestres, unocuatrocuatrodos, unotrescincodos, unocuatrodostresuno;

    String urlcuatrotrestres = "https://www.youtube.com/watch?v=70foakJzTUc";
    String urlcuatrocuatrodos = "https://www.youtube.com/watch?v=oo6wnGSLqlE";
    String urlcuatrodostresuno = "https://www.youtube.com/watch?v=KFmZPXjTx5c";
    String urltrescincodos = "https://www.youtube.com/watch?v=En7W00U50VE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_de_juego);

        unocuatrotrestres = findViewById(R.id.unocuatrotrestres);
        unocuatrocuatrodos = findViewById(R.id.unocuatrocuatrodos);
        unotrescincodos = findViewById(R.id.unotrescincodos);
        unocuatrodostresuno = findViewById(R.id.unocuatrodostresuno);

    }

    public void lanzarunocuatrotrestres (View view){
        /*Intent it = new Intent(this, Unocuatrotrestres.class);
        startActivity(it);*/

        Uri _link = Uri.parse(urlcuatrotrestres);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);

    }

    public void lanzarunocuatrocuatrodos (View view){
        /*Intent it = new Intent(this, Unocuatrocuatrodos.class);
        startActivity(it);*/

        Uri _link = Uri.parse(urlcuatrocuatrodos);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);

    }

    public void lanzarunotrescincodos (View view){
        /*Intent it = new Intent(this, Unotrescincodos.class);
        startActivity(it);*/

        Uri _link = Uri.parse(urltrescincodos);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);

    }

    public void lanzarunocuatrodostresuno (View view){
       /* Intent it = new Intent(this, Unocuatrodostresuno.class);
        startActivity(it);*/

        Uri _link = Uri.parse(urlcuatrodostresuno);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);

    }


}