package com.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.domain.Movie;

//Fill your code here
@Component
public class MovieDAO {
    
    public static List<Movie> movieList = new ArrayList<Movie>();
    static {
		movieList.add(new Movie(1L, "Avengers: Endgame","Sci-fi","Chris Evans", 4));
		movieList.add(new Movie(2L, "Joker","Crime","Joaquin Phoenix", 3));
		movieList.add(new Movie(3L, "Frozen 2","Animation","Idina Menzel", 4));
		movieList.add(new Movie(4L, "Toy Story 4","Animation","Tom Hanks", 5));
		movieList.add(new Movie(5L, "Wonder Woman","Sci-fi","Gal Gadot", 4));
	}

	public Map<String, List<Movie>> categorizeMovies() {
		Map<String,List<Movie>> a=new HashMap<>();
		ArrayList<Movie> Sci=new ArrayList<>();
		ArrayList<Movie> Crime=new ArrayList<>();
		ArrayList<Movie> Anime=new ArrayList<>();
		ArrayList<Movie> drama=new ArrayList<>();
		for(Movie m: movieList) {
			if(a.containsKey(m.getGenre())) {
				a.get(m.getGenre()).add(m);
			}
			else {
				a.put(m.getGenre(),new ArrayList<Movie>(){{
					add(m);
				}});
		}
		}
		
	return a;
	}
	
	public Movie saveMovie(Movie movie) {
		movieList.add(movie);
		return movie;
		//Fill your code here
		 
	}
}
