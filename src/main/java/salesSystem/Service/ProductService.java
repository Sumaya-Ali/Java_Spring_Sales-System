package salesSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import salesSystem.Model.Product;
import salesSystem.Repository.ProductRepository;

@Service
public class ProductService {
		
	@Autowired		
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		ArrayList<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	public Product getProduct(String id) {
		Optional<Product> product = productRepository.findById(id);
		return  product.isPresent()?product.get():null;
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
		
	}

	public void deleteProduct(String id) {
		productRepository.deleteById(id);
		
	}
}
