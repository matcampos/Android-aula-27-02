package br.com.fiap.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 22/05/2018.
 */

public interface RetrofitContatosInterface {
    @GET("contatos.php")
    Call<List<Contato>>getContatos();
}
