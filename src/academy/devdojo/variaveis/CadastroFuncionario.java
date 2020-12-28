package academy.devdojo.variaveis;

import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nomede usuario: ");
        String nomedousuario = ler.next();

        if (nomedousuario.equalsIgnoreCase("") || nomedousuario.equalsIgnoreCase("admin") || nomedousuario.equalsIgnoreCase("administrador")){
            System.out.println("Usuário Invalido");
        } else {
            System.out.println(nomedousuario + "Cadastrado com sucesso");
        }

    }
}
