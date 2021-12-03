package com.harshdeep.movie.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshdeep.movie.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, UUID> {

	List<Movie> findByYear(Integer year);
	List<Movie> findByRatingGreaterThanEqual(Float rating);
	List<Movie> findByRatingLessThanEqual(Float rating);
}
