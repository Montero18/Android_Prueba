package com.example.examenut2_davidmonterobellon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BaseDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);

        //Toast para el boton de insertar
        Button botonInsertar = findViewById(R.id.botonInsertar);
        botonInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Insercion Realizada", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        EditText nombreGrupo = findViewById(R.id.nombreGrupo);
        EditText nacionalidad = findViewById(R.id.nacionalidad);
        EditText generoMusical = findViewById(R.id.nacionalidad);
        EditText yearCreacion = findViewById(R.id.yearCreacion);
        TextView listado = findViewById(R.id.listado);



        /*Helper helper = new Helper(this, "bdGruposMusicales.db", null, 1);
        SQLiteDatabase db = helper.getWritableDatabase();

        //Consultamos los datos de la tabla
        Cursor cursor = db.query("grupos", null, null, null, null, null, null);

        //Variables
        String nombreGrupoVariable, nacionalidadVariable, generoMusicalVariable, yearCreacionVariable;

        nombreGrupoVariable = nombreGrupo.getText().toString();
        nacionalidadVariable = nacionalidad.getText().toString();
        generoMusicalVariable = generoMusical.getText().toString();
        yearCreacionVariable = yearCreacion.getText().toString();

        insertar(nombreGrupoVariable, nacionalidadVariable, generoMusicalVariable, yearCreacionVariable);

        db.close();*/
    };


    //Metodo para insertar
    private void insertar(String nombreGrupo, String nacionalidad, String generoMusical, String yearCreacion) {

        Helper helper = new Helper(this, "bdGruposMusicales.db", null, 1);
        SQLiteDatabase db = helper.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("nombre", nombreGrupo);
        values.put("nacionalidad", nacionalidad);
        values.put("genero_musical", generoMusical);
        values.put("year_creacion", yearCreacion);

        db.insert("grupos", null, values);
    }


}