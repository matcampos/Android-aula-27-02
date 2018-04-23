package rm78896.trabalho.fiap.com.br.pizzaria;

import java.sql.Date;

/**
 * Created by logonrm on 10/04/2018.
 */

public class Log {
    private int id;
    private String descricao;
    private long data;

    public Log() {
    }

    public Log(int id, String descricao, long data) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}
