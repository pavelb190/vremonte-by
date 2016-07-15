package by.team.projects.vremonte.dal.dao;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	// ...
}
