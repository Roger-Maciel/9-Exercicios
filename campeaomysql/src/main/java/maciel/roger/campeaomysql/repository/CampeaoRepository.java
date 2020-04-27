package maciel.roger.campeaomysql.repository;

import maciel.roger.campeaomysql.model.CampeaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
    @author Roger Maciel
    @since 27/04/2020
    @version 1.0
 */
@Repository
public interface CampeaoRepository extends CrudRepository<CampeaoEntity, Long> {

}
