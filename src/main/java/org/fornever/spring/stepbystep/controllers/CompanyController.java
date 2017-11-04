package org.fornever.spring.stepbystep.controllers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.fornever.spring.stepbystep.models.Company;
import org.fornever.spring.stepbystep.repos.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/company")
public class CompanyController {

	@Autowired
	private CompanyRepo companyRepo;
	
	// create a company
	
	/**
	 *	POST /api/v2/company HTTP/1.1
	 *	Host: localhost:8080
	 *	Content-Type: application/json
	 *	Cache-Control: no-cache
	 *	
	 *	{ "companyName":"hello", "companyDesc":"some thing" }
	 */
	
	/**
	 * Complex payload
	 * 
		{
			"companyName":"hello",
			"companyDesc": "some thing",
			"products": [
				{
					"productName":"p1",
					"productDesc":"desc1"
				},	{
					"productName":"p1",
					"productDesc":"desc1"
				},	{
					"productName":"p1",
					"productDesc":"desc1"
				}
			]
		}
	 * 
	 */

	@PostMapping
	public Object create(@RequestBody Company company) {
		return companyRepo.save(company);
	}

	@GetMapping
	public Object listall() {
		return companyRepo.findAll();
	}

}
