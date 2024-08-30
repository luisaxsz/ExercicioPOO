package src.animal;

public class Animal {
    protected String som;

    public void emitirSom(){
        System.out.println(som);
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
