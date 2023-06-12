package observer;

public class NotificacaoEmailObservador implements Observador {
    @Override
    public void atualizar(int quantidadeItens) {
        System.out.println("Enviando notificação por e-mail: " + quantidadeItens + " itens no carrinho de compras.");
    }
}
