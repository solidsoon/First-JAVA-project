import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        int soma = numero + numero2;
        System.out.println("Soma: "+soma);

    }
}
