package src.veiculos;

public class TesteVeiculos {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Fiat";
        veiculo.modelo = "Uno";
        veiculo.ano = 2010;
       // veiculo.chassi = "9BGRD08X06GJ"; // veiculo tem acesso privado sem metodos de acesso(Set, get)

        Carro carro = new Carro();
        carro.marca = "Chevrolet";
        carro.modelo = "Celta";
        carro.ano = 2012;
       // carro.chassi = "9BGRD08X06GJ"; // carro tem acesso privado sem metodos de acesso(Set, get)

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CG 125";
        moto.ano = 2015;
       // moto.chassi = "9BGRD08X06GJ";// moto tem acesso privado sem metodos de acesso(Set, get)

        Caminhao caminhao = new Caminhao();
        caminhao.marca = "Volvo";
        caminhao.modelo = "FH 540";
        caminhao.ano = 2018;
        // caminhao.chassi = "9BGRD08X06GJ"; // caminhao tem acesso privado sem metodos de acesso(Set, get)

    }
}
