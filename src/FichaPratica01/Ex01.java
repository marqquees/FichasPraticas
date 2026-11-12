package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Escreva um programa que faça a soma de dois números introduzidos pelo utilizador.
        // Apresente o resultado da operação.

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, result;

        System.out.print("Digite um número: ");
        numberOne = input.nextInt();

        System.out.print("Digite outro número: ");
        numberTwo = input.nextInt();

        result = numberOne + numberTwo;
        System.out.print("\nA soma de " + numberOne + " + " + numberTwo + " = " + result);
    }
}
