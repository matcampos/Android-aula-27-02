package fiap.com.br.persistencia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 10/04/2018.
 */

public class MeuBanco extends SQLiteOpenHelper{
    public static final String NOME_BANCO="MeuBanco";
    private static final int VERSAO = 1;
    public static final String TB_CONTATOS ="contatos";

    public MeuBanco(Context context){
        super(context,NOME_BANCO,null,VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE "+TB_CONTATOS+" ( "+
                "`id`INTEGER PRIMARY KEY AUTOINCREMENT," +
                "`nome` TEXT " +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertContato(Contato contato){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("nome",contato.getNome());
        db.insert(TB_CONTATOS,null,cv);
    }

    public void updateContato(Contato contato) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("id",contato.getId());
        cv.put("nome",contato.getNome());
        db.update(
                TB_CONTATOS,
                cv,
                "id = ?",
                new String[]{String.valueOf(contato.getId())});
    }

    public void deleteContato(int id){
        SQLiteDatabase db = getWritableDatabase();

        db.delete(
                TB_CONTATOS,
                "id = ?",
                new String[]{String.valueOf(id)});
    }

    public List<Contato> todosContatos(){
        List<Contato>contatos = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(
                TB_CONTATOS,
                new String[]{"id","nome"},
                null,
                null,
                null,
                null,
                "nome"
        );

        while (cursor.moveToNext()){
            Contato contato = new Contato();
            contato.setId(cursor.getInt(0));
            contato.setNome(cursor.getString(1));

            contatos.add(contato);
        }

        return contatos;
    }

}
