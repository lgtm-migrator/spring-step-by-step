package org.fornever.spring.stepbystep.controllers;

import org.fornever.spring.stepbystep.repos.ProducrtRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/product")
public class ProductController {
	
	@Autowired
	ProducrtRepo productRepo;

	@GetMapping
	Object all() {
		return productRepo.findAll();
	}
	
}
