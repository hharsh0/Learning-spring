package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*
   When a class is annotated with @Configuration,
   it indicates to the Spring IoC container that this class will provide one or more bean definitions.
   These bean definitions typically correspond to application components that will be managed by
   the Spring container.

   Inside a @Configuration class,
   you can use the @Bean annotation to declare methods that will return instances of beans.
   The @Bean annotation tells the Spring container that the return value of the method should
   be registered as a bean.
*/

@Configuration
@ComponentScan("org.example.beans")
public class ProjectConfig {

    @Primary
    @Bean(value = "audi")
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(name="honda")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("mars")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Mars");
        return veh;
    }


    @Bean
    String hello(){
        return "Hello world!";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
