package composite;

import java.util.ArrayList;
import java.util.List;

public class Composto implements Componente {
    private List<Componente> componentes = new ArrayList<>();

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibir() {
        System.out.println("composite.Composto:");
        for (Componente componente : componentes) {
            componente.exibir();
        }
    }
}
