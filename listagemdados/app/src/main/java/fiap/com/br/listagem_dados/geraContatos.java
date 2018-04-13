package fiap.com.br.listagem_dados;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 12/04/2018.
 */

public class geraContatos {


public static List<Contato> geraContatos(){
    List<Contato> contatos = new ArrayList<>();

    Contato contato1 = new Contato(
             "Matheus",
                "(11)981806534",
                "No status",
            R.drawable.p1
    );

    Contato contato2 = new Contato(
            "Matheus",
            "(11)981806534",
            "No status",
            R.drawable.p2
    );

    Contato contato3 = new Contato(
            "Matheus",
            "(11)981806534",
            "No status",
            R.drawable.p3
    );

    Contato contato4 = new Contato(
            "Matheus",
            "(11)981806534",
            "No status",
            R.drawable.p4
    );

    Contato contato5 = new Contato(
            "Matheus",
            "(11)981806534",
            "No status",
            R.drawable.p5
    );

    Contato contato6 = new Contato(
            "Matheus",
            "(11)981806534",
            "No status",
            R.drawable.p6
    );


    contatos.add(contato1);
    contatos.add(contato2);
    contatos.add(contato3);
    contatos.add(contato4);
    contatos.add(contato5);
    contatos.add(contato6);
    return contatos;
}

}