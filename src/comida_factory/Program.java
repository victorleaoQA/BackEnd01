package comida_factory;

public class Program {
    public static void main(String[] args) {
        final ComidaFactory comida = new ComidaFactory();

        Comida comida1 = comida.getComida("Massas");
        comida1.setPreço(10000);

        final Comida comida2 = comida.getComida("Massas");
        System.out.println(comida2.toString());
    }
}
