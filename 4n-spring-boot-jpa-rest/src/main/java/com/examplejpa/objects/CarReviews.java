package com.examplejpa.objects;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarReviews {

	@Id
	private int id;
	private List<CarReview> carReviewList;
	
	/**
	 * @return the carReviewList
	 */
	public List<CarReview> getCarReviewList() {
		return carReviewList;
	}
	/**
	 * @param carReviewList the carReviewList to set
	 */
	public void setCarReviewList(List<CarReview> carReviewList) {
		this.carReviewList = carReviewList;
	}
}
