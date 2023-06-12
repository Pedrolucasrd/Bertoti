package components;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Component {
    private String nome;
    private List<Component> elementos = new ArrayList<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(Component componente) {
        elementos.add(componente);
    }

    @Override
    public void remover(Component componente) {
        elementos.remove(componente);
    }

    @Override
    public void exibir(int nivel) {
        System.out.println("-".repeat(nivel) + nome);

        for (Component componente : elementos) {
            componente.exibir(nivel + 1);
        }
    }
}
