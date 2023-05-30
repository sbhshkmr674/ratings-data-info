package com.subhash.ratingsdataservice.model;

import java.util.List;

public class UserRating {

	private List<Rating> ratingList;
	
	public UserRating() {
		super();
	}

	public UserRating(List<Rating> ratingList) {
		super();
		this.ratingList = ratingList;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}
}
