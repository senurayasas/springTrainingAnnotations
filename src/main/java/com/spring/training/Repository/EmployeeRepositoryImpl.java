package com.spring.training.Repository;

import com.spring.training.domain.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

        @Value("${firstName}")
        private String firstName;

        @Value("${location}")
        private String location;

        @Override
        public List<Employee> getAllEmployees() {
            List<Employee> employees = new ArrayList<Employee>();
            Employee employee = new Employee();
            employee.setEmployeeName(firstName);
            employee.setEmployeeLocation(location);
            employees.add(employee);
            return employees;

        }
}
