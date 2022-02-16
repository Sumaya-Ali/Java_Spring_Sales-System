package salesSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import salesSystem.Model.Client;
import salesSystem.Service.ClientService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController	
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/clients")
	public List<Client> getAllClients() {
		return clientService.getAllClients();			
	}
	
	@RequestMapping("/clients/{id}")
	public Client getClient(@PathVariable String id) {
			return clientService.getClient(id);			
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/clients")
	public void addClient(@RequestBody Client client) {			
			clientService.addClient(client);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/clients/{id}")
	public void updateClient(@RequestBody Client client){
			clientService.updateClient(client);			
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/clients/{id}")
	public void deleteClient(@PathVariable String id) {
			clientService.deleteClient(id);				
	}
	
}
