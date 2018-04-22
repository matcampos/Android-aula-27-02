package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentPalmito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_palmito);
    }

    public void voltar(View view) {
        Intent intent = new Intent(
                FragmentPalmito.this,ListPizzasActivity.class
        );
        startActivity(intent);
        finish();
    }
}
