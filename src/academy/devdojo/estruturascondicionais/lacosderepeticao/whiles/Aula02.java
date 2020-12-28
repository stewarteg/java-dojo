package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero qualquer");
        int numero = ler.nextInt();
        int zero = 0;

        while (zero < numero){
            int resto = zero%2;
            if (resto==1) {
                System.out.println(zero);
            }
            zero= zero +1;
        }
    }
}
