package com.amald.opinionsbackend.controller;

import com.amald.opinionsbackend.entities.Client;
import com.amald.opinionsbackend.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Client client) {
        this.clientService.create(client);
    }
}