package by.team.projects.vremonte.dal.dao.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderOrganization;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderPerson;
import by.team.projects.vremonte.dal.entity.user.details.Organization;
import by.team.projects.vremonte.dal.entity.user.details.Person;

@Component
public class BuilderPersistenceDelegator {

	@Autowired
	private BuilderPersonRepository personRepository;
	
	@Autowired
	private BuilderOrganizationRepository organizationRepository;
	
	// @Transactional
	public Builder save(Builder builder) {
		
		if (builder instanceof Person) {
			
			return personRepository.save((BuilderPerson) builder);
		}
		
		if (builder instanceof Organization) {
			
			return organizationRepository.save((BuilderOrganization) builder);
		}
		
		return null;
	}
}
