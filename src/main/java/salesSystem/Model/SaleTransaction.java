package salesSystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class SaleTransaction {

	@Id
	private String id;
	@ManyToOne
	private Sale sale;
	@ManyToOne
	private Product product;
	private int quantity;
	private Float price;
}
