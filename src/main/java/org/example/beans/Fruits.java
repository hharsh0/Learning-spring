package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Fruits {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        this.name = "Mango";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying the fruits!");
    }


    public void printHello(){
        System.out.println("Printing a fruit name...");
    }

}
