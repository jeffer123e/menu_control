package com.demh.menu_navegacion;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void crear(View view) {
        Intent crear = new Intent(this, Crear.class);
        startActivity(crear);
    }

    public void escribir(View view) {
        Intent escribir = new Intent(this, Escribir.class);
        startActivity(escribir);
    }

    public void actualizar(View view) {
        Intent actualizar = new Intent(this, Actualizar.class);
        startActivity(actualizar);
    }

    public void eliminar(View view) {
        Intent eliminar = new Intent(this, Eliminar.class);
        startActivity(eliminar);
    }


    @Override public  boolean onCreateOptionsMenu (Menu menudo) {
        getMenuInflater().inflate(R.menu.controlador_menu,menudo);
        return true;
    }

    @Override public  boolean onOptionsItemSelected (MenuItem opcion){
        int id=opcion.getItemId();
        if (id==R.id.men_Crear)
        {
            crear(null);
            return  true;
        }

        if (id==R.id.men_Escribir)
        {
            escribir(null);
            return  true;
        }

        if (id==R.id.men_Actualizar)
        {
            actualizar(null);
            return  true;
        }

        if (id==R.id.men_Eliminar)
        {
            eliminar(null);
            return  true;
        }
        return  super.onOptionsItemSelected(opcion);

    }


}