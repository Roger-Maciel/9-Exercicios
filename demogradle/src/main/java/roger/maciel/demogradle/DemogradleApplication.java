package roger.maciel.demogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import roger.maciel.demogradle.model.ExemploGradleClass;

@SpringBootApplication
public class DemogradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemogradleApplication.class, args);

		ExemploGradleClass gradleClass = new ExemploGradleClass();

		gradleClass.setValor1(9);
		gradleClass.setValor2(30);

		System.out.println("\n"+gradleClass.verificarCalculoExemplo());


	}

}
