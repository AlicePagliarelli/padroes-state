package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
    }

    // Cliente Cadastrado

    @Test
    public void naoDeveCadastrarClienteCadastrado() {
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertFalse(cliente.cadastrar());
    }


    @Test
    public void deveBloquearClienteCadastrado() {
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertTrue(cliente.bloquear());
        assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveCancelarClienteCadastrado() {
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertTrue(cliente.cancelar());
        assertEquals(ClienteEstadoCancelado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveDeverClienteCadastrado() {
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        assertTrue(cliente.dever());
        assertEquals(ClienteEstadoDevedor.getInstance(), cliente.getEstado());
    }

    // Cliente bloqueado

    @Test
    public void deveCadastrarClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertTrue(cliente.cadastrar());
        assertEquals(ClienteEstadoCadastrado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveCancelarClienteBloqueado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertTrue(cliente.cancelar());
        assertEquals(ClienteEstadoCancelado.getInstance(), cliente.getEstado());
    }

    public void naoDeveDeverClienteBloquado() {
        cliente.setEstado(ClienteEstadoBloqueado.getInstance());
        assertFalse(cliente.dever());
    }


    // Cliente cancelado

    @Test
    public void naoDeveCadastrarClienteCancelado() {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertFalse(cliente.cadastrar());
    }

    @Test
    public void naoDeveBloquearClienteCancelado() {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertFalse(cliente.bloquear());
    }

    @Test
    public void naoDeveDeverClienteCancelado() {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        assertFalse(cliente.dever());
    }

    // Cliente devedor

    @Test
    public void deveCadastrarClienteDevedor() {
        cliente.setEstado(ClienteEstadoDevedor.getInstance());
        assertTrue(cliente.cadastrar());
        assertEquals(ClienteEstadoCadastrado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveBloqueadoClienteDevedor() {
        cliente.setEstado(ClienteEstadoDevedor.getInstance());
        assertTrue(cliente.bloquear());
        assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

    @Test
    public void deveCanceladoClienteDevedor() {
        cliente.setEstado(ClienteEstadoDevedor.getInstance());
        assertTrue(cliente.bloquear());
        assertEquals(ClienteEstadoBloqueado.getInstance(), cliente.getEstado());
    }

}