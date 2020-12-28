package academy.devdojo.estruturascondicionais.ifs;

import java.util.Scanner;
public class VerificaIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        if (idade>18){
            System.out.println("eh maior de idade");
        } else{
            System.out.println("nao eh maior de idade");
        }

    }
}
