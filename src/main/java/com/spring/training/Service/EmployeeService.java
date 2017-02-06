package com.spring.training.Service;

import com.spring.training.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();
}
