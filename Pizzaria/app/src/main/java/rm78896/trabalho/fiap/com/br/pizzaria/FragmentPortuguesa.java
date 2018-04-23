package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class FragmentPortuguesa extends AppCompatActivity {
    BancoPizzas db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_portuguesa);

        db = new BancoPizzas(this);

        Log log = new Log();
        java.util.Date currentTime = Calendar.getInstance().getTime();
        log.setDescricao("FragmentPortuguesa");
        long time = currentTime.getTime();
        log.setData(time);
        db.insertLog(log);
    }

    public void voltar(View view) {
        Intent intent = new Intent(
                FragmentPortuguesa.this,ListPizzasActivity.class
        );
        startActivity(intent);
        finish();
    }
}
