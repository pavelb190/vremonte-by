package by.team.projects.vremonte.dal.dao.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.Assert;

import by.team.projects.vremonte.dal.dao.config.DaoConfiguration;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class DaoTest implements ApplicationContextAware {

	@Autowired
	private DataSource dataSource;
	
	private ApplicationContext ctxt;
	
	@Test
	public void testDBConnection() throws SQLException {
		
		Assert.notNull(dataSource.getConnection(), "Couldn't create a DBConnection!");
	}	
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.ctxt = context;
	}
}
