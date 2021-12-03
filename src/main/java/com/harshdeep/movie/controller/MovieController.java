package com.harshdeep.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshdeep.movie.entity.Movie;
import com.harshdeep.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@PostMapping(produces = "application/json")
	Movie createMovie(@RequestBody Movie movie) {
		System.out.println(movie);
		return service.createMovie(movie); 
	}
	
	@GetMapping(produces = "application/json")
	List<Movie> getAllMovies(){
		return service.getAllMovies();
	}
	
	@GetMapping(path="year/{year}", produces = "application/json")
	List<Movie> getMovieByYear(@PathVariable("year") Integer year){
		return service.getMovieByYear(year);
	}
	
	@GetMapping(path="greaterRating/{rating}", produces = "application/json")
	List<Movie> getMovieByRatingGreater(@PathVariable("rating") Float rating){
		return service.getMovieByRatingGreater(rating);
	}
	
	@GetMapping(path="lesserRating/{rating}", produces = "application/json")
	List<Movie> getMovieByRatingLesser(@PathVariable("rating") Float rating){
		return service.getMovieByRatingLesser(rating);
	}

}
