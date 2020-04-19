package maciel.roger.ExemploDeInjecaoDeDependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@SpringBootApplication
public class ExemploDeInjecaoDeDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploDeInjecaoDeDependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}
