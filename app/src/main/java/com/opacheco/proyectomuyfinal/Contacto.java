package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Contacto extends AppCompatActivity {

    ImageButton logoInstagram, logoTwitter;
    String urlInstagram = "https://www.instagram.com/pacheco_fdz/?hl=es";
    String urlTwitter = "https://twitter.com/oscarpachecofdz?lang=es";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        VideoView presentacion = findViewById(R.id.presentacion);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.presentacionfinal;
        Uri uri = Uri.parse(videoPath);
        presentacion.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        presentacion.setMediaController(mediaController);
        mediaController.setAnchorView(presentacion);

    }

    public void abrirInstagram (View view){
        Uri _link = Uri.parse(urlInstagram);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);
    }


    public void abrirTwitter (View view){
        Uri _link = Uri.parse(urlTwitter);
        Intent i = new Intent(Intent.ACTION_VIEW, _link);
        startActivity(i);
    }

}
