package dto;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "dto", "dao" })
public class Config {
	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}

	@Bean
	public Scanner getscanner() {
		return new Scanner(System.in);
	}
}
