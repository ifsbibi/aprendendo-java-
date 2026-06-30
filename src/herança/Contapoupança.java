package herança;

public class Contapoupança extends Conta{
        public Contapoupança (int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
            super(agencia, numeroConta, titularConta, saldo, isAtiva);

        }
   @Override
    public void depositar(double valor) {
            double rendimento = (getSaldo() + valor) * 0.01;

   }


    }
