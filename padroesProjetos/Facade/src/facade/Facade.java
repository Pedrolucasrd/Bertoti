package facade;

import subsistemas.Subsistema1;
import subsistemas.Subsistema2;
import subsistemas.Subsistema3;

public class Facade {
    private Subsistema1 subsistema1;
    private Subsistema2 subsistema2;
    private Subsistema3 subsistema3;

    public Facade() {
        this.subsistema1 = new Subsistema1();
        this.subsistema2 = new Subsistema2();
        this.subsistema3 = new Subsistema3();
    }

    public void operacaoSimples() {
        subsistema1.operacao1();
        subsistema2.operacao2();
    }

    public void operacaoComplexa() {
        subsistema1.operacao1();
        subsistema2.operacao2();
        subsistema3.operacao3();
    }
}
