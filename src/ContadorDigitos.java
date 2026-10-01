import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {

        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = lerNumeros.nextInt();
        //O Codigo
        if (num >=1 && num <=9) {
            System.out.println("Este numero tem 1 digito");
        }
        else if (num >=10 && num < 100){
            System.out.println("Este numero tem 2 digitos");
        }
        else if ( num >=100 && num <= 999){
            System.out.println("Este numero tem 3 digitos");
        }
        else if ( num >=1000 && num <= 9999) {
            System.out.println("Este numero tem 4 digitos");
        }
        else if ( num >=10000 && num <= 99999) {
            System.out.println("Este numero tem 5 digitos");
        }
        else if ( num >=100000 && num <= 999999) {
            System.out.println("Este numero tem 6 digitos");
        }

    }
}



