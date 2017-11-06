package org.fornever.spring.stepbystep.services;

import org.fornever.spring.stepbystep.models.Company;
import org.fornever.spring.stepbystep.models.Product;
import org.fornever.spring.stepbystep.repos.CompanyRepo;
import org.fornever.spring.stepbystep.repos.ProducrtRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyService {

	@Autowired
	CompanyRepo companyRepo;

	@Autowired
	ProducrtRepo productRepo;

	@Transactional // rollback if any exception throw
	public Object saveWithCheck(Company company) {
		Company check = companyRepo.findByCompanyName(company.getCompanyName());
		if (check != null) {
			productRepo.delete(new Product() {
				{
					setCompany(check);
				}
			});
			companyRepo.deleteByCompanyName(company.getCompanyName());// if error throw
		}
		return companyRepo.save(company);
	}

}
