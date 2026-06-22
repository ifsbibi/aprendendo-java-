import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu: nome");
        nome = leia.nextLine();

        System.out.println("Digite sua idade:");
        idade = Integer.parseInt(leia.nextLine());

        System.out.printf("Esse é "+nome+" e ele tem "+idade+" ");
        System.out.println();
    }
}
