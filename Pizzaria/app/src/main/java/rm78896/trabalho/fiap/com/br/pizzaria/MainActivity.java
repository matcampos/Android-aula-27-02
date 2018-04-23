package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText edtUser;
    EditText edtSenha;
    String user = "fiap";
    String password ="fiap";
    BancoPizzas db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUser = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        db = new BancoPizzas(this);

        Log log = new Log();
        java.util.Date currentTime = Calendar.getInstance().getTime();
        log.setDescricao("MainActivity");
        long time = currentTime.getTime();
        log.setData(time);
        db.insertLog(log);
    }


    public void login(View view) {
        String authUser = edtUser.getText().toString();
        String authPassword = edtSenha.getText().toString();
        if(authUser.equals(user) && authPassword.equals(password)){
            Toast.makeText(this, "Logado com sucesso!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(
                    MainActivity.this,ListPizzasActivity.class
            );
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Senha ou usuário incorretos!", Toast.LENGTH_SHORT).show();
        }
    }
}
