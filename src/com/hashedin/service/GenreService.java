package com.hashedin.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hashedin.data.Genre;


public class GenreService 
{

		private static final String INSERT_GENRE_QUERY = "insert into user (id, genre) "
			+ "values (?, ?)";
		public List<Genre> createRatingData(File file) throws FileNotFoundException
		{
			List<Genre> genreData= new ArrayList<Genre>();
			Scanner scanner = new Scanner(new FileInputStream(file));
		    try {
		      while (scanner.hasNextLine())
		      {
		    	  genreData.add(this.createGenre(scanner.nextLine()));
		      }
		    }
		    finally{
		      scanner.close();
		    }
			return genreData;
		}
		
		public Genre createGenre(String s)
		{
			Genre genre = new Genre();
			String[] splitLine = s.split("\\|");
			genre.setGenre(splitLine[0]);
			genre.setGenreId(Integer.parseInt(splitLine[1]));
			return genre;
		}
		
		public  void insert(List<Genre> genres,JdbcTemplate jdbcTemplate ){
			for(Genre r: genres){
				jdbcTemplate.update(INSERT_GENRE_QUERY, new Object[] {r.getGenreId(),r.getGenre()});
			}
		}
}
