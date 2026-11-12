package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Escreva um programa que requisite dois valores.
        // O programa deverá utilizá-los como operandos para as seguintes operações aritméticas: soma, subtração,
        // multiplicação e divisão.
        // Apresente o resultado das operações e teste os resultados obtidos com vários casos.

        Scanner input = new Scanner(System.in);
        double numberOne, numberTwo, result;

        System.out.print("Digite um número: ");
        numberOne = input.nextDouble();

        System.out.print("Digite outro número: ");
        numberTwo = input.nextDouble();

        result = numberOne + numberTwo;
        System.out.print("\nA soma de " + numberOne + " + " + numberTwo + " = " + result);

        result = numberOne - numberTwo;
        System.out.print("\nA subtração de " + numberOne + " - " + numberTwo + " = " + result);

        result = numberOne * numberTwo;
        System.out.print("\nA multiplicação de " + numberOne + " * " + numberTwo + " = " + result);

        result = numberOne / numberTwo;
        System.out.print("\nA divisão de " + numberOne + " / " + numberTwo + " = " + result);
    }
}
