import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 ate 7:");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sabádo";
                yield String.format("Hoje é %s fim de semana :) \\o/", day);
            }
            case 2 -> "Segunda Feira";
            case 3 -> "Terça Feira";
            case 4 -> "Quarta Feira";
            case 5 -> "Quinta Feira";
            case 6 -> "Sexta Feira";
            default ->"Opção Inválida";
        };
        System.out.println(message);

    }

}
