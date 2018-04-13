package fiap.com.br.listagem_dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lstContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            lstContatos = findViewById(R.id.lstContatos);

            contatos = geraContatos.geraContatos();

            ContatoAdapter adapter = new ContatoAdapter(this,contatos);

            lstContatos.setAdapter(adapter);
            lstContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Contato contato = contatos.get(position);
                    Toast.makeText(MainActivity.this, contato.getSobre(), Toast.LENGTH_SHORT).show();
                }
            });
    }
}
