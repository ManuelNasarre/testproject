package com.example.alumno.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class PruebaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_actividad);
    }

    public static void main(String arg[]){
        System.out.println("Hola Mundo");

    }
}
