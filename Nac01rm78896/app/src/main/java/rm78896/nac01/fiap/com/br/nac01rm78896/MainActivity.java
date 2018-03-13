package rm78896.nac01.fiap.com.br.nac01rm78896;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    TextView txtResult;
    EditText edt;
    double vlInicial;
    double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         cb = findViewById(R.id.cb);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        txtResult = findViewById(R.id.txtResult);
        edt = findViewById(R.id.edt);
        vlInicial = 10;
        edt.setText(String.valueOf(vlInicial));
    }

    public void calcular(View view) {
        if(rb1.isChecked()){
            total = Double.parseDouble(edt.getText().toString()) * 24.90;
        }

        if(rb2.isChecked()){
            total = Double.parseDouble(edt.getText().toString()) * 11.90;
        }
        if(rb3.isChecked()){
            total = Double.parseDouble(edt.getText().toString()) * 39.90;
        }
        if(rb4.isChecked()){
            total = Double.parseDouble(edt.getText().toString()) * 16.90;
        }

        if(cb.isChecked()){
            total = (total * 1.3);
        }

        txtResult.setText(String.valueOf(total));


    }


}
