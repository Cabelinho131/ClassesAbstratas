package classesabstratas;

public class Moto extends Veiculo{

    //Implementação do metodo abstrato acelerar() definido na superclasse
    public String acelerar(){
        return "Acelerando a moto";
    }

    //Sobrescrita do metodo concreto frear() definido na superclasse
    @Override
    public String frear() {
        return "Freando a moto";
    }
}


