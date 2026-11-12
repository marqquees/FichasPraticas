package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // Escreva um programa que leia dois valores inteiros e os armazene nas variáveis valor1 e valor2.
        // Permute o valor das variáveis e apresente o resultado.
        // A seguir, verifique se consegue efetuar esta troca sem criar variáveis adicionais.

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Valor 1: ");
        valor1 = input.nextInt();

        System.out.print("Valor 2: ");
        valor2 = input.nextInt();

        // Troca efetuada sem o recurso da Variável Auxiliar
        valor2 = valor1 + valor2;
        valor1 = valor2 - valor1;
        valor2 = valor2 - valor1;

        System.out.print("\nValor 1: " + valor1);
        System.out.print("\nValor 2: " + valor2);
    }
}
