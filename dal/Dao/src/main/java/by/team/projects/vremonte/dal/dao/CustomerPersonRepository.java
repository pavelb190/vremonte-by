package by.team.projects.vremonte.dal.dao;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.user.customer.CustomerPerson;

public interface CustomerPersonRepository extends CrudRepository<CustomerPerson, Long> {

	// ...
}
