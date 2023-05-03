package com.example.calculerie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView textNombreVie;
    private TextView textNombreUn;
    private TextView textNombreDeux;
    private TextView textOperateur;
    private EditText inputReponse;
    private Button boutonValide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        boutonValide = findViewById(R.id.boutonValide);
        textNombreUn = findViewById(R.id.textNombreUn);
        textNombreDeux = findViewById(R.id.textNombreDeux);
        textNombreVie = findViewById(R.id.textNombreVie);
        inputReponse = findViewById(R.id.inputReponse);


    }
}