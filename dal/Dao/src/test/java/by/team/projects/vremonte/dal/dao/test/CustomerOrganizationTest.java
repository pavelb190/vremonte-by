package by.team.projects.vremonte.dal.dao.test;

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

import by.team.projects.vremonte.dal.dao.CustomerOrganizationRepository;
import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;
import by.team.projects.vremonte.dal.entity.user.customer.CustomerOrganization;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class CustomerOrganizationTest implements ApplicationContextAware {

	private ApplicationContext ctxt;
	
	@Test
	public void testCreateCustomerOrganization() {
		
		CustomerOrganizationRepository customerRepo = ctxt.getBean(CustomerOrganizationRepository.class);
		
			CustomerOrganization customer = new CustomerOrganization();
			
				customer.setEmail("info@team.by");
		
					customer.getDetails().setName("TEAM");
					customer.getDetails().setUnpNo("123456789");
					customer.getDetails().setPhoneNumber("+37517-123-45-67");
				
			customer = customerRepo.save(customer);
				
			System.out.println("\t[Created customer Organization is: " + customer + "]");
			
		Assert.notNull(customer, "Couldn't create a new Customer!");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
