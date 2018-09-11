package com.examplejpa;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.examplejpa.service.CarRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc 
public class ApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	CarRepository carRepository;
	
	@Test
	public void testWithMockito() {
		try {
			// Testing with mockito and call directly repository
			Mockito.when(carRepository.findAll()).thenReturn(
						Collections.emptyList()
					);
			
			// Testing with MockMVC against REST API
			MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("/main/cars")
					.accept(MediaType.APPLICATION_JSON)
			).andReturn();
			System.out.println("Print request URL");
			System.out.println(mvcResult.getResponse());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
