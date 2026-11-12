package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos.
        // Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.

        Scanner input = new Scanner(System.in);
        double produtoUm, produtoDois, produtoTres, valorTotal, valorAPagar;

        System.out.print("Preço do produto 1: ");
        produtoUm = input.nextDouble();

        System.out.print("Preço do produto 2: ");
        produtoDois = input.nextDouble();

        System.out.print("Preço do produto 3: ");
        produtoTres = input.nextDouble();

        valorTotal = produtoUm + produtoDois + produtoTres;
        valorAPagar = valorTotal * 0.9;

        System.out.print("\nValor Total: " + valorTotal);
        System.out.print("\nValor a pagar pelo Cliente: " + valorAPagar);
    }
}
