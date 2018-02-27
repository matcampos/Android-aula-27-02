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

        int selecionado = rdgDificuldade.getCheckedRadioButtonId();
        String msg = "";
        switch (selecionado){
            case R.id.rdbFacil:
                msg = getString(R.string.f_cil);
                break;
            case R.id.rdbMedio:
                msg = getString(R.string.m_dio);
                break;
            case R.id.rdbDificl:
                msg = getString(R.string.dif_cil);
                break;
            default:
                msg = getString(R.string.nadaSelecionado);
                break;
        }

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
