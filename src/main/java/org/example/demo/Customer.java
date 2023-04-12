package org.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private Register register;
    public Register getRegister() {
        return register;
    }
    @Autowired
    public void setRegister(Register register) {
        this.register = register;
    }

    public void registerAccount(){
        if (register.registerToAccount()){
            System.out.println("Customer registered !!"+ getRegister());
        } else {
            System.out.println("Customer not registered ");
        }

    }
}

