package spring_hibernate_cart1.dto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring_hibernate_cart1.dto","spring_hibernate_cart1.dao"})
public class Config {
	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("akash").createEntityManager();
	}
}
