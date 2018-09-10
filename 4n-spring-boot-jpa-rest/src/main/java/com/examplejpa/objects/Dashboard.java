package com.examplejpa.objects;

import javax.persistence.ManyToOne;

public class Dashboard {

	@ManyToOne
	private CarReviews carReviews;
	
	@ManyToOne
	private CarBreakDowns carBreackDowns;
}
