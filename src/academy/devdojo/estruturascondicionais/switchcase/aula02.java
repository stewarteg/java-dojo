package academy.devdojo.estruturascondicionais.switchcase;

public class aula02 {
    public static void main(String[] args) {
        String conta = "investimento";

        switch (conta) {
            case "poupanca":
                System.out.println("0.05%");
                break;

            case "corrente":
                System.out.println("0.02%");
                break;

            case "investimento":
                System.out.println("0.1%");
                break;

            default:
                System.out.println("conta invalida");
                break;
}}}


