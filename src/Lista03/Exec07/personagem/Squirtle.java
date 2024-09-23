package Lista03.Exec07.personagem;

public class Squirtle extends Pokemon{

    double fatorMultiplicadorAgua;

    public Squirtle(String nome, double forca) {
        super(nome, forca);
    }

    public double usarWaterCannon(int valor){
        if(valor >= 1 && valor <= 100){
            return this.fatorMultiplicadorAgua * Math.sqrt(valor) * this.forca;
        }else{
            return 0;
        }
    }


}
