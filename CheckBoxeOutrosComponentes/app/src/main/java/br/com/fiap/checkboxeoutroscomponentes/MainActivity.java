package br.com.fiap.checkboxeoutroscomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        CheckBox chkEstouAprendendo;
        RadioGroup rdgDificuldade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);
    }

    public void salvar(View view) {
        Toast.makeText(
                this,
                "Estou aprendendo Android: " + chkEstouAprendendo.isChecked(),
                Toast.LENGTH_SHORT).show();
    }
}
