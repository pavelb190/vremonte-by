package by.team.projects.vremonte.dal.services.test;

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

import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;
import by.team.projects.vremonte.dal.entity.user.builder.Builder;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderOrganization;
import by.team.projects.vremonte.dal.entity.user.builder.BuilderPerson;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerPerson;
import by.team.projects.vremonte.dal.services.BuilderService;
import by.team.projects.vremonte.dal.services.config.ServicesConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DaoConfiguration.class, ServicesConfiguration.class }, loader = AnnotationConfigContextLoader.class)
public class BuilderServiceTest implements ApplicationContextAware {

	private ApplicationContext ctxt;
	
	@Ignore
	@Test
	public void testBuilderDelegation() {
		
		BuilderService builderService = ctxt.getBean(BuilderService.class);
		
			BuilderPerson person = new BuilderPerson();
			
				person.setEmail("123@team.by");
					
					person.getDetails().setFirstName("Ivan");
					
				person = (BuilderPerson) builderService.addBuilder(person);
			
			System.out.println("\tBuilder (Person) is: " + person);
			
		Assert.notNull(person, "Couldn't create a Person via BuilderDelegator!");
			
			BuilderOrganization org = new BuilderOrganization();
			
				org.setEmail("456@team.by");
					
					org.getDetails().setName("ABCDEF");
					org.getDetails().setUnpNo("123456780");
					org.getDetails().setPhoneNumber("+37529 1234567");
					
				org = (BuilderOrganization) builderService.addBuilder(org);
		
			System.out.println("\tBuilder (Organization) is: " + org);
		
		Assert.notNull(org, "Couldn't create a Organization via BuilderDelegator!");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
