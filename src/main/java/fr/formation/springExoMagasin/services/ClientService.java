package fr.formation.springExoMagasin.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import fr.formation.springExoMagasin.models.Client;
import fr.formation.springExoMagasin.models.Commande;
import fr.formation.springExoMagasin.repositories.ClientRepository;
import fr.formation.springExoMagasin.repositories.CommandeRepository;

@Service
public class ClientService {

	private ClientRepository clientRepository;
	private CommandeRepository commandeRepository;

	public ClientService(ClientRepository clientRepository, CommandeRepository commandeRepository) {
		this.clientRepository = clientRepository;
		this.commandeRepository = commandeRepository;
	}

	public Client save(Client client) {
		return clientRepository.save(client);
	}

	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	public Client findById(Long id) {
		return clientRepository.findById(id).orElseThrow();
	}

	public void deleteById(Long id) {
		clientRepository.deleteById(id);
	}

	public List<Commande> findCommandesByClientId(Long id) {
		return commandeRepository.findByClientId(id);
	};
	
	
	
}
