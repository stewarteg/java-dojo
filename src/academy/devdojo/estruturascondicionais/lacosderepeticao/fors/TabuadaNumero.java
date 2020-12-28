package academy.devdojo.estruturascondicionais.lacosderepeticao.fors;

import java.util.Scanner;

public class TabuadaNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um numero para saber sua tabuada ate 10");
        int numero = ler.nextInt();


        for (int i =1; i<=10; i++){


            System.out.println(numero + " x " + i + " eh igual a: " + numero*i);

        }
    }
}
