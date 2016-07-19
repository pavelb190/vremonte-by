package by.team.projects.vremonte.dal.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.Assert;

import by.team.projects.vremonte.dal.dao.builder.SkillRepository;
import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;
import by.team.projects.vremonte.dal.entity.user.builder.Skill;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class SkillTest implements ApplicationContextAware {

	private ApplicationContext ctxt;
	
	@Test
	public void testCreateSkill() {
		
		SkillRepository skillRepo = ctxt.getBean(SkillRepository.class);
		
			Skill skill = new Skill();
			
				skill.setSkillName("A");
				
			skill = skillRepo.save(skill);
			
			System.out.println("\t[Created skill is: " + skill + "]");
			
		Assert.notNull(skill, "Couldn't create a new Skill!");
	}
	
	@Test
	public void testCreateParentSkill() {
		
		SkillRepository skillRepo = ctxt.getBean(SkillRepository.class);
		
			Skill skillA = skillRepo.findOne(1L);
			
				System.out.println("\t[Skill 'A' is: " + skillA + "]");
			
				Assert.notNull(skillA, "SkillA doesn't exist!");
			
			Skill skillB = new Skill();
			
				skillB.setSkillName("B");
				
				skillB.setParentSkill(skillA);
				
			skillB = skillRepo.save(skillB);
			
				System.out.println("\t[Created skill 'B' with parent 'A' is: " + skillB + "]");
				
			Assert.notNull(skillB, "Couldn't create a new Skill 'B' with parent 'A'!");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
