package com.example.luci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class AgendarCita extends AppCompatActivity {

    private EditText etDescripcion;
    private Spinner spinnerEspecialista;
    private RadioButton rbConsulta, rbExamen,rbOperacion;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_cita);

        etDescripcion = (EditText) findViewById(R.id.etDescripcion);

        spinnerEspecialista = (Spinner) findViewById(R.id.spinnerEspecialista);

        rbConsulta = (RadioButton) findViewById(R.id.rbConsulta);
        rbExamen = (RadioButton) findViewById(R.id.rbExamen);
        rbOperacion = (RadioButton) findViewById(R.id.rbOperacion);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        //Redirección: Cosrresponde a la ruta de Agendar Cita, de paso 1 a 2------------------------
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AgendarCita.this, agendar_cita_2.class);
                startActivity(i);
            }
        });
    }
}