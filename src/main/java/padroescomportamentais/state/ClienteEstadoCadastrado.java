package padroescomportamentais.state;

public class ClienteEstadoCadastrado extends ClienteEstado {

    private ClienteEstadoCadastrado() {};
    private static ClienteEstadoCadastrado instance = new ClienteEstadoCadastrado();
    public static ClienteEstadoCadastrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cadastrado";
    }


    public boolean bloquear(Cliente cliente) {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        return true;
    }

    public boolean cancelar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        return true;
    }

    public boolean dever(Cliente cliente) {
        cliente.setEstado(ClienteEstadoDevedor.getInstance());
        return true;
    }

}
