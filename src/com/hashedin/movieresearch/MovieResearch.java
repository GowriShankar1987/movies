package com.hashedin.movieresearch;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.hashedin.data.User;
import com.hashedin.service.UserService;


public class MovieResearch {
	
	private final JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_MODEL_QUERY = "insert into models (make, modelname, year, maxPrice, minPrice) "
	+ "values (?, ?, ?, ?, ?)";
	
	public static void main(String args[]) throws IOException{
		
		File userFile = new File("/home/gowri/Downloads/assignment_sandeep/ml-100k/u.user");
		File movieFile = new File("/home/gowri/Downloads/assignment_sandeep/ml-100k/u.item");
		File ratingFile = new File("/home/gowri/Downloads/assignment_sandeep/ml-100k/u.data");
		File genreFile = new File("/home/gowri/Downloads/assignment_sandeep/ml-100k/u.genre");

		UserService uService = new UserService();
		List<User> users = uService.readAndCreateUserList(userFile);
		uService.printUsers(users);
		
	}
}