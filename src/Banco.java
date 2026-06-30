import herança.Conta;
import herança.Contacorrente;
import herança.Contapoupança;

public class Banco {
    public static void main(String[] args) {

        Conta cc = new Contacorrente(1001, 99901, "Evilyn", 50.00, true);

        Conta cp = new Contapoupança(1001, 1122330, "Evilyn", 100.00, true);

        System.out.println("---------------------------------");
        System.out.println("Saldo conta corrente");
        System.out.printf("Saldo inicial CC: %2.f", cc.getSaldo() );
        cc.depositar(950);
        cc.sacar(500);
        System.out.printf("Saldo final CC: %2.f", cc.getSaldo() );


        System.out.println("---------------------------------");
        System.out.println("Saldo conta poupança");
        System.out.printf("Saldo inicial CP: %2.f", cp.getSaldo() );
        cp.depositar(900);
        cp.sacar(500);
        System.out.printf("Saldo final CC: %2.f", cp.getSaldo() );




    }
}
