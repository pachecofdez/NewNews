package com.opacheco.proyectomuyfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ElegirLigaActivity extends AppCompatActivity {

    ImageButton btnLigaSantander, btnPremierLeague, btnLigaArgentina;
    WebView webview_elegirLiga;

    String urlFichajes = "https://es.besoccer.com/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_liga);

        btnLigaSantander = findViewById(R.id.btnLigaSantander);
        btnPremierLeague = findViewById(R.id.btnPremierLeague);
        btnLigaArgentina = findViewById(R.id.btnLigaArgentina);

        webview_elegirLiga = findViewById(R.id.webview_elegirLiga);

        final WebSettings ajustesVisorWeb = webview_elegirLiga.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        webview_elegirLiga.loadUrl(urlFichajes);

    }


    public void equiposLigaSantander (View view){
        Intent it = new Intent(this, LigaSantander.class);
        startActivity(it);
    }

    public void equiposBundesliga (View view){
        Intent it = new Intent(this, Bundesliga.class);
        startActivity(it);
    }


    public void equiposPremierLeague (View view){
        Intent it = new Intent(this, Premier.class);
        startActivity(it);
    }

    public void equiposSerieA (View view){
        Intent it = new Intent(this, SerieA.class);
        startActivity(it);
    }

    public void equiposEredivise (View view){
        Intent it = new Intent(this, Eredivise.class);
        startActivity(it);
    }

    public void equiposLigaArgentina (View view){
        Intent it = new Intent(this, LigaArgentina.class);
        startActivity(it);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        item.getItemId();
        if (R.id.idSistemaJuego == item.getItemId()){
            //Toast.makeText(this, "Has elegido sistemas de juego", Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this, SistemaDeJuego.class);
            startActivity(it);
        }


        if (R.id.idContacto == item.getItemId()){
            //Toast.makeText(this, "Has elegido contacto", Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this, Contacto.class);
            startActivity(it);
        }

        return true;
    }




}