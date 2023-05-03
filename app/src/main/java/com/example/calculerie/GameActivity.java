package com.example.calculerie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
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

    private int nbVie;

    private TextView txtSecondesRestantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        boutonValide = findViewById(R.id.boutonValide);
        textNombreUn = findViewById(R.id.textNombreUn);
        textNombreDeux = findViewById(R.id.textNombreDeux);
        textNombreVie = findViewById(R.id.textNombreVie);
        inputReponse = findViewById(R.id.inputReponse);

        textNombreVie.setText("x" + nbVie);
        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int secondsRemaining = (int) (millisUntilFinished / 1000);
                txtSecondesRestantes.setText(String.format("%d sec", secondsRemaining));
            }

            @Override
            public void onFinish() {
                nbVie=nbVie-1;
                textNombreVie.setText("x" + nbVie);
            }
        }.start();
    }
}