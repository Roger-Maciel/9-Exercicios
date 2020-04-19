package maciel.roger.ExemploGradleRepositoryClienteComLombok.model;

import lombok.*;

/*
    @author Roger Maciel
    @since 16/04/2020
    @version 1.0
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Cliente {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String sobrenome;

    @Getter @Setter
    private String email;
}
