package orders;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("orders")
public class OrderDBConfig {

	@Autowired
	Environment env;

	private final String URL = "jdbc:postgresql://192.168.110.48:5432/plf_training";
	private final String User = "plf_training_admin";
	private final String Password = "pff123";
	private final String Driver = "org.postgresql.Driver";

	@Bean
	DataSource dataSource() {

		DriverManagerDataSource dmds = new DriverManagerDataSource();

		dmds.setDriverClassName(Driver);
		dmds.setUrl(URL);
		dmds.setUsername(User);
		dmds.setPassword(Password);

		return dmds;
	}
}
