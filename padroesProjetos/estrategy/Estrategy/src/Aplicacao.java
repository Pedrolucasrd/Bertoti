import frete.FreteExpresso;
import frete.FreteNormal;
import frete.FretePremium;

public class Aplicacao {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.setEstrategiaFrete(new FreteNormal());
        double freteNormal = carrinho.calcularFrete(10.0);
        System.out.println("Frete normal: R$" + freteNormal);

        carrinho.setEstrategiaFrete(new FreteExpresso());
        double freteExpresso = carrinho.calcularFrete(10.0);
        System.out.println("Frete expresso: R$" + freteExpresso);
        carrinho.setEstrategiaFrete(new FretePremium());
        double fretePremium = carrinho.calcularFrete(10.0);
        System.out.println("Frete premium: R$" + fretePremium);
    }
}
