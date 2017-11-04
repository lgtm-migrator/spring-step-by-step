package org.fornever.spring.stepbystep.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // normally used for API
@RequestMapping("/")
public class HomeController {

	@GetMapping // == RequestMapping + Method = GET
	public Object home() {
		return "hello spring";
	}

	@PostMapping
	public Object postHome() {
		return "hello spring with post method";
	}

}
