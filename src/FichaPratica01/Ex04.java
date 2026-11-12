package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Escreva um programa para calcular a área da circunferência.
        // As dimensões devem ser requisitadas ao utilizador.

        Scanner input = new Scanner(System.in);
        double raio, areaCircuferencia;

        System.out.print("Digite o raio da circunferência: ");
        raio = input.nextDouble();

        areaCircuferencia = 3.14 * (raio * raio);
        System.out.print("\nÁrea da Circunferência: " + areaCircuferencia);
    }
}
