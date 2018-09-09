package com.examplejpa.objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Car {
	
	@Id
	private int id;
	private String name;
	private String brand;
	private int buyDate;
	
	@OneToOne
	private Dashboard dashBoard;
	
	@OneToMany
	private CarReview carReviews;
	
	public enum GAS_TYPE {
		DIESEL,
		GASOLINA
	}
	
	private String power;
	private String color;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the power
	 */
	public String getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(String power) {
		this.power = power;
	}
	/**
	 * @return the buyDate
	 */
	public int getBuyDate() {
		return buyDate;
	}
	/**
	 * @param buyDate the buyDate to set
	 */
	public void setBuyDate(int buyDate) {
		this.buyDate = buyDate;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
}