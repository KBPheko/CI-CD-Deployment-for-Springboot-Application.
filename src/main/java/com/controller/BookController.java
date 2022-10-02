package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping(value = "/")
	public String welcomeMessage() {
		return "<h1 style='color:red'>Welcome to the Urban Astronauts Book Club Spring Boot App</h1> ";
	}
	
	@GetMapping(value = "books/{bookTitle}")
	public String findByTitle(@PathVariable("bookTitle") String bookTitle) {
		return "This book is titled "+ bookTitle + " by Karabo Pheko";
	}
}
