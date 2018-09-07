package com.demo.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("ajay").password("{noop}test").roles("USER").and()
			.withUser("demo").password("{noop}test2").roles("ADMIN");
	}
	
	@Override
	public void configure(HttpSecurity httpSecurity) {
		try {
			// Authoriza all my request | 
			httpSecurity
				.authorizeRequests()
				// .antMatchers("**/rest/*")
				.anyRequest()
				//.permitAll() // Not request authentication user and password
				.fullyAuthenticated()
				.and().httpBasic();
			
			// Disabe 
			httpSecurity.csrf().disable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
