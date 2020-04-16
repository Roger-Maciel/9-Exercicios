package maciel.roger.ExemploGradleRepositoriCliente.Controller;

import maciel.roger.ExemploGradleRepositoriCliente.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Rogão");
        return cliente;
    }
    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rogão");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Brabo");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);


        return clientes;
    }
}
