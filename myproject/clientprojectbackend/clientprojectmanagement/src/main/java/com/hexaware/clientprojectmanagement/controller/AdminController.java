package com.hexaware.clientprojectmanagement.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.clientprojectmanagement.model.Client;
import com.hexaware.clientprojectmanagement.service.AdminService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class AdminController {
	@Autowired
	private AdminService adminservice;
	private static Logger logger = Logger.getLogger("AdminController.class");
	
	@PostMapping("/add-client")
	public Client addClient(@RequestBody Client client) {
		System.out.println("in");
		adminservice.addClient(client);
		logger.info("add client details" + client );
		return client;
	}
	
	@GetMapping("get-client/{Client_id}")
	public Client getClient(@PathVariable("Client_id")Integer clientId) {
		Client client=adminservice.getOneClient(clientId);
		logger.info("get client details" + client );
		return client;
	}
	
	
	
	@PutMapping
	public Client updateClient(@RequestBody Client client) {
		adminservice.updateClient(client);
		return client;
	}
	
	@DeleteMapping("delete-client/{Client_id}")
	public Client deleteClient(@PathVariable("Client_id")Integer clientId) {
		return adminservice.deleteClient(clientId);
	}
}

