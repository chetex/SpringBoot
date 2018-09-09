package com.demo.security.configuration;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class CustomFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Destroy filter");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("Do filter filter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		
		Principal userPrincipal = request.getUserPrincipal();
		System.out.println("User prinpical " + userPrincipal);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Init filter");
	}
}
