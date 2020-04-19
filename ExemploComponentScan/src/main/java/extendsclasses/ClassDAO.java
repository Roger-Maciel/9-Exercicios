package extendsclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    private  ClassJDBC objectJDBC;
}
