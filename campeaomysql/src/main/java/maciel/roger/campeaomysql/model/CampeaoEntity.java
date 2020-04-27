package maciel.roger.campeaomysql.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Component

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

/*
    @author Roger Maciel
    @since 27/04/2020
    @version 1.0
 */
@Entity
@Table(name = "campeao")
public class CampeaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeao")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "precoEA")
    private double income;
}
