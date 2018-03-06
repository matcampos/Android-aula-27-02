package br.com.fiap.jogodedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] imgs ={R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6
    };

    ImageView imgDado;
    ImageView imgDado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDado = findViewById(R.id.imgDado);
        imgDado2 = findViewById(R.id.imgDado2);
    }


    public void sortear(View view) {
        Random random = new Random();
        int sorteado = random.nextInt(6);
        int sorteado2 = random.nextInt(6);
        imgDado.setImageResource(imgs[sorteado]);
        imgDado2.setImageResource(imgs[sorteado2]);
        if(sorteado > sorteado2){
            Toast.makeText(this, R.string.text_usuario, Toast.LENGTH_SHORT).show();
        }else if(sorteado2 > sorteado){
            Toast.makeText(this, R.string.text_pc, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, R.string.text_empate, Toast.LENGTH_SHORT).show();
        }

    }
}
