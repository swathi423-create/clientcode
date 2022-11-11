package com.hexaware.clientprojectmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hexaware.clientprojectmanagement.model.Client;
//@CrossOrigin(origins ="http://localhost:4200")
public interface ClientDao  extends JpaRepository<Client,Integer> {
		
		@Query("FROM Client WHERE email=:userId AND password=:password")
		List<Client> login(@Param("userId")String userId,@Param("password")String password);
	}

//@Query("FROM Client WHERE email=:userId AND password=:password")
//List<Client> login(Login login);
//
//

