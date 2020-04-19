package maciel.roger.ExemploPostConstructorEDestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/*
    @author Roger Maciel
    @since 19/04/2020
    @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Cliente {
    private String nome;

    public Cliente() {
        System.out.println("Classe cliente");
    }
}
