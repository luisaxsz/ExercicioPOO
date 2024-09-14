package Lista1.pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(25);

        System.out.println(pessoa.exibirInformações(pessoa.getNome(), pessoa.getIdade()));
    }
}
