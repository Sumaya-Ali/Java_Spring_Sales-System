package salesSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import salesSystem.Model.Client;

public interface ClientRepository extends CrudRepository<Client, String> {

}
