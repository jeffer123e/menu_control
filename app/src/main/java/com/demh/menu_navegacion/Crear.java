package com.demh.menu_navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Crear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);
    }

    public void Regresar(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}