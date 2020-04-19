package maciel.roger.ExemploPostConstructorEDestroy.dao;

import lombok.Getter;
import lombok.Setter;
import maciel.roger.ExemploPostConstructorEDestroy.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
@Getter @Setter
public class ClienteDAO {

    @Autowired
    private Cliente cliente;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto criado com sucesso!");
    }

    @PreDestroy
    public void preDestruct() {
        System.out.println("Objeto excluido com sucesso!");
    }
}
