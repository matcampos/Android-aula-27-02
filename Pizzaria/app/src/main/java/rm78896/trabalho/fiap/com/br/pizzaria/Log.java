package rm78896.trabalho.fiap.com.br.pizzaria;

import java.sql.Date;

/**
 * Created by logonrm on 10/04/2018.
 */

public class Log {
    private int id;
    private String descricao;
    private java.util.Date data;

    public Log() {
    }

    public Log(int id, String descricao, Date data) {
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

    public java.util.Date getData() {
        return data;
    }

    public void setData(java.util.Date data) {
        this.data = data;
    }
}
