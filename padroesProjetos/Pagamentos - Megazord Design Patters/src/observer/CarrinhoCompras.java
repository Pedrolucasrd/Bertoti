package observer;

public interface CarrinhoCompras {
    void adicionarItem(String item);

    void removerItem(String item);

    void anexarObservador(Observador observador);

    void desanexarObservador(Observador observador);

    void notificarObservadores();
}
