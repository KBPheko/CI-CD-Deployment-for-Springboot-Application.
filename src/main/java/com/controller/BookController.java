package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping(value = "/")
	public String welcomeMessage() {
		return "Welcome to the Urban Astronauts Book Club Spring Boot App ";
	}
	
	public String findByTitle(@PathVariable("bookTitle") String bookTitle) {
		return "This book is titled "+ bookTitle + " by Karabo Pheko";
	}
}
