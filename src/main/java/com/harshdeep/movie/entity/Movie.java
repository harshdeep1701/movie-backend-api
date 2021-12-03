package com.harshdeep.movie.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	UUID id;
	String name;
	Integer year;
	Float rating;
	
	
	
	public UUID getId() {
		return id;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getYear() {
		return year;
	}



	public void setYear(Integer year) {
		this.year = year;
	}



	public Float getRating() {
		return rating;
	}



	public void setRating(Float rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}
}
