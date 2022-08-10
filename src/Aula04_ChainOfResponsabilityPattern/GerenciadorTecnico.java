package Aula04_ChainOfResponsabilityPattern;

public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Técnico")))
        {
            System.out.println("Enviado ao Departamento Tecnico");
        }
        else {
            if (this.getSeguinte()!=null) {//Chamamos ao método o seguinte objeto
                this.getSeguinte().verificar(email);
            }
        }
    }
}
