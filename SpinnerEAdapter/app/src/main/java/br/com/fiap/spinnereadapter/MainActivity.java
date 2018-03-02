package br.com.fiap.spinnereadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        Spinner spnEstados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] estados = {"AC","AM","BA","CE"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, estados);

        spnEstados = findViewById(R.id.spnEstados);
        spnEstados.setAdapter(adapter);
    }

    public void salvar(View view) {
        int posicao = spnEstados.getSelectedItemPosition();
        String texto = spnEstados.getSelectedItem().toString();
        String msg = "Você selecionou a posição " + posicao + " e com o texto " + texto;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
