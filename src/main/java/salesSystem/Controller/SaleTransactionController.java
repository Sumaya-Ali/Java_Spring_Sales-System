package salesSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import salesSystem.Model.SaleTransaction;
import salesSystem.Service.SaleTransactionService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController	
public class SaleTransactionController {

	@Autowired
	private SaleTransactionService saleTransactionService;
	
	@RequestMapping("/sales/{id}/transactions")
	public List<SaleTransaction> getAllSaleTransactions(@PathVariable String id) {
			return saleTransactionService.getAllSaleTransactions(id) ;			
	}
	
	@RequestMapping("/sales/{saleId}/transactions/{id}")
	public SaleTransaction getSaleTransaction(@PathVariable String id) {
			return saleTransactionService.getSaleTransaction(id);			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sales/{id}/transactions")
	public void addSaleTransaction(@RequestBody SaleTransaction transaction) {
			saleTransactionService.addSaleTransaction(transaction);			
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/sales/{saleId}/transactions/{id}")
	public void updateSaleTransaction(@RequestBody SaleTransaction transaction){
			saleTransactionService.updateSaleTransaction(transaction);			
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/sales/{saleId}/transactions/{id}")
	public void deleteSaleTransaction(@PathVariable String id) {
			saleTransactionService.deleteSaleTransaction(id);			
	}
	
}
