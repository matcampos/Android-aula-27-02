package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListPizzasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizzas);
    }

    public void abrirFragment1(View view) {
        Intent intent = new Intent(
                ListPizzasActivity.this,FragmentPortuguesa.class
        );
        startActivity(intent);
        finish();
    }

    public void abrirFragment2(View view) {
        Intent intent = new Intent(
                ListPizzasActivity.this,FragmentPalmito.class
        );
        startActivity(intent);
        finish();
    }

    public void abrirFragment3(View view) {
        Intent intent = new Intent(
                ListPizzasActivity.this,FragmentCalabresa.class
        );
        startActivity(intent);
        finish();
    }

    public void openConfiguration(View view) {
        Intent intent = new Intent(
                ListPizzasActivity.this,configuration.class
        );
        startActivity(intent);
        finish();
    }
}
