package com.example.rompe1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etnombre;
    Button btinvoca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        etnombre= findViewById(R.id.etNombre);
        btinvoca = findViewById(R.id.btInvoca);

        btinvoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                llamaActy2();
            }
        });
    }
    void llamaActy2(){
        Bundle bolsa = new Bundle();
        bolsa.putString("nombre", etnombre.getText().toString());
        Intent invocador = new Intent(this, MainActivity2.class);
        invocador.putExtras(bolsa);
        startActivity(invocador);

    }
}

