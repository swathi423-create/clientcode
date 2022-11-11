package com.hexaware.clientprojectmanagement.service;

import com.hexaware.clientprojectmanagement.model.Client;

public interface AdminService {
	
	public Client addClient(Client client);
	public Client getOneClient(Integer id);
	public Client updateClient(Client client);
	public Client deleteClient(Integer id);

	

}
