
package Lista2.Exerc02.exerc02_geometria;


import Lista2.Exerc02.dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {

        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        // TODO 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso é prejudical para o projeto, porque os objetos ficam inseguros,
        // menos protegidos e são controlodos de forma inadequada.
//        tr1.cateto1 = 6;
//        tr1.cateto2 = 5;
//        tr1.hipotenusa = 7;
//        tr1.alturaHipotenusa = 4.5;
//
        // TODO 5 através do set, atribua valor 14.5 para o atributo cateto1
        tr1.setCateto1(14.5);
        // TODO 6 através do set, atribua valor 48.1 para o atributo cateto2
        tr1.setCateto2(48.1);
        // TODO 7 através do set, atribua valor 51.2 para o atributo hipotenusa]
        tr1.setHipotenusa(51.2);
        // TODO 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.setAlturaHipotenusa(12.3);

        // TODO 9 comente: as atribuições deram certo? Por quê?
        // Sim, as atribuições deram certo, pois o metodo setter permite a atribuição de valores aos atributos da classe TrianguloRetangulo.

        // TODO 10 crie aqui uma variável double de nome areaTr1
        double areaTr1;
        // TODO 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo
        areaTr1 = tr1.calcArea();
        ////////// e armazene o valor de retorno do método na variável areaTr1
        // TODO 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        System.out.println("Área do triângulo tr1: " + areaTr1);
        // TODO 13 comente: por que está dando erro?
        // Porque o método calcArea() está com modificador de acesso default e não está no mesmo pacote da classe Exerc02_Geometria.
        // TODO 14 comente: o que pode ser feito para resolver este erro?
        // Alterar o modificador de acesso do método calcArea() para public.


        // TODO 16 crie aqui uma variável double de nome perimetroTr1
        double perimetroTr1;
        // TODO 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        perimetroTr1 = tr1.calcPerimetro();
        // TODO 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        System.out.println("Perímetro do triângulo tr1: " + perimetroTr1);
        // TODO 19 comente: por que está dando erro?
        // Porque o método calcPerimetro() está com modificador de acesso default e não está no mesmo pacote da classe Exerc02_Geometria.
        // TODO 20 comente: o que pode ser feito para resolver este erro?
        // Alterar o modificador de acesso do método calcPerimetro() para public.

        // TODO 21 crie um outro objeto através do construtor, passando um valor inválido
        TrianguloRetangulo tr2 = new TrianguloRetangulo(0, 0, 0, 0);
        // TODO 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        double areaTr2 = tr2.calcArea();
        double perimetrotr2 = tr2.calcPerimetro();
        // TODO 23 imprima os valores dos cálculos
        System.out.println("Área do triângulo tr2: " + areaTr2);
        System.out.println("Perímetro do triângulo tr2: " + perimetrotr2);
        
        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        // O programa imprime os valores 0.0 para a área e o perímetro do triângulo tr2,
        // pois os valores passados para o construtor são inválidos.
        // Para corrigir o problema, é necessário adicionar validações no construtor da classe TrianguloRetangulo.
        
        
    }
    
}
