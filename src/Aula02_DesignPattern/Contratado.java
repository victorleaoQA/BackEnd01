package Aula02_DesignPattern;

public class Contratado extends Funcionario {
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numConta, double valorHora, int horas) {
        super(nome, sobrenome, numConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }


    @Override
    public double calcularSaldo() {
        return valorHora*horas;
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositada uma quantia de: "+quantia);

    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerando um recibo -- Funcionario CONTRATADO");

    }
}
