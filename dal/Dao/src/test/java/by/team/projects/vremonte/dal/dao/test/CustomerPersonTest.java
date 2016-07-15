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

import by.team.projects.vremonte.dal.dao.CustomerPersonRepository;
import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;
import by.team.projects.vremonte.dal.entity.CustomerPerson;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class CustomerPersonTest implements ApplicationContextAware {

	private ApplicationContext ctxt;
	
	@Test
	public void testCreateCustomerPerson() {
		
		CustomerPersonRepository customerRepo = ctxt.getBean(CustomerPersonRepository.class);
		
			CustomerPerson customer = new CustomerPerson();
			
				customer.setEmail("ivan@team.by");
				
					customer.getDetails().setFirstName("Ivan");
		
			customer = customerRepo.save(customer);
				
			System.out.println("\t[Created customer Person is: " + customer + "]");
			
		Assert.notNull(customer, "Couldn't create a new Customer!");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
