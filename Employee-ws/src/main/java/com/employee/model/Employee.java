package com.employee.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Entity
@Table(name = "Employee")
public class Employee {
	private @Id @GeneratedValue Long id;
	
	@Column
	private String name;
	
	@Column
	private String dept;
	
	@Column
	@Min(value = 23, message = "Value should be greater than equal to 23" )
	@Max(value = 65, message = "Value should be greater than equal to 65")
	private long age;
	
	@Column
	private String email;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public long getAge() {
		return age;
	}



	public void setAge(long age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	

	public Employee(Long id, String name, String dept,
			@Min(value = 23, message = "Value should be greater than equal to 23") @Max(value = 65, message = "Value should be greater than equal to 65") long age,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.email = email;
	}
	
	



	public Employee() {
		super();
	}



	@Override
	public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept+"]";
	}	
}
