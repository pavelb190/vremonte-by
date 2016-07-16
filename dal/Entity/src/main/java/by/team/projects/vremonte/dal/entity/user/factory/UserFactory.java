package by.team.projects.vremonte.dal.entity.user.factory;

import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.customer.Customer;

public abstract class UserFactory {

	public static enum UserType {
		PERSON_TYPE, ORGANIZATION_TYPE
	}
	
	public abstract Customer getCustomer(UserType userType);
	public abstract Builder getBuilder(UserType userType);
}
