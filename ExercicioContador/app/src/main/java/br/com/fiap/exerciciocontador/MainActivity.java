package br.com.fiap.exerciciocontador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtNumero;
    int numeroInicial = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = findViewById(R.id.txtNumero);
    }

    public void subtrair(View view) {
        if(numeroInicial >0) {
            numeroInicial--;
        }else{
            Toast.makeText(this, "Não é possível subtrair menos que 0", Toast.LENGTH_SHORT).show();
        }
        txtNumero.setText(String.valueOf(numeroInicial));
    }

    public void somar(View view) {
        if(numeroInicial <10) {
            numeroInicial++;
        }else{
            Toast.makeText(this, "Não é possivel incrementar mais que 10", Toast.LENGTH_SHORT).show();
        }
        txtNumero.setText(String.valueOf(numeroInicial));
    }
}
