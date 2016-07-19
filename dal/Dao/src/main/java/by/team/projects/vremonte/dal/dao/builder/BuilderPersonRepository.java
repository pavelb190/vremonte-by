package by.team.projects.vremonte.dal.dao.builder;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.user.builder.BuilderPerson;

public interface BuilderPersonRepository extends CrudRepository<BuilderPerson, Long> {

	// ...
}
