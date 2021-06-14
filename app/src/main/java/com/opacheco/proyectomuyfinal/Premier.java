package com.opacheco.proyectomuyfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Premier extends AppCompatActivity {


    Button btnManchesterCity, btnManchesterUnited, btnLiverpool, btnChelsea, btnLeicester, btnWestHam, btnTottenham, btnArsenal, btnLeeds, btnEverton, btnAstonVilla, btnNewcastle, btnWolves, btnCrystalPalace, btnSouthampton, btnBrighton, btnBurnley, btnFulham, btnAlbion, btnSheffield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier);

        btnManchesterCity = findViewById(R.id.btnManchesterCity);
        btnManchesterUnited = findViewById(R.id.btnManchesterUnited);
        btnLiverpool = findViewById(R.id.btnLiverpool);
        btnChelsea = findViewById(R.id.btnChelsea);
        btnLeicester = findViewById(R.id.btnLeicester);
        btnWestHam = findViewById(R.id.btnWestHam);
        btnTottenham = findViewById(R.id.btnTottenham);
        btnArsenal = findViewById(R.id.btnArsenal);
        btnLeeds = findViewById(R.id.btnLeeds);
        btnEverton = findViewById(R.id.btnEverton);
        btnAstonVilla = findViewById(R.id.btnAstonVilla);
        btnNewcastle = findViewById(R.id.btnNewcastle);
        btnWolves = findViewById(R.id.btnWolves);
        btnCrystalPalace = findViewById(R.id.btnCrystalPalace);
        btnSouthampton = findViewById(R.id.btnSouthampton);
        btnBrighton = findViewById(R.id.btnBrighton);
        btnBurnley = findViewById(R.id.btnBurnley);
        btnFulham = findViewById(R.id.btnFulham);
        btnAlbion = findViewById(R.id.btnAlbion);
        btnSheffield = findViewById(R.id.btnSheffield);


    }

        public void ManchesterCity (View view){
            Intent it = new Intent(this, ManchesterCity.class);
            startActivity(it);
        }

        public void ManchesterUnited (View view){
            Intent it = new Intent(this, ManchesterUnited.class);
            startActivity(it);
        }

        public void Liverpool (View view){
            Intent it = new Intent(this, Liverpool.class);
            startActivity(it);
        }

        public void Chelsea (View view){
            Intent it = new Intent(this, Chelsea.class);
            startActivity(it);
        }

        public void Leicester (View view){
            Intent it = new Intent(this, Leicester.class);
            startActivity(it);
        }

        public void WestHam (View view){
            Intent it = new Intent(this, WestHam.class);
            startActivity(it);
        }

        public void Tottenham (View view){
            Intent it = new Intent(this, Tottenham.class);
            startActivity(it);
        }

        public void Arsenal (View view){
            Intent it = new Intent(this, Arsenal.class);
            startActivity(it);
        }

        public void Leeds (View view){
            Intent it = new Intent(this, Leeds.class);
            startActivity(it);
        }

        public void Everton (View view){
            Intent it = new Intent(this, Everton.class);
            startActivity(it);
        }

        public void AstonVilla (View view){
            Intent it = new Intent(this, AstonVilla.class);
            startActivity(it);
        }

        public void Newcastle (View view){
            Intent it = new Intent(this, Newcastle.class);
            startActivity(it);
        }

        public void Wolves (View view){
            Intent it = new Intent(this, Wolves.class);
            startActivity(it);
        }

        public void CrystalPalace (View view){
            Intent it = new Intent(this, CrystalPalace.class);
            startActivity(it);
        }

        public void Southampton (View view){
            Intent it = new Intent(this, Southampton.class);
            startActivity(it);
        }

        public void Brighton (View view){
            Intent it = new Intent(this, Brighton.class);
            startActivity(it);
        }

        public void Burnley (View view){
            Intent it = new Intent(this, Burnley.class);
            startActivity(it);
        }

        public void Fulham (View view){
            Intent it = new Intent(this, Fulham.class);
            startActivity(it);
        }

        public void Albion (View view){
            Intent it = new Intent(this, Albion.class);
            startActivity(it);
        }

        public void Sheffield (View view){
            Intent it = new Intent(this, Sheffield.class);
            startActivity(it);
        }




}