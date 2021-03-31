package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ElegirEquipoActivity extends AppCompatActivity {

    ListView listaEquipos;
    ArrayList<String> nombresEquipos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_equipo);

        listaEquipos = findViewById(R.id.listaEquipos);

        for (int i = 0; i < Equipos.equipos.length; i++) {
            nombresEquipos.add(Equipos.equipos[i].getNombreEquipo());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombresEquipos);
        listaEquipos.setAdapter(arrayAdapter);




    }


}