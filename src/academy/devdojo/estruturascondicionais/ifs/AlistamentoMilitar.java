package academy.devdojo.estruturascondicionais.ifs;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite se seu sexo eh M ou F");
        String sexo = ler.next();
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade>=18){
            System.out.println("alistamento obrigatorio");
    }else if (sexo.equalsIgnoreCase("M") && idade<18){
            System.out.println("Alistamento nao permitido");
        }else if (sexo.equalsIgnoreCase("F")&& idade>=18){
            System.out.println("deseja se alistar?");
        }else if (sexo.equalsIgnoreCase("F")&& idade<18){
            System.out.println("Alistamento nao permitido");
        }else {
            System.out.println("DADOS INCORRETOS");
        }

}
}
