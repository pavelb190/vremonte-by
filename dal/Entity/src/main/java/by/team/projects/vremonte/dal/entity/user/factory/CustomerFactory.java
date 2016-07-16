package by.team.projects.vremonte.dal.entity.user.factory;

import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.customer.Customer;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerOrganization;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerPerson;

public class CustomerFactory extends UserFactory {

	@Override
	public Customer getCustomer(UserType userType) {
		
		Customer customer = null;
		
		switch (userType) {
		
			case PERSON_TYPE: {
				
				customer = new CustomerPerson();
				
				break;
			}
			
			case ORGANIZATION_TYPE: {
				
				customer = new CustomerOrganization();
				
				break;
			}
		}
		
		return customer;
	}

	@Override
	public Builder getBuilder(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}
}
