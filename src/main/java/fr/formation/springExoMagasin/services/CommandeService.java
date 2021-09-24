package fr.formation.springExoMagasin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.springExoMagasin.models.Commande;
import fr.formation.springExoMagasin.repositories.CommandeRepository;

@Service
public class CommandeService {

	private CommandeRepository commandeRepository;

	public CommandeService(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
	}

	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	public Commande findById(Long id) {
		return commandeRepository.findById(id).orElseThrow();
	}

	public Commande save(Commande commande) {
		return commandeRepository.save(commande);
	}

	public void deleteById(Long id) {
		commandeRepository.deleteById(id);
	}
	
	
}
