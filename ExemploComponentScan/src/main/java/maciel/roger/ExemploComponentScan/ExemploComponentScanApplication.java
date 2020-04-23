package maciel.roger.ExemploComponentScan;

import extendsclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@SpringBootApplication
@ComponentScan("extendsclasses")
public class ExemploComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploComponentScanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC Cliente dentro do DAO: " + objectDAO1.getObjectJDBC());

	}

}
