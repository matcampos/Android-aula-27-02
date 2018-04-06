package fiap.com.br.salvarnoarquivo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    EditText edtSenha;
    SharedPreferences sp;
    Boolean validado;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.nome);
        edtSenha = findViewById(R.id.senha);
        chb = findViewById(R.id.chb);
        try {
            FileInputStream fis = openFileInput("mensagem.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String mensagem = br.readLine();

            fis.close();

            edtNome.setText(mensagem.substring(0,mensagem.indexOf(" ")));
            edtSenha.setText(mensagem.substring(mensagem.indexOf(" "),mensagem.length() -1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            Toast.makeText(this, R.string.abrir, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();

            Toast.makeText(this, R.string.lr, Toast.LENGTH_SHORT).show();
        }
    }

    public void salvar(View view) {
        if(chb.isChecked()) {
            String login = edtNome.getText().toString() + " " + edtSenha.getText().toString();
            try {
                FileOutputStream fos = openFileOutput("mensagem.txt", MODE_PRIVATE);
                fos.write(login.getBytes());
                fos.close();

                Toast.makeText(this, R.string.salvarSucesss, Toast.LENGTH_SHORT).show();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, R.string.salvarerr, Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();

                Toast.makeText(this, R.string.erro_escrever, Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void recuperar(View view) {

    }
}
