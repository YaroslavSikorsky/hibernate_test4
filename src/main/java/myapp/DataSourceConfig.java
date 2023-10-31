package myapp;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName("org.postgresql.Driver")
				.url("jdbc:postgresql://localhost:5432/hibernate_test4?currentSchema=public")
				.username("challenger_owner")
				.password("Temp4321")
				.build();
	}
}