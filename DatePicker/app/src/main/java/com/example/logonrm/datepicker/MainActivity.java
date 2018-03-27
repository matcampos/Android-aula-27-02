package com.example.logonrm.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dtpNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dtpNasc = findViewById(R.id.dtpNasc);
    }

    public void salvar(View view) {
        int dia = dtpNasc.getDayOfMonth();
        int mes = dtpNasc.getMonth() + 1;
        int ano = dtpNasc.getYear();

        String msg = String.format("Você selecionou: %d/%d/%d", dia, mes, ano);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}