package com.autocare.dao;

import com.autocare.dao.interfaces.CustomerDAO;
import com.autocare.entity.Customer;

public class CustomerDAOImpl extends AutocareBaseDAO<Customer> implements CustomerDAO{
	
	public Customer addCustomer(Customer customer) {
		addEntity(customer);
		return null;
	}

}
