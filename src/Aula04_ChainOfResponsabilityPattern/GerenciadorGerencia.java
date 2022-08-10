package Aula04_ChainOfResponsabilityPattern;

public class GerenciadorGerencia extends Gerenciador{
    @Override
    public void verificar(Mail email) {//Vou fazer a verificação do destino e do assunto a partir do meu gerenciador
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
        (email.getAssunto().equalsIgnoreCase("Gerencia")))
        {
            System.out.println("Enviado ao departamento Gerencial");
        }
        else {//Verifico a próxima entrada e executo novamente o meu método verificar
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}
