package br.com.fiap.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 17/05/2018.
 */

public class Gerador {
    public static List<Contato> listar(){
        List<Contato> contatos = new ArrayList<>();
        Contato contato1 = new Contato("João","(11) 12345678","...", R.drawable.person1);
        Contato contato2 = new Contato("Joana","(11) 12345678","...", R.drawable.person2);

        contatos.add(contato1);
        contatos.add(contato2);

        return contatos;
    }
}
