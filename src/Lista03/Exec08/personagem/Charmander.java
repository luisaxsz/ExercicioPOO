
package Lista03.Exec08.personagem;

public class Charmander extends Pokemon {
    private double fatorMultiplicadorFogo;
    
    public Charmander(String nome, int forca) {
        super(nome, forca);
    }
    
    public double usarFireBall(double intensidade) {
        return this.fatorMultiplicadorFogo * Math.cbrt(intensidade) * this.getForca();
    }

    public double getFatorMultiplicadorFogo() {
        return fatorMultiplicadorFogo;
    }

    public void setFatorMultiplicadorFogo(double fatorMultiplicadorFogo) {
        this.fatorMultiplicadorFogo = fatorMultiplicadorFogo;
    }
}
