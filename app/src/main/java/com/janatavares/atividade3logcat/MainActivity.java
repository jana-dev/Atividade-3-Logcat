package com.janatavares.atividade3logcat;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.v("MainActivity", "Verbose log: Detalhes extras para depuracao profunda");
        Log.d("MainActivity", "Debug log: Informacoes uteis durante o desenvolvimento");
        Log.i("MainActivity", "Info log: mensagens informativas sobre o fluxo do aplicativo");
        Log.w("MainActivity", "Warning log: possivevis problemas que nao causam falhas imediatas");
        Log.e("MainActivity", "Error log: Erros que afetam a funcionalidade do aplicativo");

        //Simulando um erro
        try{
            String[] lista = {"item1", "item2", "item3"};
            String elemento = lista[4];
        } catch (Exception e){
            Log.e("MainActivity", "Erro ao acessar o índice:", e);
        }
    }
}