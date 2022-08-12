package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    List<Phone> ph(){
       Phone phone1 = new Phone("867-5309");
       Phone phone2 = new Phone("-9-91231,2222-32112312,3-9-91231,2222-32112321");
       return Arrays.asList(phone1, phone2);
    }
    @Bean
    public Employee getEmployee(){
        return new Employee();
    }
    @Bean
    public int id(){
        return 111111;
    }
    @Bean String name(){
       return "Employee";
    }
    @Bean
    public Address add(){
        return new Address("Washington", "DC", "United States", "20001");
    }
}
