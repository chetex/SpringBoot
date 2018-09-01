package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics () {
		return Arrays.asList(
				new Topic(0, "nacho", "Creador"), 
				new Topic(1, "pepe", "ddd"));
	}
}
