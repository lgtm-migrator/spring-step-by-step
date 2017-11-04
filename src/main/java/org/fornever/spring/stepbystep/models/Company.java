package org.fornever.spring.stepbystep.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(value = Include.NON_EMPTY)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String companyName;
	private String companyDesc;

	// mappedBy is necessary, for identify the main table
	// cascade are used to decide whether to cascade persistent objects
	// fetch is used to determine whether to take the initiative to obtain object
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		// need to process company id here
		for (Product p : products) {
			if (p.getCompany() == null) {
				p.setCompany(this);
			}
		}
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDesc() {
		return companyDesc;
	}

	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

}
