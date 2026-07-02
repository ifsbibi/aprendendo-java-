import herança.Aviao;
import herança.Carro;
import herança.Motocicleta;
import herança.Transporte;

public class ManipulandoTransportes {
    public static void main(String[] args) {

        Transporte carro =  new Carro("Nono", "Volks", "Fusca", 1990, 80.00, true);

        Transporte moto = new Motocicleta("Black", "Honda","CB300", 2023, 26.000, true);

        Transporte aviao = new Aviao("Sky", "Boeing", "Boeing737",2020, 170.00, true);


        System.out.println(carro);
        System.out.println(moto);
        System.out.println(aviao);
    }
}