package com.hashedin.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hashedin.carresearch.Model;
import com.hashedin.data.Movies;

public class MovieService 
{
	private static final String INSERT_MOVIE_QUERY = "insert into movies (make, modelname, year, maxPrice, minPrice) "
			+ "values (?, ?, ?, ?, ?)";
	
	public List<Movies> createMoviesData(File file) throws FileNotFoundException
	{
		List<Movies> ratingsData= new ArrayList<Movies>();
		Scanner scanner = new Scanner(new FileInputStream(file));
	    try {
	      while (scanner.hasNextLine())
	      {
	    	  ratingsData.add(this.createMovieData(scanner.nextLine()));
	      }
	    }
	    finally{
	      scanner.close();
	    }
		return ratingsData;
	}
	
	public Movies createMovieData(String s)
	{
		Movies movie = new Movies();
		String[] splitLine = s.split("\\|");
		movie.setMovieId(Integer.parseInt(splitLine[0]));
		movie.setMovieTitle(splitLine[1]);
		movie.setReleaseDate(splitLine[2]);
		movie.setVideoReleaseDate(splitLine[3]);
		movie.setiMDbURL(splitLine[4]);
		movie.setUnknown(Boolean.parseBoolean(splitLine[5]));
		movie.setAction(Boolean.parseBoolean(splitLine[6]));
		movie.setAdventure(Boolean.parseBoolean(splitLine[7]));
		movie.setAnimation(Boolean.parseBoolean(splitLine[8]));
		movie.setChildren(Boolean.parseBoolean(splitLine[9]));
		movie.setComedy(Boolean.parseBoolean(splitLine[10]));
		movie.setCrime(Boolean.parseBoolean(splitLine[11]));
		movie.setDocumentary(Boolean.parseBoolean(splitLine[12]));
		movie.setDrama(Boolean.parseBoolean(splitLine[13]));
		movie.setFantasy(Boolean.parseBoolean(splitLine[14]));
		movie.setFilmNoir(Boolean.parseBoolean(splitLine[15]));
		movie.setHorror(Boolean.parseBoolean(splitLine[16]));
		movie.setMusical(Boolean.parseBoolean(splitLine[17]));
		movie.setMystery(Boolean.parseBoolean(splitLine[18]));
		movie.setRomance(Boolean.parseBoolean(splitLine[19]));
		movie.setSciFi(Boolean.parseBoolean(splitLine[20]));
		movie.setThriller(Boolean.parseBoolean(splitLine[21]));
		movie.setWar(Boolean.parseBoolean(splitLine[22]));
		movie.setWestern(Boolean.parseBoolean(splitLine[23]));
		
		return movie;
	}
	
	public  void insert(List<Movies> movies,JdbcTemplate jdbcTemplate ){
		for(Movies m: movies){
			jdbcTemplate.update(INSERT_MOVIE_QUERY, new Object[] {m.getMovieId()});
		}
	}

}
