package by.team.projects.vremonte.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import by.team.projects.vremonte.dal.dao.builder.BuilderPersistenceDelegator;
import by.team.projects.vremonte.dal.dao.customer.CustomerPersistenceDelegator;
import by.team.projects.vremonte.dal.entity.user.User;
import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.customer.Customer;

@Component
public class UserPersistenceDelegator {

	@Autowired
	private CustomerPersistenceDelegator customerDelegator;
	
	@Autowired
	private BuilderPersistenceDelegator builderDelegator;
	
	// @Transactional
	public User save(User user) {
		
		switch (user.getRole()) {
			
			case CUSTOMER: {
				
				return customerDelegator.save((Customer) user);
			}
			
			case BUILDER: {
				
				return builderDelegator.save((Builder) user);
			}
			
			case SUPER_ADMIN:
			case ADMIN:
				
			default: {
				
				return null;	// We can throw an Exception here!
			}
		}
	}
}
