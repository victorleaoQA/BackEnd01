package Aula04_ChainOfResponsabilityPattern.Exemplo;

public class Diretor extends FuncionarioBanco{
    @Override
    public void processarSolicitacao(Integer quantia) {
        if (quantia > 200000){
            System.out.println("Eu sou responsavel por processar essa solicitacao. DIRETOR");
        } else if (this.seguinteFuncionario != null) {
            this.seguinteFuncionario.processarSolicitacao(quantia);
        }
    }
}
