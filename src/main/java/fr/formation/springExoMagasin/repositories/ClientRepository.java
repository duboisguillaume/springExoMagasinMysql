package fr.formation.springExoMagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.springExoMagasin.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
