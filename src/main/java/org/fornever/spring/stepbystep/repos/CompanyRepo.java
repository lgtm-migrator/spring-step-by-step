package org.fornever.spring.stepbystep.repos;

import org.fornever.spring.stepbystep.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends CrudRepository<Company, Long> {

	public Company findByCompanyName(String companyName);

	public Object deleteByCompanyName(String companyName);
	
}
