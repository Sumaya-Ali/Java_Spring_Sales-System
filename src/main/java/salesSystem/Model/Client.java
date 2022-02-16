package salesSystem.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Client {

	@Id
	private String id;
	private String name;
	private String lastName;
	private String mobile;
}
