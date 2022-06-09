package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Movie;
import com.springboot.dao.MovieDAO;

import java.util.Map;
@RestController
@RequestMapping("/movie")
//Fill your code here
public class MovieController {

    @Autowired
    MovieDAO mdao= new MovieDAO();
    @PostMapping(value="/create") 
    public Movie create(@RequestBody Movie movie)
    {
    //Fill your code here
		mdao.saveMovie(movie);
		return movie;
    }

	//Fill your code here
	@GetMapping(value="/categorize")
    public Map<String, List<Movie>> categorizeMovies()
    {
		return mdao.categorizeMovies();
        //Fill your code here
    }
}