package com.example.luci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ActualizarDatosPerfil extends AppCompatActivity {
    private EditText etEmail2, etTelefono2, etDireccion2;
    private Button btnAEmail, btnATelefono, btnADireccion;
    private ImageButton ibtnFotoPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_datos_perfil);

        etEmail2 = (EditText) findViewById(R.id.etEmail2);
        etTelefono2 = (EditText) findViewById(R.id.etTelefono2);
        etDireccion2 = (EditText) findViewById(R.id.etDireccion2);

        btnAEmail = (Button) findViewById(R.id.btnAEmail);
        btnATelefono = (Button) findViewById(R.id.btnATelefono);
        btnADireccion = (Button) findViewById(R.id.btnADireccion);

        ibtnFotoPerfil = (ImageButton) findViewById(R.id.ibtnFotoPerfil);


    }
}

    /* Funcionalidades del Activity:
    * Los Botones actualizan los datos del paciente (solo esos datos)
    * Los datos solo podrán cambiarse cada vez que el paciente lo requiera en cualquier momento, las veces que quiera
    * Validar campos vacíos, gmail, cantidad de numeros de telefono (9 números).
    * Avisar que la actualización de datos es correcta
    * **/