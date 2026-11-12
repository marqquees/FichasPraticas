package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // Escreva um programa que determine a média aritmética de um conjunto de 3 notas introduzidas pelo utilizador.
        // Seguidamente, tendo em consideração os valores introduzidos,
        // também deve apresentar a média ponderada considerando as seguintes ponderações: 20%, 30%, 50% respetivamente.

        Scanner input = new Scanner(System.in);
        double notaUm, notaDois, notaTres, mediaAritmetica, mediaPonderada;

        System.out.print("Digite a primeira nota: ");
        notaUm = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        notaDois = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        notaTres = input.nextDouble();

        mediaAritmetica = (notaUm + notaDois + notaTres) / 3;
        mediaPonderada = notaUm * 0.2 + notaDois * 0.3 + notaTres * 0.5;

        System.out.print("\nMédia Aritimética: " + mediaAritmetica);
        System.out.print("\nMédia Ponderada: " + mediaPonderada);

    }
}
