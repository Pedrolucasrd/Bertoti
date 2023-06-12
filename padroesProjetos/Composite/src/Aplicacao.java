import components.Component;
import components.Elemento;
import components.Grupo;

public class Aplicacao {
    public static void main(String[] args) {
        Component raiz = new Grupo("Raiz");
        Component grupo1 = new Grupo("components.Grupo 1");
        Component grupo2 = new Grupo("components.Grupo 2");
        Component elemento1 = new Elemento("components.Elemento 1");
        Component elemento2 = new Elemento("components.Elemento 2");
        Component elemento3 = new Elemento("components.Elemento 3");

        raiz.adicionar(grupo1);
        raiz.adicionar(grupo2);
        grupo1.adicionar(elemento1);
        grupo1.adicionar(elemento2);
        grupo2.adicionar(elemento3);

        raiz.exibir(0);
    }
}
