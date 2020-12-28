package academy.devdojo.variaveis;

import java.util.Scanner;
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        float salario = ler.nextInt();
        float resultado;
        String porcentagem = "";

        if(salario>4500){
            resultado= salario*0.3F;
            porcentagem ="30% eh ";
        }else {
            resultado=salario*0.15F;
            porcentagem ="15% eh ";
        }
        System.out.println(porcentagem+resultado);

        /*if (salario>4500){
            System.out.println((salario*30)/100);
        }else {
            System.out.println((salario*15)/100);
        }*/
    }
}
