package com.spring.training.Repository;

import com.spring.training.domain.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:43
 * To change this template use File | Settings | File Templates.
 */


public interface EmployeeRepository {

    public List<Employee> getAllEmployees();
}
