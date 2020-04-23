package maciel.roger.exemploh2mysql.repository;


import maciel.roger.exemploh2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
