import java.util.Scanner;

public class conditional {
}

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("Digite um peso: ");
        double peso = leia.nextDouble();

        System.out.printf("O peso é = %.2f e a altura é %.2f", peso, altura);

        double imc = peso / Math.pow(altura,2); // altura * atura -> potencia

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 & < 25){
            System.out.println("**Peso ideal (parábens)**");
        } else if (imc >= 25 & imc < 30){
            System.out.println("**Levemente acima do peso**");
        } else if (imc >=30 & imc < 35){
            System.out.println("**Obsesidade grau I**");
        } else {
            System.out.println("**Obesidade Severa/Mórbida**");
        }

    }


}
