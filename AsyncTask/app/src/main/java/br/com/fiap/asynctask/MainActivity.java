package br.com.fiap.asynctask;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;
    ImageView imgBaixada;
    EditText edtURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBaixada = findViewById(R.id.imgBaixada);
        edtURL = findViewById(R.id.edtURL);
    }

    public void download(View view) {
        String endereco = edtURL.getText().toString();

        DownloadAsyncTask downloadAsyncTask = new DownloadAsyncTask();
        downloadAsyncTask.execute(endereco);
    }

     class DownloadAsyncTask extends AsyncTask<String, Void, Bitmap>{
         @Override
         protected Bitmap doInBackground(String... strings) {
             try{
                InputStream inputStream;
                Bitmap imagem;

                URL endereco = new URL(strings[0]);

                inputStream = endereco.openStream();

                imagem = BitmapFactory.decodeStream(inputStream);

                inputStream.close();

                return imagem;
             }catch(Exception e){
                 e.printStackTrace();

             }
             return null;

         }

         @Override
         protected void onPreExecute() {
             super.onPreExecute();
             progressDialog = new ProgressDialog(MainActivity.this);
             progressDialog.setTitle(getString(R.string.aguarde));
             progressDialog.setMessage(getString(R.string.estamos_realizando_o_download));
             progressDialog.show();
         }

         @Override
         protected void onPostExecute(Bitmap bitmap) {
             super.onPostExecute(bitmap);

             if(progressDialog != null){
                 progressDialog.dismiss();
             }

             imgBaixada.setImageBitmap(bitmap);
         }
     }

}
