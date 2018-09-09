package com.examplejpa.objects;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarBreakDown {

	@Id
	private int id;
	private int kilometers;
	private String breakDown;
	private int price;
	private Date date;
	
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
	 * @return the breakDown
	 */
	public String getBreakDown() {
		return breakDown;
	}
	/**
	 * @param breakDown the breakDown to set
	 */
	public void setBreakDown(String breakDown) {
		this.breakDown = breakDown;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
