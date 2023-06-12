import observers.Usuario;
import subjects.Subject;

public class Aplicacao {
    public static void main(String[] args) {
        Subject sistemaNotificacao = new Subject();

        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

        sistemaNotificacao.adicionarObservador(usuario1);
        sistemaNotificacao.adicionarObservador(usuario2);

        sistemaNotificacao.notificarObservadores("Nova atualização disponível!");

        sistemaNotificacao.removerObservador(usuario2);

        sistemaNotificacao.notificarObservadores("Outra atualização importante!");
    }
}
