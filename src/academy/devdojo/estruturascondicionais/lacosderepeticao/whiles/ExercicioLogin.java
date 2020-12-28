package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class ExercicioLogin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String login = "admin";
        String senha = "123ste";
        //String acesso= "";
        boolean usuarioAutenticado = true;

       // while (acesso.equalsIgnoreCase("") ){
        while (usuarioAutenticado){
            System.out.println("Digite o login ");
            String loginUsuario = ler.next();
            System.out.println("Digite a senha");
            String senhaUsuario = ler.next();

            if (senha.equalsIgnoreCase(senhaUsuario) && loginUsuario.equalsIgnoreCase(loginUsuario)){
                  usuarioAutenticado = false;
         //       acesso = "acesso permitido";
                System.out.println("Acesso permitido");
            }else{
                System.out.println("acesso negado, digite novamente");
            }
    }
}}
