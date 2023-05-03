package pro.sky.hw_2_10.services;

import pro.sky.hw_2_10.Employee;


public interface EmployeeService {

    Employee addEmployee (String firstName, String lastName);
    Employee removeEmployee (String firstName, String lastName);
    Employee findEmployee (String firstName, String lastName);
}
