package by.team.projects.vremonte.dal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.team.projects.vremonte.dal.dao.builder.BuilderPersistenceDelegator;
import by.team.projects.vremonte.dal.entity.user.builder.Builder;

@Service
public class BuilderService {
	
	@Autowired
	private BuilderPersistenceDelegator builderDelegator;
	
	public Builder addBuilder(Builder builder) {
		
		return builderDelegator.save(builder);
	}
}
