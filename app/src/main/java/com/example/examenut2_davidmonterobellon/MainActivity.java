package com.example.examenut2_davidmonterobellon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuoption, menu);

        return true;
    }


    public void cambiarActividadSumarRestar (View view) {
        Intent intent = new Intent(getApplicationContext(), SumarRestar.class);
        startActivity(intent);
    }

    public void cambiarActividadBaseDatos (View view) {
        Intent intent = new Intent(getApplicationContext(), BaseDatos.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}