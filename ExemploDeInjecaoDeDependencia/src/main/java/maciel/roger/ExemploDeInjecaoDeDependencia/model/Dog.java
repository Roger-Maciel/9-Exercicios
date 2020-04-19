package maciel.roger.ExemploDeInjecaoDeDependencia.model;

import maciel.roger.ExemploDeInjecaoDeDependencia.Interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {
    @Override
    public void comunicar() {
        System.out.println("Auuuu auuuu");
    }
}
