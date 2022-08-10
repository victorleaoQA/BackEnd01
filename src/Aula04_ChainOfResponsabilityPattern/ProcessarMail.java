package Aula04_ChainOfResponsabilityPattern;

public class ProcessarMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com", "tecnica@digitalhouse.com", "reclamacao"));
        processo.verificar(new Mail("email@email.com", "sds@digitalhouse.com", "Gerência"));
        processo.verificar(new Mail("email@email.com", "juan@pepelegal.com", "Comercial"));
        processo.verificar(new Mail("email@email.com", "tecnica@colmeia.com", "Reclamação"));
    }
}
