package academy.devdojo.estruturascondicionais.ifs;

import java.util.Scanner;

public class IdadeTorneioNatacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome= ler.next();
        System.out.println("Digite sua idade: ");
        int idade= ler.nextInt();


        if(idade < 10 ){
            System.out.println("infantil");
        }else if (idade>=11 && idade<= 15){
            System.out.println("juvenil");
        }else if (idade>=16 && idade<=19){
            System.out.println("pre-adulto");
        }else if (idade>=20){
            System.out.println(nome+ " possui " + idade + " anos, entao eh adulto");
        }
    }
}
