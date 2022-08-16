// Figura 2.15: Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais e operadores de igualdade.

package Deitel.Comparison;

import java.util.Scanner;

public class Comparison {
    // método que inicia a execução do aplicativo java
    public static void main(String[] args) {
        // Cria um Scanner para obter a entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a comparar
        int number2; // sundo número a comparar

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    } // Fim do método main
} // fim da classe Comparison
