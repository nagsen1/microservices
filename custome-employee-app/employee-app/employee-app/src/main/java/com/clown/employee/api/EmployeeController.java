package com.clown.employee.api;

import com.clown.employee.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        return Arrays.asList(new Employee(1, "Prince", "Nagsen"));

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(int empId){
        return new Employee(empId, "Sonal", "Nagsen");
    }

    @PostMapping("/employees")
    public void createEmployee(){

    }
}
