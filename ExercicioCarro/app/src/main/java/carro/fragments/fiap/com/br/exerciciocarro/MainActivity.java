package carro.fragments.fiap.com.br.exerciciocarro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shorFirstCar(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment,new FragmentCar1())
                .addToBackStack(null)
                .commit();
    }

    public void showSecondCar(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment,new FragmentCar2())
                .addToBackStack(null)
                .commit();
    }
}
