package fiap.com.br.persistencia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
MeuBanco db;
EditText edtNome;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        db = new MeuBanco(this);

        edtNome = findViewById(R.id.edtNome);

    }

    public void salvar(View view) {
    String nome = edtNome.getText().toString();

    Contato contato = new Contato();

    contato.setNome(nome);

    db.insertContato(contato);

    finish();
    }
}
