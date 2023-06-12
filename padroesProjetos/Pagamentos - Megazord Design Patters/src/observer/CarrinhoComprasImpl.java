package observer;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoComprasImpl implements CarrinhoCompras {
    private List<Observador> observadores = new ArrayList<>();
    private List<String> itens = new ArrayList<>();

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        notificarObservadores();
    }

    @Override
    public void removerItem(String item) {
        itens.remove(item);
        notificarObservadores();
    }

    @Override
    public void anexarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void desanexarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(itens.size());
        }
    }
}
