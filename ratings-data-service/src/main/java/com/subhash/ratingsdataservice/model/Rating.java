package com.subhash.ratingsdataservice.model;

public class Rating {

	private String movieId;
	private String rating;
	
	public Rating() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(String movieId, String rating) {
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
