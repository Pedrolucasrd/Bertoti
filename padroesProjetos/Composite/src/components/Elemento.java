package components;

public class Elemento implements Component {
    private String nome;

    public Elemento(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(Component componente) {
    }

    @Override
    public void remover(Component componente) {
    }

    @Override
    public void exibir(int nivel) {
        System.out.println("-".repeat(nivel) + nome);
    }
}
