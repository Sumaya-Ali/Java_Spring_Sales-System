package salesSystem.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import salesSystem.Model.SaleTransaction;

public interface SaleTransactionRepository extends CrudRepository<SaleTransaction, String> {
	public List<SaleTransaction> findBySaleId(String saleId);
}
