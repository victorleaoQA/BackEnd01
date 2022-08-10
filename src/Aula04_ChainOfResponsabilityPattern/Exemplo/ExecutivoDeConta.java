package Aula04_ChainOfResponsabilityPattern.Exemplo;

public class ExecutivoDeConta extends FuncionarioBanco{
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia < 60000){
            System.out.println("Eu sou responsavel por processar essa solicitacao. EXECUTIVO DE CONTAS");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(quantia);
        }
    }
}
