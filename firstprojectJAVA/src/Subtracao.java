import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = input.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();

        int resultado = numero - numero2;

        System.out.println("Resultado da subtração de: "+numero +"+"+ numero2 +" é = "+resultado);
    }
}
