package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // Escreva um programa que calcule e apresente a área e o perímetro de um retângulo.
        // As dimensões devem ser requisitadas ao utilizador.

        Scanner input = new Scanner(System.in);
        double valorA, valorB, area, perimetro;

        System.out.print("Digite a medida do lado A do Retângulo: ");
        valorA = input.nextDouble();

        System.out.print("Digite a medida do lado B do Retângulo: ");
        valorB = input.nextDouble();

        area = valorA * valorB;
        perimetro = (valorA * 2) + (valorB * 2);

        System.out.print("\nÁrea do Retângulo: " + area);
        System.out.print("\nPerímetro do Retângulo: " + perimetro);
    }
}
