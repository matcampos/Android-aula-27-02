package rm78896.trabalho.fiap.com.br.pizzaria;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class BancoPizzas extends SQLiteOpenHelper {
    public static final String NOME_BANCO="MeuBanco";
    private static final int VERSAO = 1;
    public static final String TB_CONTATOS ="contatos";

    public BancoPizzas(Context context){
        super(context,NOME_BANCO,null,VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE "+TB_CONTATOS+" ( "+
                "`id`INTEGER PRIMARY KEY AUTOINCREMENT," +
                "`nome` TEXT ," +
                "`data` TEXT "+
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertLog(Log log){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("descricao",log.getDescricao());
        cv.put("data",log.getData().toString());
        db.insert(TB_CONTATOS,null,cv);
    }



}
