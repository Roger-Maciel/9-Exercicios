package maciel.roger.ExemploGradleRepositoryClienteComLombok.controller;

import maciel.roger.ExemploGradleRepositoryClienteComLombok.model.Cliente;
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
        cliente.setSobrenome("Maciel");
        cliente.setEmail("rogermd39@gmail.com");
        return cliente;
    }
    @GetMapping("/listaclientes")
    public ArrayList<Cliente> getListClient() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rogão");
        cliente1.setSobrenome("Maciel");
        cliente1.setEmail("rogermd39@gmail.com");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jao");
        cliente2.setSobrenome("Lemonsky");
        cliente2.setEmail("jaaaaaoo@gmail.com");

        ArrayList <Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        return clientes;
    }

}
