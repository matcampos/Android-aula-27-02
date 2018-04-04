package br.com.fiap.telalogin;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    EditText edtSenha;
    CheckBox chBox;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtSenha = findViewById(R.id.edtSenha);
        chBox = findViewById(R.id.chBox);
        sp = getPreferences(MODE_PRIVATE);
        String nome = sp.getString("nome", "");
        String senha = sp.getString("senha", "");
        boolean bool = sp.getBoolean("ch", false);
        edtNome.setText( nome );
        edtSenha.setText( senha );
        chBox.setChecked( bool );
    }

    public void salvar(View view) {
        String nome = edtNome.getText().toString();
        String senha = edtSenha.getText().toString();
        if(chBox.isChecked()){
            SharedPreferences.Editor edit = sp.edit();
            edit.putString("nome",nome);
            edit.putString("senha",senha);
            edit.putBoolean("ch",true);
            edit.commit();
            Toast.makeText(this, "Dados gravados no shared preferences com sucesso!!", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Dados gravados!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Recuperar(View view) {
        String nome = sp.getString("nome", "");

        String senha = sp.getString("senha", "");

        Toast.makeText(this, "nome: "+nome +" "+"Senha: "+senha, Toast.LENGTH_SHORT).show();
    }
}
