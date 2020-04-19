package maciel.roger.ExemploEscopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClasseDAO {

    @Autowired
    private ClassJDBC objectJDBC;
}
