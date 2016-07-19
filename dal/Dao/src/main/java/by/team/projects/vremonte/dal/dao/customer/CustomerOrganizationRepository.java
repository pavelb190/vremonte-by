package by.team.projects.vremonte.dal.dao.customer;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.user.customer.CustomerOrganization;

public interface CustomerOrganizationRepository extends CrudRepository<CustomerOrganization, Long> {

	// ...
}
