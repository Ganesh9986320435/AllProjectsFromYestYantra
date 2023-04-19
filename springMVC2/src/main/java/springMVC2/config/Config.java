package springMVC2.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springMVC2"})
public class Config {
	@Bean
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
}
