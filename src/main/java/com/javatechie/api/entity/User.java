package com.javatechie.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
    
	
	

	public static User build(int i, String name2, String email2, String mobile2, String gender2, int age2,
			String nationality2) {
		User u1=new User();
		u1.userId = i;
		u1.name = name2;
		u1.email = email2;
		u1.mobile = mobile2;
		u1.gender = gender2;
		u1.age = age2;
		u1.nationality = nationality2;
		return u1;
	}
}
