package Aula03_Integradora01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;

    @BeforeEach
    public void doBefore(){
        func1 = new Funcionario("Victor", 14);
        func1.vender(2);

        func2 = new Funcionario("Andre", 7);
        func2.vender(1);

        afi1 = new Afiliado("Cristian");
        afi1.vender(1);

        afi2 = new Afiliado("Corleth");
        afi2.vender(3);

        afi3 = new Afiliado("Correia");

        func1.addAfiliado(afi1);
        func1.addAfiliado(afi3);
    }

    @Test
    public void mostrarVendas(){
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
    }


}
