package maciel.roger.ExemploPostConstructorEDestroy;

import maciel.roger.ExemploPostConstructorEDestroy.dao.ClienteDAO;
import maciel.roger.ExemploPostConstructorEDestroy.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@SpringBootApplication
public class ExemploPostConstructorEDestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploPostConstructorEDestroyApplication.class, args);

		ClienteDAO clienteDAO = applicationContext.getBean(ClienteDAO.class);

		clienteDAO.setCliente (new Cliente("Rogão"));

		System.out.println("clienteDAO: " + clienteDAO);
	 	System.out.println("objeto cliente dentro do DAO: " + clienteDAO.getCliente());

	}

}
