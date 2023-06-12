package composite;

public class Folha implements Componente {
    private String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("composite.Folha: " + nome);
    }
}
