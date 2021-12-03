package com.harshdeep.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshdeep.movie.entity.Movie;
import com.harshdeep.movie.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository repo;
	
	public Movie createMovie(Movie movie) {
		return repo.save(movie);
	}

	public List<Movie> getAllMovies() {
		return repo.findAll();
	}

	public List<Movie> getMovieByYear(Integer year) {
		return repo.findByYear(year);
	}
	
	public List<Movie> getMovieByRatingGreater(Float rating) {
		return repo.findByRatingGreaterThanEqual(rating);
	}

	public List<Movie> getMovieByRatingLesser(Float rating) {
		return repo.findByRatingLessThanEqual(rating);
	}

}
