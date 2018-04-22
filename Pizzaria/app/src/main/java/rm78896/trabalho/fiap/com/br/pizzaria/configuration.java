package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class configuration extends AppCompatActivity {
    EditText seconds;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        seconds = findViewById(R.id.seconds);
        sp = getPreferences(MODE_PRIVATE);
    }

    public void voltar(View view) {
        Intent intent = new Intent(
                configuration.this,ListPizzasActivity.class
        );
        startActivity(intent);
        finish();
    }


    public void salvar(View view) {
        int second = Integer.parseInt(seconds.getText().toString());
        int calc = second * 1000;
        second = calc;
        if(second < 3000 || second > 30000){
            Toast.makeText(this, "O numero de segundos devem estar entre 3 e 30", Toast.LENGTH_SHORT).show();
        }else {
            SharedPreferences.Editor edit = sp.edit();
            edit.putInt("seconds", second);
            edit.commit();
            Toast.makeText(this, "Gravado com sucesso!!"+" "+second, Toast.LENGTH_SHORT).show();
        }
    }

    public void recuperar(View view) {
        int nome = sp.getInt("nome", 0);
        Toast.makeText(this, String.valueOf(nome), Toast.LENGTH_SHORT).show();
    }
}
