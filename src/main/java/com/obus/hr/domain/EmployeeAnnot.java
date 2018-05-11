package com.obus.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeAnnot{

	@Id
	@Column(name="id", unique=true, nullable=false)
	private int id;
	
	@Column(name="first_name", unique=true, nullable=false)
	private String firstName;
	
	@Column(name="last_name", unique=true, nullable=false)
	private String lastName;
	
	@Column(name="salary", unique=true, nullable=false)
	private int salary;
	
	public EmployeeAnnot(){}
	public EmployeeAnnot(String fname, String lname, int salary){
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
