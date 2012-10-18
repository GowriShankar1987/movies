package com.hashedin.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hashedin.data.User;

public class UserService 
{
	private static final String INSERT_USER_QUERY = "insert into user (id, age, gender, occupation, zipcode) "
			+ "values (?, ?, ?, ?, ?)";
	public List<User> readAndCreateUserList(File fFileName) throws FileNotFoundException
	{
		List<User> users = new ArrayList<User>();
		Scanner scanner = new Scanner(new FileInputStream(fFileName));
	    try {
	      while (scanner.hasNextLine())
	      {
	    	  users.add(this.CreateUser(scanner.nextLine()));
	      }
	    }
	    finally{
	      scanner.close();
	    }
		return users;
	}
	
	public User CreateUser(String s)
	{
		User user = new User();
		String[] splitLine = s.split("\\|");
		user.setUserId(Integer.parseInt(splitLine[0]));
		user.setAge(Double.parseDouble(splitLine[1]));
		user.setGender(splitLine[2]);
		user.setOccupation(splitLine[3]);
		user.setZipCode(splitLine[4]);
		return user;
	}
	
	public void printUsers(List<User> users)
	{
		for(User user : users)
		{
			System.out.println(user);
		}
	}
	
	public  void insert(List<User> users,JdbcTemplate jdbcTemplate ){
		for(User u: users){
			jdbcTemplate.update(INSERT_USER_QUERY, new Object[] {u.getUserId(),u.getAge(),u.getGender(),u.getOccupation(),u.getZipCode()});
		}
	}

}
