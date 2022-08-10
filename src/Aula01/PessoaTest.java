package Aula01;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Amanda", "Monteiro");
        p1.setIdade(LocalDate.of(1991,4,9));

        p2 = new Pessoa("Victor", "Gomes");
        p2.setIdade(LocalDate.of(1986,12,7));

        p3 = new Pessoa("Andre","Felicio");
        p3.setIdade(LocalDate.of(1994,5,29));
    }



    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    @Test
    void adicionarColecao(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
    }


}
