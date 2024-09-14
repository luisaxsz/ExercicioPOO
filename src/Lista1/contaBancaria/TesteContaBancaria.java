package Lista1.contaBancaria;

public class TesteContaBancaria {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(1000);
        conta.setSenha("1234");

        conta.depositarSaldo(500);
        System.out.println("Saldo: " + conta.getSaldo());

        try {
            conta.sacarSaldo(200, "1234");
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacarSaldo(200, "12345");
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
