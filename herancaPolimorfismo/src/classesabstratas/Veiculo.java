package classesabstratas;

public abstract class Veiculo {
    final int numeroRodasMinima =1;
    public String placa;
    public String chassi;

    abstract  public String acelerar();


     public String frear(){
         return "Acelerando";
     }
    }

