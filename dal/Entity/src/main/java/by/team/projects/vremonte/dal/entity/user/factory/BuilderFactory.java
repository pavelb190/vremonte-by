package by.team.projects.vremonte.dal.entity.user.factory;

import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderOrganization;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderPerson;
import by.team.projects.vremonte.dal.entity.user.customer.Customer;

public class BuilderFactory extends UserFactory {

	@Override
	public Customer getCustomer(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Builder getBuilder(UserType userType) {
		
		Builder builder = null;
		
		switch (userType) {
		
			case PERSON_TYPE: {
				
				builder = new BuilderPerson();
				
				break;
			}
			
			case ORGANIZATION_TYPE: {
				
				builder = new BuilderOrganization();
				
				break;
			}
		}
		
		return builder;
	}

}
