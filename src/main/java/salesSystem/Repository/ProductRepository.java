package salesSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import salesSystem.Model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
}
