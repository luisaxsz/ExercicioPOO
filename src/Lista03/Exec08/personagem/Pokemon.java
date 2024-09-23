package Lista03.Exec08.personagem;

public class Pokemon {
    private String nome;
    private int forca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public Pokemon(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    protected void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento);
    }

}
