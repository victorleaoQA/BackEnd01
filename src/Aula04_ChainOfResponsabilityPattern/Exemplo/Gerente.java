package Aula04_ChainOfResponsabilityPattern.Exemplo;

public class Gerente extends FuncionarioBanco{
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia >= 60000 && quantia <= 200000){
            System.out.println("Eu sou responsavel por processar essa solicitacao. GERENTE");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(quantia);
        }
    }
}
