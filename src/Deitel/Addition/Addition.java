// Figura 2.7: Addition.java
// Programa de adicao que insere dois numeros. entao exibe a soma deles.



package Deitel.Addition;

import java.util.Scanner;

public class Addition {
    // método nain inicia a execução do aplicativo java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comandos
        Scanner input = new Scanner(System.in);

        int number1; // primeiro número a somar
        int number2; // segundo número a somar
        int sum; // soma de number1 e number2

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // lê o primeiro número a ser somado

        System.out.print("Enter a second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número a ser somado

        sum = number1 + number2; // executa soma dos números e depois armazema em sum

        System.out.printf("Sum is %d%n", sum); // exibe a soma
    } // fim do método main
} // fim da classe Addition
