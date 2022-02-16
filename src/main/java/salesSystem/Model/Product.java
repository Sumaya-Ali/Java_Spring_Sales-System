package salesSystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private String id;
	private String name;
	private String description;
	private String category;
	private String creationDate;
}
