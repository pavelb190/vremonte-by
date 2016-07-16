package by.team.projects.vremonte.dal.entity.user.factory;

import by.team.projects.vremonte.dal.entity.user.RolesType;

public class UserFactoryProducer {

	public static UserFactory getFactory(RolesType roleType) {
		
		switch (roleType) {
			
			case CUSTOMER: {
				
				return new CustomerFactory();
			}
			
			case BUILDER: {
				
				return new BuilderFactory();
			}
			
			default: {
				
				throw new UnsupportedOperationException("There is no corresponding factory for type " + roleType + "!");
			}
		}
	}
}
