package in.engkrishna.crudSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CrudSpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringBootDemoApplication.class, args);
	}

}
