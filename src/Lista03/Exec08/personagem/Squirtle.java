
package Lista03.Exec08.personagem;

public class Squirtle extends Pokemon {

    private double fatorMultiplicadorAgua;

    public Squirtle(String nome, int forca) {
        super(nome, forca);
    }

    public double usarWaterCannon(double intensidade) {
        return this.fatorMultiplicadorAgua * Math.sqrt(intensidade) * super.getForca();
    }

    public double getFatorMultiplicadorAgua() {
        return fatorMultiplicadorAgua;
    }

    public void setFatorMultiplicadorAgua(double fatorMultiplicadorAgua) {
        this.fatorMultiplicadorAgua = fatorMultiplicadorAgua;
    }


}
