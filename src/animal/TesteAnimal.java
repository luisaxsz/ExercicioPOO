package src.animal;

public class TesteAnimal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setSom("Au au");

        Gato gato = new Gato();
        gato.setSom("Miau");

        cachorro.emitirSom();
        gato.emitirSom();

    }
}
