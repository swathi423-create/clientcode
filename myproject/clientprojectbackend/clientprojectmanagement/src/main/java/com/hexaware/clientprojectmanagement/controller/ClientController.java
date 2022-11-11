package com.hexaware.clientprojectmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.clientprojectmanagement.model.Client;
import com.hexaware.clientprojectmanagement.model.Project;
import com.hexaware.clientprojectmanagement.service.ClientService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class ClientController {
	
		@Autowired
		private ClientService clientService;
		
		@PostMapping("/add-project")
		public Project createProject(@RequestBody Project project) {
			return clientService.createProject(project);
		}
		
		@GetMapping("/get-project/{Project_code}")
		public List<Project> getProject () {
			return clientService.getProjects();
		}
		
		@GetMapping("/get-projects")
		public List<Project> getProjects () {
			return clientService.getProjects();
		}
		
		@PutMapping("/update-project")
		public Project updateProject(@RequestBody Project project) {
			return clientService.updateProject(project);
		}
		
		@DeleteMapping("{project_code}")
		public boolean deleteProject(@PathVariable("project_code")Integer project_code) {
			clientService.deleteProject(project_code);
			return true;
		}
		
		
		
		@PostMapping("/login")
		public Client login(@RequestParam("userid")String userId,@RequestParam("password")String password) {
			System.out.println("loginpagee");
			return clientService.login(userId, password);	
		}
		
//		@PostMapping("/login")
//		public Client login(@RequestBody Login login) {
//			return clientService.login(Login login);	
//		}
//		
		
		
		
	}



