package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {
	
	private static final String TEMPLATE_BYE = "Bye, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/bye")
    public Bye bye(@RequestParam(value="name", defaultValue="World") String name) {
        return new Bye(counter.incrementAndGet(), String.format(TEMPLATE_BYE, name));
    }
}
