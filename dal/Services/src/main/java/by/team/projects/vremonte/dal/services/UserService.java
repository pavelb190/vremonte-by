package by.team.projects.vremonte.dal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.team.projects.vremonte.dal.dao.UserPersistenceDelegator;
import by.team.projects.vremonte.dal.entity.user.User;

@Service
public class UserService {

	@Autowired
	private UserPersistenceDelegator userDelegator;
	
	public User addUser(User user) {
		
		return userDelegator.save(user);
	}
}
