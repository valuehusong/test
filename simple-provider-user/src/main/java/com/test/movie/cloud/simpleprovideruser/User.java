package com.test.movie.cloud.simpleprovideruser;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class User implements Serializable{
    
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private  Integer id;
	@Column
	private String  username;
	@Column
	private String name;
	@Column
	private  int  age;
	@Column
	private  BigDecimal blance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getBlance() {
		return blance;
	}
	public void setBlance(BigDecimal blance) {
		this.blance = blance;
	}
}
