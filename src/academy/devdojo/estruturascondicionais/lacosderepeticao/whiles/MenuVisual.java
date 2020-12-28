package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class MenuVisual {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3){
            System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Calcular imposto ");
        System.out.println("2 - Depositar salario ");
        System.out.println("3 - sair");
         opcao = ler.nextInt();

    }
}}
