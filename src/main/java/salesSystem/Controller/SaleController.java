package salesSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import salesSystem.Model.Sale;
import salesSystem.Service.SaleService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController	
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@RequestMapping("/sales")
	public List<Sale> getAllSales() {
			return saleService.getAllSales() ;			
	}
	
	@RequestMapping("/sales/{id}")
	public Sale getSale(@PathVariable String id) {
			return saleService.getSale(id);			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sales")
	public void addSale(@RequestBody Sale sale) {
			saleService.addSale(sale);			
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/sales/{id}")
	public void updateSale(@RequestBody Sale sale){
			saleService.updateSale(sale);			
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/sales/{id}")
	public void deleteSale(@PathVariable String id) {
			saleService.deleteSale(id);			
	}
	
}
