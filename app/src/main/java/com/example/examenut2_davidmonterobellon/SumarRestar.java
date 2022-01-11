package com.example.examenut2_davidmonterobellon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumarRestar extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_restar);

        Button boton0 = findViewById(R.id.boton0);
        Button botonSumar1 = findViewById(R.id.botonSumar1);
        Button botonSumar2 = findViewById(R.id.botonSumar2);
        Button botonRestar1 = findViewById(R.id.botonRestar1);
        Button botonRestar2 = findViewById(R.id.botonRestar2);

        TextView solucion = findViewById(R.id.resultado);

       boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solucion.setText("0");
            }
        });

        botonSumar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Integer.parseInt(solucion.getText().toString()) + 1;
                solucion.setText(String.valueOf(resultado));
            }
        });

        botonSumar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Integer.parseInt(solucion.getText().toString()) + 2;
                solucion.setText(String.valueOf(resultado));
            }
        });

        botonRestar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Integer.parseInt(solucion.getText().toString()) - 1;
                solucion.setText(String.valueOf(resultado));
            }
        });

        botonRestar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado = Integer.parseInt(solucion.getText().toString()) -2;
                solucion.setText(String.valueOf(resultado));
            }
        });


    }


}