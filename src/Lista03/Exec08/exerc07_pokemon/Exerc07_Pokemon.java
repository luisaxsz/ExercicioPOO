
package Lista03.Exec08.exerc07_pokemon;

import Lista03.Exec08.personagem.Charmander;
import Lista03.Exec08.personagem.Squirtle;

import java.util.Random;

public class Exerc07_Pokemon {

    public static void main(String[] args) {
        // TODO 1: Tente instanciar um objeto da classe Squirtle de nome s1 usando o 
        // construtor não parametrizado

        //Squirtle s1 = new Squirtle();
        
        // TODO 2: Há erro? Por quê?
        // R: Pois não existe um construtor padrão na classe Squirtle apenas o parametrizado.
        
        // TODO 3: Agora, instancie o objeto s1 usando o construtor parametrizado
        Squirtle s1 = new Squirtle("Squirtle", 100);
        
        // TODO 4: Através de s1, altere o nome, a força e o fator multiplicador de água 
        // desse Squirtle
        s1.setNome("SquirtleAlterado");
        s1.setForca(200);
        s1.setFatorMultiplicadorAgua(2.0);
        
        // TODO 5: Instacie o objeto da classe Charmander de nome c1.

        Charmander c1  = new Charmander("Charmander", 100);
        
        // TODO 6: Através de c1, altere o nome, a força e o fator multiplicador de fogo
        c1.setNome("CharmanderAlterado");
        c1.setForca(200);
        c1.setFatorMultiplicadorFogo(2.0);

        // TODO 7: Gere dois números reais aleatórios entre 1 e 100
        // (use a classe Random do Java para essa tarefa)
        Random random = new Random();
        int valor1 = random.nextInt(100) + 1;
        int valor2 = random.nextInt(100) + 1;
        
        // TODO 8: Passe o primeiro número aleatório para o método de ataque do Squirtle
        // e armazene o valor em uma variável
        var ataqueSquirtle = s1.usarWaterCannon(valor1);
        
        // TODO 9: Passe o segundo número aleatório para o método de ataque do Charmander
        // e armazene o valor em uma variável
        var ataqueCharmander = c1.usarFireBall(valor2);
        
        // TODO 10: Implemente aqui a regra que imprime o vencedor

        if(ataqueSquirtle > ataqueCharmander) {
            System.out.println("O vencedor é: " + s1.getNome());
        }else {
            System.out.println("O vencedor é: " + c1.getNome());
        }
    }
    
}
