package salesSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import salesSystem.Model.Client;
import salesSystem.Repository.ClientRepository;

@Service
public class ClientService {
		
	@Autowired		
	private ClientRepository clientRepository;
	
	public List<Client> getAllClients(){
		ArrayList<Client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(clients::add);
		return clients;
	}
	
	public Client getClient(String id) {
		Optional<Client> client = clientRepository.findById(id);
		return  client.isPresent()?client.get():null;
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}

	public void updateClient(Client client) {
		clientRepository.save(client);
		
	}

	public void deleteClient(String id) {
		clientRepository.deleteById(id);
		
	}
}
