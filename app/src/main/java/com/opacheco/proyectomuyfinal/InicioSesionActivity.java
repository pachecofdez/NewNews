package com.opacheco.proyectomuyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InicioSesionActivity extends AppCompatActivity {

    Button btn_iniciarSesion1;
    Button btn_crearCuenta1;
    EditText etNameUsuario;
    EditText etContraseniaUsuario;
    String nombreUsuario1;
    String usuarioAlmacenado;
    String contraseniaAlmacenada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        btn_iniciarSesion1 = findViewById(R.id.btn_iniciarSesion1);
        btn_crearCuenta1 = findViewById(R.id.btn_crearCuenta1);
        etNameUsuario = findViewById(R.id.etNameUsuario);
        etContraseniaUsuario = findViewById(R.id.etContraseniaUsuario);

        Bundle bundle = getIntent().getExtras();
        usuarioAlmacenado = bundle.getString("nombredelusuario");
        contraseniaAlmacenada = bundle.getString("contraseniadelusuario");


    }



    public void iniciarLaSesion (View view){
        String textoEnetNombreUsuario = etNameUsuario.getText().toString();
        String textoEnetContraseniaUsuario = etContraseniaUsuario.getText().toString();

        if (usuarioAlmacenado.equals(textoEnetNombreUsuario) && contraseniaAlmacenada.equals(textoEnetContraseniaUsuario)){
            Intent it = new Intent(this, ElegirEquipoActivity.class);
            startActivity(it);
        } else {
            Toast.makeText(this, "El inicio de sesion no es correcto", Toast.LENGTH_SHORT).show();
        }


    }


    public void CrearCuenta (View view){
        Intent it = new Intent(this, RegistroActivity.class);
        startActivity(it);
    }





}