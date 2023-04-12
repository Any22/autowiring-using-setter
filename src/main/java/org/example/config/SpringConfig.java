package org.example.config;
import org.example.demo.CurrentAccount;
import org.example.demo.Customer;
import org.example.demo.Register;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
    @Bean
    public Register register(){
        return new CurrentAccount();
    }

    @Bean
    public Customer customer(){
        return new Customer();
    }
}
