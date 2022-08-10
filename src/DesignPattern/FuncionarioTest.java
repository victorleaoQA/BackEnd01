package DesignPattern;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {
    @Test
    void Calculo() {
        Funcionario funcionario = new Efetivo("Lucas","Ferreira","123123123",10000,1,5000);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Issao","Takeuchi","123123123321",1000,40);
        funcionario.pagamentoSalario();

    }
}
