package br.com.fiap.recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by logonrm on 17/05/2018.
 */

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder>{

    private Context context;
    private List<Contato> contatos;


    public ContatoAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public ContatoAdapter.ContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_contato,parent,false);

        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);
        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(ContatoAdapter.ContatoViewHolder holder, int position) {
        Contato contato = contatos.get(position);

        holder.imgContato.setImageResource(contato.getImagem());
        holder.txtNome.setText(contato.getNome());
        holder.txtTelefone.setText(contato.getTelefone());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, , Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return this.contatos.size();
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {
    ImageView imgContato;
    TextView txtNome;
    TextView txtTelefone;
    CardView cardView;

        public ContatoViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView);
            imgContato = itemView.findViewById(R.id.imgContato);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtTelefone = itemView.findViewById(R.id.txtTelefone);



        }
    }
}
