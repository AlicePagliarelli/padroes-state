package padroescomportamentais.state;

public class ClienteEstadoBloqueado extends ClienteEstado {

    private ClienteEstadoBloqueado() {};
    private static ClienteEstadoBloqueado instance = new ClienteEstadoBloqueado();
    public static ClienteEstadoBloqueado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Bloqueado";
    }

    public boolean cadastrar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        return true;
    }

    public boolean cancelar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        return true;
    }
}

