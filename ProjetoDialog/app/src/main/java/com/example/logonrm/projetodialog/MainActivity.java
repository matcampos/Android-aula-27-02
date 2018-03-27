package com.example.logonrm.projetodialog;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] itens = {"Azul","Amarelo","Verde"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle(R.string.eusouumalert);
                builder.setMessage(R.string.conteudo_alert);
                builder.setCancelable(true);
                builder.setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, R.string.funcionou, Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton(getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, R.string.cancelado, Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
    }

    public void abrirAlertComItens(View view) {
   AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.alert_com_itens));
        builder.setItems(itens, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, (getString(R.string.voce_selecionou)) + itens[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void abrirAlertComRadio(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.alert_com_radiob);
        builder.setSingleChoiceItems(itens, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, (getString(R.string.voce_seleconou_o_radio)) + itens[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void abrirAlertComCheck(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.alert_com_check_);
        builder.setMultiChoiceItems(itens, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean b) {
                Toast.makeText(MainActivity.this, "Iten "+itens[i]+" foi selecionado?"+b, Toast.LENGTH_SHORT).show();

            }
        });
        builder.show();
    }

    public void abrirAlertComProgress(View view) {

        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(getString(R.string.eu_sou_em_progress_dialog));
        pd.setMessage(getString(R.string.aguarde_estamos_carregando_o_seu_dado));
        pd.show();
    }

    public void abrirAlertComDatePickerDialog(View view) {
        DatePickerDialog picker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                Toast.makeText(MainActivity.this, dayOfMonth+"/"+(month+1)+"/"+year, Toast.LENGTH_SHORT).show();
                    }
                },
                2018,
                3,
                27);
        picker.show();
    }

    public void abrirAlertComTimePickerDialog(View view) {
        TimePickerDialog tp = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
            }
        },20,
                35,
                true

        );
        tp.show();
    }
}
