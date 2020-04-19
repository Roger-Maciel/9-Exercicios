package maciel.roger.ExemploEscopo;

import maciel.roger.ExemploEscopo.dao.ClasseDAO;
import maciel.roger.ExemploEscopo.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ExemploEscopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploEscopoApplication.class, args);

		ClasseDAO classeDAO1 = applicationContext.getBean(ClasseDAO.class);
		ClasseDAO classeDAO2 = applicationContext.getBean(ClasseDAO.class);

		System.out.println("classeDAO1: " + classeDAO1);
		System.out.println("objetoJDBC1: " + classeDAO1.getObjectJDBC());

		System.out.println("classeDAO2: " + classeDAO2);
		System.out.println("objetoJDBC2: " + classeDAO2.getObjectJDBC());

		Cliente cliente = new Cliente();
		System.out.println(cliente);

		Cliente cliente1 = new Cliente();
		System.out.println(cliente1);
	}

}
