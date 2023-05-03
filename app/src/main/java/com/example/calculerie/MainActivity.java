package com.example.calculerie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button boutonJeu;
    private Button boutonMeilleurScore;
    private Button boutonAPropos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boutonJeu = findViewById(R.id.boutonJeu);
        boutonMeilleurScore =findViewById(R.id.boutonMeilleurScore);
        boutonAPropos = findViewById(R.id.boutonAPropos);


        boutonJeu.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
        });

        boutonMeilleurScore.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,HighScoreActivity.class);
            startActivity(intent);
        });

        boutonAPropos.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,AboutActivity.class );
        });


    }
}
