//Auto wiring using property
package org.example.demo;
import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Customer customer = applicationContext.getBean(Customer.class);
        customer.setRegister(customer.getRegister());
        customer.registerAccount();

    }
}