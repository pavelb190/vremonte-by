package by.team.projects.vremonte.dal.dao;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.CustomerOrganization;

public interface CustomerOrganizationRepository extends CrudRepository<CustomerOrganization, Long> {

	// ...
}
