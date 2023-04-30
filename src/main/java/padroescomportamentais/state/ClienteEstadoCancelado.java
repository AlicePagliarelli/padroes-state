package padroescomportamentais.state;

public class ClienteEstadoCancelado extends ClienteEstado {

    private ClienteEstadoCancelado() {};
    private static ClienteEstadoCancelado instance = new ClienteEstadoCancelado();
    public static ClienteEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }


}
