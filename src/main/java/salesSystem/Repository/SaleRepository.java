package salesSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import salesSystem.Model.Sale;

public interface SaleRepository extends CrudRepository<Sale, String> {

}
