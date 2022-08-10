package Aula04_ChainOfResponsabilityPattern;

public class CheckMail {
    Gerenciador inicial;
    public CheckMail(){
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnica = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setSeguinte(tecnica);
        tecnica.setSeguinte(comercial);
        comercial.setSeguinte(spam);
    }

    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
