package padroescomportamentais.state;

public abstract class ClienteEstado {

    public abstract String getEstado();

    public boolean cadastrar(Cliente cliente) {
        return false;
    }

    public boolean dever(Cliente cliente) {
        return false;
    }

    public boolean bloquear(Cliente cliente) {
        return false;
    }

    public boolean cancelar(Cliente cliente) {
        return false;
    }

}
