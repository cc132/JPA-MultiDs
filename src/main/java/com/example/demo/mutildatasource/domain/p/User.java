package com.example.demo.mutildatasource.domain.p;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_user")
@Data
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private String name;

    
    private Integer age;
    
    public User(String name,Integer age) {
    	this.name = name;
    	this.age = age;
    }
    public User() {
    	
    }
}
