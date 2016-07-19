package by.team.projects.vremonte.dal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.team.projects.vremonte.dal.dao.customer.CustomerPersistenceDelegator;
import by.team.projects.vremonte.dal.entity.user.customer.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerPersistenceDelegator customerDelegator;
	
	public Customer addCustomer(Customer customer) {
		
		return customerDelegator.save(customer);
	}
}
