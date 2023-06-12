package frete;

public class FreteNormal implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2.5;
    }
}

