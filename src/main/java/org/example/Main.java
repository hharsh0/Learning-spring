package org.example;

import org.example.beans.Fruits;
import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


//        if using xml
//        var context = new ClassPathXmlApplicationContext("beans.xml");

//        Vehicle veh = context.getBean("mars",Vehicle.class);
        Vehicle veh = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

//        Fruits fruit = context.getBean(Fruits.class);

//        System.out.println("Vehicle name from Spring Context is: " + fruit.getName());
//
//        fruit.printHello();

        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        System.out.println("Vehicle that Person own is: " + person.getVehicle());
        System.out.println("Person name is: " + person.getName());


        context.close();

    }
}