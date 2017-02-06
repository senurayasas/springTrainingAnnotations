package com.spring.training.Service;

import com.spring.training.Repository.EmployeeRepository;
import com.spring.training.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;


    /*public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        System.out.println("Constructor base injection ");
        this.employeeRepository = employeeRepository;
    }*/


    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter injected Fired");
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

}
