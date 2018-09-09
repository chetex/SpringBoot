package com.examplejpa.objects;

import javax.persistence.OneToMany;

public class Dashboard {

	@OneToMany
	private CarReviews carReviews;
	
	@OneToMany
	private CarBreakDowns carBreackDowns;
}
