package salesSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import salesSystem.Model.Sale;
import salesSystem.Repository.SaleRepository;

@Service
public class SaleService {
		
	@Autowired		
	private SaleRepository saleRepository;
	
	public List<Sale> getAllSales(){
		ArrayList<Sale> sales = new ArrayList<>();
		saleRepository.findAll().forEach(sales::add);
		return sales;
	}
	
	public Sale getSale(String id) {
		Optional<Sale> sale = saleRepository.findById(id);
		return  sale.isPresent()?sale.get():null;
	}
	
	public void addSale(Sale sale) {
		saleRepository.save(sale);
	}

	public void updateSale(Sale sale) {
		saleRepository.save(sale);
		
	}

	public void deleteSale(String id) {
		saleRepository.deleteById(id);
		
	}
}
