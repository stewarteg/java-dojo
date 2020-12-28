package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculadorDiferencaIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int primeiraIdade;
        int segundaIdade;
        //int diferencaIdade;

        System.out.println("Escreve o primeiro numero");
        primeiraIdade = ler.nextInt();

        System.out.println("Escreve o segundo numero");
        segundaIdade = ler.nextInt();

        if (primeiraIdade > segundaIdade) {
            System.out.println(primeiraIdade - segundaIdade);
        } else {
            System.out.println("A diferenca eh " + (segundaIdade - primeiraIdade));
        }

    }
    //diferencaIdade = (primeiraIdade - segundaIdade);
    //System.out.println("A diferenca eh" + diferencaIdade);


}

