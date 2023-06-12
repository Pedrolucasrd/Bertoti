import frete.FreteStrategy;

public class CarrinhoCompras {
    private FreteStrategy estrategiaFrete;

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete(double peso) {
        if (estrategiaFrete != null) {
            return estrategiaFrete.calcularFrete(peso);
        } else {
            throw new RuntimeException("Estratégia de frete não definida.");
        }
    }
}
