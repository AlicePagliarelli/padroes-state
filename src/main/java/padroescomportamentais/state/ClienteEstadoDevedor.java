package padroescomportamentais.state;

public class ClienteEstadoDevedor extends ClienteEstado {

    private ClienteEstadoDevedor() {};
    private static ClienteEstadoDevedor instance = new ClienteEstadoDevedor();
    public static ClienteEstadoDevedor getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Devedor";
    }

    public boolean bloquear(Cliente cliente) {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        return true;
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

