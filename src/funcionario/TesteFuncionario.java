package src.funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João"; // Atributo permitido pois é publico
        funcionario.cargo = "Gerente"; // Atributo permitido pois é protected e está no mesmo pacote

        /**
         * Atributo não permitido pois é privado e não está na mesma classe
         * e não possuí métodos de acesso.
         */
        //funcionario.salario = 10000.0;

        Gerente gerente = new Gerente();
        gerente.nome = "João"; // Atributo permitido pois é publico
        gerente.cargo = "Gerente"; // Atributo permitido pois é protected e está no mesmo pacote

        /**
         * Atributo não permitido pois é privado e não está na mesma classe
         * e não possuí métodos de acesso.
         */
        //gerente.salario = 10000.0;

        /**
         * Por mais que a variável gerenteFuncionario seja do tipo Funcionario
         * ela pode ser instanciada com um objeto do tipo Gerente, pois Gerente
         * é uma subclasse de Funcionario. E funcionario é a classe mãe de Gerente.
         */
        Funcionario gerenteFuncionario = new Gerente();
        gerenteFuncionario.nome = "João"; // Atributo permitido pois é publico
        gerenteFuncionario.cargo = "Gerente"; // Atributo permitido pois é protected e está no mesmo pacote

        /**
         * Atributo não permitido pois é privado e não está na mesma classe
         * e não possuí métodos de acesso.
         */
        //gerenteFuncionario.salario = 10000.0;

    }
}
