package com.hashedin.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hashedin.data.Ratings;
import com.hashedin.data.Ratings;

public class RatingService 
{
	private static final String INSERT_RATING_QUERY = "insert into ratings (userid, itemid, rating,timestamp) "
			+ "values (?, ?, ?, ?)";
	
	public List<Ratings> createRatingData(File file) throws FileNotFoundException
	{
		List<Ratings> ratingsData= new ArrayList<Ratings>();
		Scanner scanner = new Scanner(new FileInputStream(file));
	    try {
	      while (scanner.hasNextLine())
	      {
	    	  ratingsData.add(this.createRating(scanner.nextLine()));
	      }
	    }
	    finally{
	      scanner.close();
	    }
		return ratingsData;
	}
	
	public Ratings createRating(String s)
	{
		Ratings rating = new Ratings();
		String[] splitLine = s.split("\\|");
		rating.setUserId(Integer.parseInt(splitLine[0]));
		rating.setItemId(Integer.parseInt(splitLine[1]));
		rating.setRating(Integer.parseInt(splitLine[2]));
		java.sql.Timestamp ts = java.sql.Timestamp.valueOf(splitLine[3]);
		rating.setTimeStamp(ts);
		
		return rating;
	}

	public  void insert(List<Ratings> ratingList,JdbcTemplate jdbcTemplate ){
		for(Ratings r: ratingList){
			jdbcTemplate.update(INSERT_RATING_QUERY, new Object[] {r.getUserId(),r.getItemId(),r.getRating(),r.getTimeStamp()});
		}
	}
}
