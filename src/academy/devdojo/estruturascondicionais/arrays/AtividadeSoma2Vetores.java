package academy.devdojo.estruturascondicionais.arrays;

import java.util.Scanner;

public class AtividadeSoma2Vetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor1 = new int[9];
        int[] vetor2 = new int[9];
        int[] multiplicacao = new int[9];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + " pro vetor 1");
            vetor1[i] = ler.nextInt();
            System.out.println("Digite o valor " + (i + 1) + " pro vetor 2");
            vetor2[i] = ler.nextInt();
            multiplicacao[i] = vetor1[i] * vetor2[i];
        }
        System.out.println("Eis as multiplicacoes dos valores:");
        for (int i = 0; i < multiplicacao.length; i++) {
            System.out.println(vetor1[i] + " x " + vetor2[i] + " = " + multiplicacao[i]);
        }
    }
}
