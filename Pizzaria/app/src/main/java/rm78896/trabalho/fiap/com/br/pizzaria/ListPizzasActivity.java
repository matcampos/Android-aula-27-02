package rm78896.trabalho.fiap.com.br.pizzaria;
import java.util.Calendar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.sql.Date;

public class ListPizzasActivity extends AppCompatActivity {
    BancoPizzas db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizzas);
        db = new BancoPizzas(this);

        Log log = new Log();
        java.util.Date currentTime = Calendar.getInstance().getTime();
        log.setDescricao("ListPizzasActivity");
        long time = currentTime.getTime();
        log.setData(time);
        db.insertLog(log);
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
