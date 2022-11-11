package com.hexaware.clientprojectmanagement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.hexaware.clientprojectmanagement.dao.ClientDao;
import com.hexaware.clientprojectmanagement.model.Client;

import antlr.collections.List;



@DataJpaTest

public class ClientDaoTests {
	
	@Autowired
	private ClientDao clientdao;
	@Test
	public void saveClientTest() {
		Client client = new Client();
		client.setName("naga");
	    client.setEmail("na@gmail.com");
	    client.setPassword("naga@123 ");
	    clientdao.save(client);
		Assertions.assertThat(client.getId()).isGreaterThan(0);
	}
	@Test
	public void getClientTest() {
		Client client = clientdao.findById(1).get();
		Assertions.assertThat(client.getId()).isEqualTo(1);	}
	@Test
	public void updateClientTest() {
		Client client = clientdao.findById(1).get ();
		client.setEmail("nag@gmail.com");
		Client clientupdated  = clientdao.save(client);
		Assertions.assertThat(clientupdated.getEmail()).isEqualTo("nag@gmail.com");	}
		
	}
   
	
	
	

