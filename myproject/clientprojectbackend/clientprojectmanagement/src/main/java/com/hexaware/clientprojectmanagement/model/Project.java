package com.hexaware.clientprojectmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="project")
	public class Project {
		@Id
		@GeneratedValue
		
		@Column(name="Project_code",nullable=false)
		private Integer code;
//		@Column(name="Client_id", nullable = false)
//		private Integer id;
		@Column(name="Project_title",nullable=false)
		private String title;
		@Column(name="Project_type",nullable=false)
		private String type;
		@Column(name="Project_description",nullable=false)
		private String description;
		
		public Integer getCode() {
			return code;
		}
		public void setCode(Integer code) {
			this.code = code;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		

}