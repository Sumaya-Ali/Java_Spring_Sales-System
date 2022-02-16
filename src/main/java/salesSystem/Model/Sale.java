package salesSystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Sale {

	@Id
	private String id;
	private String seller;
	@ManyToOne
	private Client client;
	private String creationDate;
}
