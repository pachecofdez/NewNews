package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    Button btnRegistrar;
    EditText etUsuario;
    EditText etNombre;
    EditText etEmail;
    EditText etContrasenia;
    EditText etContraseniaRepetida;
    CheckBox cbOpcion1;
    CheckBox cbOpcion2;
    SharedPreferences spRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        etUsuario = findViewById(R.id.etUsuario);
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etContrasenia = findViewById(R.id.etContrasenia);
        etContraseniaRepetida = findViewById(R.id.etContraseniaRepetida);
        cbOpcion1 = findViewById(R.id.cbOpcion1);
        cbOpcion2 = findViewById(R.id.cbOpcion2);

        spRegistro = getSharedPreferences("datosRegistro", Context.MODE_PRIVATE);


    }


    public void lanzarInicioSesion (View view){

        String nombreUsuario = etUsuario.getText().toString();
        String nombrePersona = etNombre.getText().toString();
        String emailPersona = etEmail.getText().toString();
        String contraseniaPersona = etContrasenia.getText().toString();
        String contraseniaRepetidaPersona = etContraseniaRepetida.getText().toString();


        if (nombreUsuario.isEmpty() || nombrePersona.isEmpty() || emailPersona.isEmpty() || contraseniaPersona.isEmpty() || contraseniaRepetidaPersona.isEmpty()){
            Toast.makeText(this, "Debes rellenar todos los campos", Toast.LENGTH_SHORT).show();
        } else if (!contraseniaPersona.equals(contraseniaRepetidaPersona)){
            Toast.makeText(this, "Las contraseñas tienen que ser completamente iguales", Toast.LENGTH_SHORT).show();
        } else if (contraseniaPersona.length() < 5){
            Toast.makeText(this, "La contraseña debe tener como mínimo 5 caracteres", Toast.LENGTH_SHORT).show();

        } else if (contraseniaPersona.toLowerCase().equals(contraseniaPersona)){
            Toast.makeText(this, "La contraseña debe tener al menos 1 mayúscula", Toast.LENGTH_SHORT).show();
        } else {

            SharedPreferences.Editor editor = spRegistro.edit();
            editor.putString(nombreUsuario, contraseniaPersona);
            editor.commit();


            Intent it = new Intent(this, InicioSesionActivity.class);
            it.putExtra("nombredelusuario", nombreUsuario);
            it.putExtra("contraseniadelusuario", contraseniaPersona);
            startActivity(it);
        }


    }






}