package classesabstratas;

public class Carro extends Veiculo{

//Implementação do metodo abstrato acelerar() definido na superclasse
    public String acelerar(){
    return "Acelerando o carro";
    }

    //Sobrescrita do metodo concreto frear() definido na superclasse
    @Override
    public String frear() {
        //return "Freando o carro";
        return super.frear();
    }
}




