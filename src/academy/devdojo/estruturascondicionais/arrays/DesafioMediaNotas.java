package academy.devdojo.estruturascondicionais.arrays;

import java.util.Scanner;

public class DesafioMediaNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0;

        for (int i =0; i< notas.length;i++){
            System.out.println("digite a nota "+ (i+1));
            notas[i]= ler.nextDouble();
            media = media + notas[i];
        }
        System.out.println("a media das notas eh: " + media/ notas.length);


    }
}
