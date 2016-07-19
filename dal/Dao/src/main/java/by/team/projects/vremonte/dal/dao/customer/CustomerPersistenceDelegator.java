package by.team.projects.vremonte.dal.dao.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import by.team.projects.vremonte.dal.entity.user.customer.Customer;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerOrganization;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerPerson;
import by.team.projects.vremonte.dal.entity.user.details.Organization;
import by.team.projects.vremonte.dal.entity.user.details.Person;

@Component
public class CustomerPersistenceDelegator {

	@Autowired
	private CustomerPersonRepository personRepository;
	
	@Autowired
	private CustomerOrganizationRepository organizationRepository;
	
	// @Transactional
	public Customer save(Customer customer) {
		
		if (customer instanceof Person) {
			
			return personRepository.save((CustomerPerson) customer);
		}
		
		if (customer instanceof Organization) {
			
			return organizationRepository.save((CustomerOrganization) customer);
		}
		
		return null;
	}
}
