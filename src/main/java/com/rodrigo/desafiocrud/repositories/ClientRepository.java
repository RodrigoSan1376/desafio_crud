package com.rodrigo.desafiocrud.repositories;

import com.rodrigo.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
