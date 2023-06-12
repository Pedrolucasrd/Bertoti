package frete;

public class FretePremium implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0;
    }
}
