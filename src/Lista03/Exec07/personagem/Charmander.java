package Lista03.Exec07.personagem;

public class Charmander extends Pokemon{

    double fatorMultiplicadorFogo;

    public Charmander(String nome, double forca) {
        super(nome, forca);
    }

    public double usarFireBall(int valor){
        if(valor >= 1 && valor <= 100){
            return this.fatorMultiplicadorFogo * Math.cbrt(valor) * this.forca;
        }else{
            return 0;
        }
    }
}
