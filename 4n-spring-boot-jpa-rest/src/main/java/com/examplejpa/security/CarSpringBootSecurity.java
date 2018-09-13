package com.examplejpa.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class CarSpringBootSecurity extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("{noop}test").roles("USER");
	}
	
	@Override
	public void configure(HttpSecurity httpSecurity) {
		try {
			// Authoriza all my request | 
			httpSecurity
				.authorizeRequests()
				.antMatchers("*/cars").hasRole("USER")
//				.antMatchers("**/rest/*")
				.anyRequest()
				.fullyAuthenticated()
//				.permitAll() // Not request authentication user and password
				.and()
//				.addFilterBefore(customFilter(), BasicAuthenticationFilter.class)
//				.fullyAuthenticated()
				.httpBasic();
			
			// Disabe cross site 
			httpSecurity.csrf().disable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
