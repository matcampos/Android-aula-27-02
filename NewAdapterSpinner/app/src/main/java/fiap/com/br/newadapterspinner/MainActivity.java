package fiap.com.br.newadapterspinner;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spn;
    ImageView img;
    String[] txt = {
            "Argentina",
            "Brasil",
            "França",
            "Japão",
            "World"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn = findViewById(R.id.spn);
        img = findViewById(R.id.img);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, txt);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String bandeira = "";
                switch(position){
                    case 0:
                        img.setImageResource(R.drawable.argentina);
                        bandeira = "Argentina";
                        break;

                    case 1:
                        img.setImageResource(R.drawable.brasil);
                        bandeira = "Brasil";
                        break;

                    case 2:
                        img.setImageResource(R.drawable.franca);
                        bandeira = "França";
                        break;

                    case 3:
                        img.setImageResource(R.drawable.japao);
                        bandeira = "Japão";
                        break;

                    case 4:
                        img.setImageResource(R.drawable.world);
                        bandeira = "World";
                        break;

                }
                Toast.makeText(MainActivity.this, "Você selecionou a bandeira: "+bandeira, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
