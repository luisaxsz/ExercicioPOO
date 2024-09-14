package Lista2.Exerc1.dimensao.bidimensional;

public class TrianguloRetangulo{

    double cateto1;
    double cateto2;
    double hipotenusa;
    double alturaHipotenusa;

    public TrianguloRetangulo() {
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;
    }

    double calcularArea(){
        return (this.cateto1 * this.cateto2) / 2;
    }

    double calcularPerimetro(){
        return this.cateto1 + this.cateto2 + this.hipotenusa;
    }

}