package extendsclasses;

import org.springframework.stereotype.Component;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC!");
    }
}
