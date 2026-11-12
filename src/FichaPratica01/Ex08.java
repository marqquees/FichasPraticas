package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5 canções.
        // A duração de cada canção é lida em minutos e segundos.

        Scanner input = new Scanner(System.in);
        int minuto, segundo, totalSegundo = 0;

        System.out.print("Canção 1");
        System.out.print("\nMinuto: ");
        minuto = input.nextInt();
        System.out.print("Segundo: ");
        segundo = input.nextInt();
        totalSegundo = totalSegundo + (minuto * 60) + segundo;

        System.out.print("\nCanção 2");
        System.out.print("\nMinuto: ");
        minuto = input.nextInt();
        System.out.print("Segundo: ");
        segundo = input.nextInt();
        totalSegundo = totalSegundo + (minuto * 60) + segundo;

        System.out.print("\nCanção 3");
        System.out.print("\nMinuto: ");
        minuto = input.nextInt();
        System.out.print("Segundo: ");
        segundo = input.nextInt();
        totalSegundo = totalSegundo + (minuto * 60) + segundo;

        System.out.print("\nCanção 4");
        System.out.print("\nMinuto: ");
        minuto = input.nextInt();
        System.out.print("Segundo: ");
        segundo = input.nextInt();
        totalSegundo = totalSegundo + (minuto * 60) + segundo;

        System.out.print("\nCanção 5");
        System.out.print("\nMinuto: ");
        minuto = input.nextInt();
        System.out.print("Segundo: ");
        segundo = input.nextInt();
        totalSegundo = totalSegundo + (minuto * 60) + segundo;

        System.out.print("\n" + totalSegundo + " segundos.");
    }
}
