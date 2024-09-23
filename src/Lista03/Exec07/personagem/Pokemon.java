package Lista03.Exec07.personagem;

public class Pokemon {

    String nome;
    double forca;


    protected String comer(String alimento){
        return this.nome + " está comendo " + alimento;
    }

    public Pokemon(String nome, double forca) {
        this.nome = nome;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }
}
