package observers;

public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu a seguinte notificação: " + mensagem);
    }
}
