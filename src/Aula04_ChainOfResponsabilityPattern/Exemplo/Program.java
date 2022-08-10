package Aula04_ChainOfResponsabilityPattern.Exemplo;

public class Program {
    public static void main(String[] args) {
        FuncionarioBanco handlerBase = new
                ExecutivoDeConta().setSeguinteFuncionario(new Gerente().setSeguinteFuncionario(new Diretor()));

        handlerBase.processarSolicitacao(7800);
        handlerBase.processarSolicitacao(780000);
        handlerBase.processarSolicitacao(78000);
    }

}
