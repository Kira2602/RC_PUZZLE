package com.example.rompe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvnombre;
    Button btnumeros, btimagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnombre = findViewById(R.id.tvNombre);
        btnumeros = findViewById(R.id.btnumeros);
        btimagen = findViewById(R.id.btimagen);
        btnumeros = findViewById(R.id.btnumeros);


            Intent data = getIntent();
            tvnombre.setText(data.getStringExtra("nombre"));

        btimagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                llamaActyJuego();
            }
        });

        btnumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                llamaActyNumeros();
            }
        });
    }
    void llamaActyJuego(){
        Intent invocador = new Intent(this, juegoProceso.class);
        startActivity(invocador);

    }

    void llamaActyNumeros(){
        Intent invocador = new Intent(this, numeros.class);
        startActivity(invocador);
    }
}