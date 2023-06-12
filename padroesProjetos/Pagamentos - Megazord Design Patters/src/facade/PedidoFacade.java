package facade;

import composite.Componente;
import composite.Composto;
import observer.CarrinhoCompras;
import observer.CarrinhoComprasImpl;
import strategy.FormaPagamento;
import strategy.PagamentoCartaoCredito;

public class PedidoFacade {
    private CarrinhoCompras carrinhoCompras;
    private FormaPagamento formaPagamento;
    private Composto componente;

    public PedidoFacade() {
        carrinhoCompras = new CarrinhoComprasImpl();
        formaPagamento = new PagamentoCartaoCredito();
        componente = new Composto();
    }

    public void adicionarItemAoCarrinho(String item) {
        carrinhoCompras.adicionarItem(item);
    }

    public void removerItemDoCarrinho(String item) {
        carrinhoCompras.removerItem(item);
    }

    public void efetuarPagamento(double valor) {
        formaPagamento.pagar(valor);
    }

    public void adicionarComponente(Componente componente) {
        this.componente.adicionarComponente(componente);
    }

    public void removerComponente(Componente componente) {
        this.componente.removerComponente(componente);
    }

    public void exibirComponentes() {
        componente.exibir();
    }
}
