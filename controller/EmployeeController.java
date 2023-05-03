package pro.sky.hw_2_10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hw_2_10.Employee;
import pro.sky.hw_2_10.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать";
    }

    @GetMapping("/add")
    public Employee addEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }
}