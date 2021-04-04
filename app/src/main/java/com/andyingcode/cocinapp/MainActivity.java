package com.andyingcode.cocinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ingrediente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingrediente = findViewById(R.id.ingrediente1);

        Button btnBusca = (Button) findViewById(R.id.buscarReceta);

        btnBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRecipeOptions();
                //Toast.makeText(getApplicationContext(), "Ingrediente: "  + ingrediente.getText().toString(), Toast.LENGTH_LONG).show();



            }

        });

    }

    public void goRecipeOptions() {
        //       Toast.makeText(getApplicationContext(), userId, Toast.LENGTH_LONG).show();
        Intent select = new Intent(this, OpcionesRecetas.class);
       // select.putExtra("userId", userId);
        startActivity(select);

    }
}