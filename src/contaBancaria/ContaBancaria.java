package src.contaBancaria;

public class ContaBancaria {

    private double saldo;
    private String senha;

    public void depositarSaldo(double valor) {
        saldo += valor;
    }

    public boolean sacarSaldo(double valor, String senha) {
        if (this.senha.equals(senha)) {
            saldo -= valor;
            return true;
        }
        throw new IllegalArgumentException("Senha incorreta");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
