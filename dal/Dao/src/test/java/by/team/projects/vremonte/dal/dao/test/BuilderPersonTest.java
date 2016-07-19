package by.team.projects.vremonte.dal.dao.test;

import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.Assert;

import by.team.projects.vremonte.dal.dao.builder.BuilderPersonRepository;
import by.team.projects.vremonte.dal.dao.builder.SkillRepository;
import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;
import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderPerson;
import by.team.projects.vremonte.dal.entity.user.builder.Skill;
import by.team.projects.vremonte.dal.entity.user.details.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class BuilderPersonTest implements ApplicationContextAware {

	private ApplicationContext ctxt;
	
	@Ignore
	@Test
	public void testCreateBuilderPerson() {
		
		BuilderPersonRepository builderRepo = ctxt.getBean(BuilderPersonRepository.class);
		
			BuilderPerson builder = new BuilderPerson();
			
				builder.setEmail("ivan@team.by");
				
					builder.getDetails().setFirstName("Ivan");
		
			builder = builderRepo.save(builder);
				
			System.out.println("\t[Created builder Person is: " + builder + "]");
			
		Assert.notNull(builder, "Couldn't create a new Builder!");
	}
	
	@Ignore
	@Test
	public void testSetBuilderSkills() {
		
		SkillRepository skillRepo = ctxt.getBean(SkillRepository.class);
		
		Skill someSkill = new Skill();
		
			final String skillName = UUID.randomUUID().toString();
		
				someSkill.setSkillName(skillName);
			
			someSkill = skillRepo.save(someSkill);
			
			System.out.println("\t[Created skill is: " + someSkill + "]");
			
		Assert.notNull(someSkill, "Couldn't create a skill with name '" + skillName + "'");
		
		BuilderPersonRepository builderRepo = ctxt.getBean(BuilderPersonRepository.class);
			
			BuilderPerson builder = new BuilderPerson();
				
				final String userName = UUID.randomUUID().toString();
			
				builder.setEmail(userName + "@team.by");
				
					builder.getDetails().setFirstName("Ivan");
					builder.getSkills().add(someSkill);
		
			builder = builderRepo.save(builder);
			
			System.out.println("\t[Created builder with a new skill is: " + builder + "]");
			
		Assert.notNull(builder, "Couldn't create a builder with existing skill!");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
