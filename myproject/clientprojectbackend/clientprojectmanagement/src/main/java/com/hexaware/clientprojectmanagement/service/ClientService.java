package com.hexaware.clientprojectmanagement.service;

import java.util.List;

import com.hexaware.clientprojectmanagement.model.Client;
import com.hexaware.clientprojectmanagement.model.Project;

public interface ClientService {
	
	public Project createProject(Project project);
	public Project updateProject(Project project);
	public boolean deleteProject(Integer project_code);
	public Client getProfile(Integer id);
	public Client login(String emailId, String password);
	public List<Project> getProjects();

}
