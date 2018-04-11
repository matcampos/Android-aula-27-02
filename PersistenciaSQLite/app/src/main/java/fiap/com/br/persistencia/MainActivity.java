package fiap.com.br.persistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lstContatos;
    MeuBanco db;
    List<Contato> contatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db= new MeuBanco(this);



    }

    @Override
    protected void onStart() {
        super.onStart();
        contatos = db.todosContatos();
        ArrayAdapter<Contato> adapter = new ArrayAdapter<Contato>(
                this,
                android.R.layout.simple_list_item_1,
                contatos
        );
        lstContatos = findViewById(R.id.lstContatos);
        lstContatos.setAdapter(adapter);
    }

    public void inserirContato(View view) {
        Intent it = new Intent(this, CadastroActivity.class);
        startActivity(it);
    }
}
