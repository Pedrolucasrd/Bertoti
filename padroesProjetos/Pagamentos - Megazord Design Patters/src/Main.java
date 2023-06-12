import composite.Composto;
import composite.Folha;
import facade.PedidoFacade;

// Classe principal
public class Main {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.adicionarItemAoCarrinho("Camiseta");
        pedidoFacade.adicionarItemAoCarrinho("Calça");
        pedidoFacade.adicionarItemAoCarrinho("Tênis");
        pedidoFacade.removerItemDoCarrinho("Calça");
        pedidoFacade.efetuarPagamento(150.0);
        pedidoFacade.adicionarComponente(new Folha("composite.Folha 1"));
        pedidoFacade.adicionarComponente(new Folha("composite.Folha 2"));
        pedidoFacade.adicionarComponente(new Composto());
        pedidoFacade.exibirComponentes();
    }
}
