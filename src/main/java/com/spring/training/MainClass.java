package com.spring.training;

import com.spring.training.Service.EmployeeService;
import com.spring.training.config.ApplicationConfig;
import com.spring.training.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {

    public static void main(String[]args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
        System.out.println(employeeService.toString());
        EmployeeService employeeService2 = applicationContext.getBean("employeeService",EmployeeService.class);
        System.out.println(employeeService2.toString());

        List<Employee> employeeList = employeeService.getAllEmployees();

        for(Employee employee: employeeList) {
            System.out.println(employee.getEmployeeName()+" - "+employee.getEmployeeLocation());
        }
    }
}
