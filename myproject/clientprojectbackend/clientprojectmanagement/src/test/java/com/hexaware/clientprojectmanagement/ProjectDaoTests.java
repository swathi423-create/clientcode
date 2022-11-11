package com.hexaware.clientprojectmanagement;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.hexaware.clientprojectmanagement.dao.ProjectDao;
import com.hexaware.clientprojectmanagement.model.Client;
import com.hexaware.clientprojectmanagement.model.Project;



@DataJpaTest
public class ProjectDaoTests {
	
	@Autowired
	private ProjectDao projectdao;
	@Test
	public void saveProjectTest() {
		Project project = new Project();
		project.setTitle("pwc");
		project.setType("support");
	    project.setDescription("pwc ");
	    projectdao.save(project);
		Assertions.assertThat(project.getCode()).isGreaterThan(0);
	}
	@Test
	public void getProjectTest() {
		Project project = projectdao.findById(1).get();
		Assertions.assertThat(project.getCode()).isEqualTo(1);	}
	@Test
	public void updateProjectTest() {
		Project project = projectdao.findById(1).get ();
		project.setDescription("pricewatercoopers");
		Project projectupdated  = projectdao.save(project);
		Assertions.assertThat(projectupdated.getDescription()).isEqualTo("pricewatercoopers");	}
	
	
	
	
}
