package com.spring.training.domain;

/**
 * Created with IntelliJ IDEA.
 * User: sdesilva
 * Date: 2/5/17
 * Time: 17:42
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

        String employeeName;
        String employeeLocation;

        public String getEmployeeLocation() {
            return employeeLocation;
        }

        public void setEmployeeLocation(String employeeLocation) {
            this.employeeLocation = employeeLocation;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

}
