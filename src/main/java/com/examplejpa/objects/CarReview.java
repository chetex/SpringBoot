package com.examplejpa.objects;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarReview {

	@Id
	private int id;
	private int kilometers;
	private String oilType;
	private String filters;
	private String tyres; // Neumáticos
	private String genericReview;
	private Date reviewDate;
	
	/**
	 * @return the kilometers
	 */
	public int getKilometers() {
		return kilometers;
	}
	/**
	 * @param kilometers the kilometers to set
	 */
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	/**
	 * @return the oilType
	 */
	public String getOilType() {
		return oilType;
	}
	/**
	 * @param oilType the oilType to set
	 */
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}
	/**
	 * @return the filters
	 */
	public String getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(String filters) {
		this.filters = filters;
	}
	/**
	 * @return the tyres
	 */
	public String getTyres() {
		return tyres;
	}
	/**
	 * @param tyres the tyres to set
	 */
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
	/**
	 * @return the genericReview
	 */
	public String getGenericReview() {
		return genericReview;
	}
	/**
	 * @param genericReview the genericReview to set
	 */
	public void setGenericReview(String genericReview) {
		this.genericReview = genericReview;
	}
	/**
	 * @return the reviewDate
	 */
	public Date getReviewDate() {
		return reviewDate;
	}
	/**
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
}
