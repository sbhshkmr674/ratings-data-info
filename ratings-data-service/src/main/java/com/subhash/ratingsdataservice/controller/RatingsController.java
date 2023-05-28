package com.subhash.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subhash.ratingsdataservice.model.Rating;
import com.subhash.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	
	@GetMapping("/{movieId}")
	public Rating getRatingsByMovieId(@PathVariable String movieId) {
		
		return new Rating(movieId,"4");
	}
	 
	@GetMapping("users/{userId}")
	public UserRating getRatingsByUserId(@PathVariable("userId") String userId){
		
		List<Rating> ratings=Arrays.asList(
				new Rating("550","5"),
				new Rating("100","3"),
				new Rating("200","1"),
				new Rating("250","3")
		);
		UserRating userRating=new UserRating();
		
		userRating.setRatingList(ratings);
		
		return userRating;
	}

}
 