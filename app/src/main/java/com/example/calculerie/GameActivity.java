package com.example.calculerie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class GameActivity extends AppCompatActivity {
    private int nbVie;

    private TextView textNombreVie;
    private TextView textNombreUn;
    private TextView textNombreDeux;
    private TextView textOperateur;
    private EditText inputReponse;
    private Button boutonValide;
    private TypeOperation typeOperation;


    private TextView txtSecondesRestantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        boutonValide = findViewById(R.id.boutonValide);
        textNombreUn = findViewById(R.id.textNombreUn);
        textNombreDeux = findViewById(R.id.textNombreDeux);
        textNombreVie = findViewById(R.id.textNombreVie);
        textOperateur=findViewById(R.id.textOperateur);
        inputReponse = findViewById(R.id.inputReponse);
        txtSecondesRestantes = findViewById(R.id.txtSecondesRestantes);
        nbVie= Integer.parseInt(textNombreVie.getText().toString());


        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int secondsRemaining = (int) (millisUntilFinished / 1000);
                txtSecondesRestantes.setText(String.format("%d sec", secondsRemaining));
            }

            @Override
            public void onFinish() {
                nbVie=nbVie-1;
                textNombreVie.setText(""+nbVie);
            }
        }.start();

        GenerationCalcul();


    }

    private void GenerationCalcul(){

        Random random = new Random();
        int nbrandom = random.nextInt(4-1)+1;

        switch (nbrandom){
            case 1:
                textOperateur.setText("+");
                nbrandom = random.nextInt(100-1)+1;

                textNombreUn.setText(""+nbrandom);

                nbrandom = random.nextInt(100-1)+1;
                textNombreDeux.setText(""+nbrandom);
                break;
            case 2:
                textOperateur.setText("-");
                nbrandom = random.nextInt(100-1)+1;

                textNombreDeux.setText(""+nbrandom);

                nbrandom = random.nextInt(100-nbrandom)+nbrandom;
                textNombreUn.setText(""+nbrandom);
                break;
            case 3:
                textOperateur.setText("x");
                nbrandom = random.nextInt(15-1)+1;

                textNombreUn.setText(""+nbrandom);

                nbrandom = random.nextInt(15-1)+1;
                textNombreDeux.setText(""+nbrandom);
                break;
            case 4:
                textOperateur.setText("/");
                nbrandom = random.nextInt(15-1)+1;

                textNombreUn.setText(""+nbrandom);

                nbrandom = random.nextInt(15-1)+1;
                textNombreDeux.setText(""+nbrandom);
                break;
        }
    }

    private void VerificationCalcul(){

        switch (typeOperation) {
            case ADD:
                textOperateur.setText('+');
                break;
            case SUBSTRACT:
                textOperateur.setText('-');
                break;
            case MULTIPLY:
                textOperateur.setText('x');
                break;
            case DIVIDE:
                textOperateur.setText('/');
                break;
        }
    }
}