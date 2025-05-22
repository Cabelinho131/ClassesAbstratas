package classesabstratas;

public class Programa {
    public static void main (String []args){
        Veiculo carro1 = new Carro();
        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());

        Moto moto1 = new Moto();
        System.out.println(moto1.acelerar());
        System.out.println(moto1.frear());
    }
}
