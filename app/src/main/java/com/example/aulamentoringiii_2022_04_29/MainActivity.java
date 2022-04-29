package com.example.aulamentoringiii_2022_04_29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("aplicacao", "executou onCreate()");

    }
    public void trataBotao(View b){
        texto = (TextView) findViewById(R.id.texto);
        texto.setText("Ola todo mundo");
    }
}