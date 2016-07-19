package by.team.projects.vremonte.dal.dao.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "by.team.projects.vremonte.dal.dao")
@ComponentScan(basePackages = { "by.team.projects.vremonte.dal.dao" })
@EnableTransactionManagement
@PropertySource({ "classpath:hibernate.properties" })
public class DaoConfiguration {

	@Autowired
	private Environment env;
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		
			emfb.setDataSource(dataSource());
			
			emfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
			
			Properties jpaProperties = new Properties();
			
				jpaProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
				jpaProperties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
				jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
				
			emfb.setJpaProperties(jpaProperties);
			
			emfb.setPackagesToScan(new String[] { "by.team.projects.vremonte.dal.entity" });
			
		return emfb;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		
		JpaTransactionManager txm = new JpaTransactionManager();
		
			txm.setEntityManagerFactory(emf);
			
		return txm;
	}
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/VremonteBy_test");
			ds.setUsername("root");
			ds.setPassword("12345");
		
		return ds;
	}
}
