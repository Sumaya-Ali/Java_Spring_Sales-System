package salesSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import salesSystem.Model.SaleTransaction;
import salesSystem.Repository.SaleTransactionRepository;

@Service
public class SaleTransactionService {
		
	@Autowired		
	private SaleTransactionRepository saleTransactionRepository;
	
	public List<SaleTransaction> getAllSaleTransactions(String id){	
		ArrayList<SaleTransaction> transactions = new ArrayList<>();
		saleTransactionRepository.findBySaleId(id).forEach(transactions::add);
		return transactions;
	}
	
	public SaleTransaction getSaleTransaction(String id) {
		Optional<SaleTransaction> transaction = saleTransactionRepository.findById(id);
		return  transaction.isPresent()?transaction.get():null;
	}
	
	public void addSaleTransaction(SaleTransaction transaction) {
		saleTransactionRepository.save(transaction);
	}

	public void updateSaleTransaction(SaleTransaction transaction) {
		saleTransactionRepository.save(transaction);
		
	}

	public void deleteSaleTransaction(String id) {
		saleTransactionRepository.deleteById(id);
		
	}
}
