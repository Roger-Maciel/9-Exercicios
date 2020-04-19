package maciel.roger.ExemploDeInjecaoDeDependencia;

import maciel.roger.ExemploDeInjecaoDeDependencia.Interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
public class Pet {

    @Autowired
    private IAnimal iAnimal;


    public void execute() {
        iAnimal.comunicar();
    }

}
