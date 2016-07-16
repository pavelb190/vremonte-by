package by.team.projects.vremonte.dal.dao;

import org.springframework.data.repository.CrudRepository;

import by.team.projects.vremonte.dal.entity.user.builder.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {

	// ...
}
