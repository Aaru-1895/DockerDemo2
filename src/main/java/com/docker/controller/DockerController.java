package com.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {
	
	@RequestMapping("/")
	public String deckerDemo() {
		return "Docker Demo working....";
	}
	
	@RequestMapping("/dockerMessage")
	public String message() {
		return "Application successfully working  !!!!";
	}

}
