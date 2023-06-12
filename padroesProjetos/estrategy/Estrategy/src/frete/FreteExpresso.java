package frete;

public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
