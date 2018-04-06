package fiap.com.br.arquivos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
        EditText edtMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMensagem = findViewById(R.id.edtMensagem);
    }

    public void salvar(View view){
        String mensagem = edtMensagem.getText().toString();



        try{
            FileOutputStream fos = openFileOutput("mensagem.txt",MODE_PRIVATE);
            fos.write(mensagem.getBytes());
            fos.close();

            Toast.makeText(this, R.string.informações_salvas_com_sucesso, Toast.LENGTH_SHORT).show();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            Toast.makeText(this, R.string.ewrro_ao_criar_arquivo, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();

            Toast.makeText(this, R.string.erro_ao_escrever_o_arquivo, Toast.LENGTH_SHORT).show();
        }
    }

    public void lerArquivo(View view) {
        try {
            FileInputStream fis = openFileInput("mensagem.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String mensagem = br.readLine();

            fis.close();

            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            Toast.makeText(this, R.string.abrir, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();

            Toast.makeText(this, R.string.ler, Toast.LENGTH_SHORT).show();
        }


    }
}
