package com.rodrigo.desafiocrud.controllers;

import com.rodrigo.desafiocrud.dto.ClientDTO;
import com.rodrigo.desafiocrud.entities.Client;
import com.rodrigo.desafiocrud.repositories.ClientRepository;
import com.rodrigo.desafiocrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
}
