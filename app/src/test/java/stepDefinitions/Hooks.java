package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@MobileTest")
    public void beforeMobileValidation(){
        System.out.println("\nBefore mobile hook!");
    }

    @After("@MobileTest")
    public void afterMobileValidation(){
        System.out.println("After mobile hook!\n");
    }

    @Before("@WebTest")
    public void beforeWebValidation(){
        System.out.println("\nBefore web hook!");
    }

    @After("@WebTest")
    public void afterWebValidation(){
        System.out.println("After web hook!\n");
    }
}
