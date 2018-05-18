package br.com.fiap.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos = Gerador.listar();

        ContatoAdapter adapter = new ContatoAdapter(this,contatos);

        rcvContatos = findViewById(R.id.rcvContatos);
        rcvContatos.setHasFixedSize(true);

        rcvContatos.setAdapter(adapter);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this);
        rcvContatos.setLayoutManager(layout);

    }
}
