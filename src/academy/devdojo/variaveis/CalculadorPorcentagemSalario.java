package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculadorPorcentagemSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salario;
        float porcentagem;
        float calculoPorcentagem;

        System.out.println("Digite seu salario:");
        salario = ler.nextInt();

        System.out.println("Digite a porcentagem relativa ao salario:");
        porcentagem = ler.nextInt();

        calculoPorcentagem = (salario * porcentagem) / 100;
        System.out.println(porcentagem + "% de " + salario + " eh " + calculoPorcentagem);


    }
}
