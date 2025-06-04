import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
       Scanner inputText = new Scanner(System.in);

       System.out.println("Anote suas anotações aqui: ");

       String anotacao = inputText.nextLine();

       System.out.println("Essas são suas anotações: "+anotacao);

       inputText.close();

    }
}
