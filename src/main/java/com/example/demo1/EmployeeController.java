package com.example.demo1;

// import com.example.demo1.entity.Employee;
// import com.example.demo1.service.EmployeeService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import java.util.List;

@RestController
// @RequestMapping("/employees")
public class EmployeeController {

    // @Autowired
    // private EmployeeService employeeService;

    @GetMapping("/")
    public String getAllEmployees() {
        // return employeeService.getAllEmployees();
        return "dunyo go'zal";
    }

    /* @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    } */
}