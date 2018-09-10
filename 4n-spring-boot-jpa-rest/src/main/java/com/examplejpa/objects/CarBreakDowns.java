package com.examplejpa.objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CarBreakDowns {

	@Id
	private int id;
	
	@OneToMany
	private CarBreakDowns carBreakDowns;
	
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
}
