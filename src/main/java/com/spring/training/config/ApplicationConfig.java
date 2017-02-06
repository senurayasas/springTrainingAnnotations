package com.spring.training.config;

import com.spring.training.Repository.EmployeeRepository;
import com.spring.training.Repository.EmployeeRepositoryImpl;
import com.spring.training.Service.EmployeeService;
import com.spring.training.Service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */

@Configuration
@ComponentScan({"com.spring.training"})
@PropertySource("application.properties")
public class ApplicationConfig {

   /* @Bean(name="employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
       return new EmployeeRepositoryImpl();
    }*/

    @Bean(name = "employeeService")
    @Scope("prototype")
    public EmployeeService getEmployeeService(){
        return new EmployeeServiceImpl();
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
