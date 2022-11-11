package com.hexaware.clientprojectmanagement.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

//import antlr.collections.List;

@Entity
	@Table(name="client")
	public class Client {
		@Id
		@GeneratedValue
		@Column(name="Client_id",nullable=false)
		private Integer id;
		@Column(name="Client_name",nullable=false)
		private String name;
		@Column(name="Client_email",nullable=false)
		private String email;
		@Column(name="Client_password",nullable=false)
		private String password;
		
		@OneToMany (targetEntity = Project.class,cascade = CascadeType.ALL)
		@JoinColumn(name= "cp_fk",referencedColumnName= "Client_id")
		private List<Project> projects;
		
		
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Client orElseThrow(Object object) {
			// TODO Auto-generated method stub
			return null;
		}
		
		

}
