package in.engkrishna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.engkrishna")
public class AppConfig {

    @Bean
public  UserService getUserServiceBean(){
    return  new UserService();
}
}
