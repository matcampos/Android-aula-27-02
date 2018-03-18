package com.example.logonrm.pet_shop_78896;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rdb1;
    RadioButton rdb2;
    RadioButton rdb3;
    RadioButton rdb4;

    CheckBox ckb1;
    CheckBox ckb2;
    CheckBox ckb3;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdb1 = findViewById(R.id.rd1);
        rdb2 = findViewById(R.id.rd2);
        rdb3 = findViewById(R.id.rd3);
        rdb4 = findViewById(R.id.rd4);
        ckb1 = findViewById(R.id.checkboxFemea);
        ckb2 = findViewById(R.id.checkboxAdestrado);
        ckb3 = findViewById(R.id.checkboxVacina);
        txt = findViewById(R.id.txtVlewResult);
    }

    public void calcularValor(View view) {


        int valor = 0;
        if(rdb1.isChecked()){
            valor = 800;
        }else if(rdb2.isChecked()){
            valor = 750;
        }else if(rdb3.isChecked()){
            valor = 700;
        }else if(rdb4.isChecked()){
            valor = 800;
        }

        int valorCheck1 = 0;
        int valorCheck2 = 0;
        int valorCheck3 = 0;

        if(ckb1.isChecked()){
            valorCheck1 = 180;
        }
        if(ckb2.isChecked()){
            valorCheck2 = 400;
        }
        if(ckb3.isChecked()){
            valorCheck3 = 200;
        }

        int total = valor + valorCheck1 + valorCheck2 + valorCheck3;

        txt.setText("R$: "+String.valueOf(total)+",00");
    }
}
