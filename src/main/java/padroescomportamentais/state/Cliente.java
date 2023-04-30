package padroescomportamentais.state;

public class Cliente {

    private String nome;
    private ClienteEstado estado;

    public Cliente() {
        this.estado = ClienteEstadoCadastrado.getInstance();
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }

    public boolean cadastrar() {
        return estado.cadastrar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean dever() {
        return estado.dever(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteEstado getEstado() {
        return estado;
    }
}
