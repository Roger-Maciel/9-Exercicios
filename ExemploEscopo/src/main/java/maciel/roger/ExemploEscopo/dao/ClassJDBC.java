package maciel.roger.ExemploEscopo.dao;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC!");
    }
}
