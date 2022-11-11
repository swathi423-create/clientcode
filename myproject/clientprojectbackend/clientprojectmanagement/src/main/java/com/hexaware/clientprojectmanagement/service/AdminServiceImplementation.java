package com.hexaware.clientprojectmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.clientprojectmanagement.dao.ClientDao;
import com.hexaware.clientprojectmanagement.model.Client;

@Component
public class AdminServiceImplementation implements AdminService {
	@Autowired
	private ClientDao admindao;
	
	@Override
	public Client addClient(Client client)
	{
		return admindao.save(client);
		
	}
	
	@Override
	public Client getOneClient(Integer id)
	{
		Optional<Client> client=admindao.findById(id);
		return client.isPresent()?(Client)client.get():null;
	}
	
	@Override
	public Client updateClient(Client client)
	{
		return admindao.save(client);
	}
	
	@Override
	public Client deleteClient(Integer id)
	{
		Client client=getOneClient(id);
		admindao.deleteById(id);
		return client;
		
	}
}
