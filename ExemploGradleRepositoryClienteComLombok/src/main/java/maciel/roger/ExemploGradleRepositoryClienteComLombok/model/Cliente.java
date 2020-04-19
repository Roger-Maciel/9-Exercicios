package maciel.roger.ExemploGradleRepositoryClienteComLombok.model;

import lombok.*;


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
