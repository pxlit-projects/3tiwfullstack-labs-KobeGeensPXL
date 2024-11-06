package be.pxl.service.controller;

import be.pxl.service.domain.Employee;
import be.pxl.service.dto.EmployeeRequest;
import be.pxl.service.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private final IEmployeeService employeeService;



    @GetMapping
    public ResponseEntity getEmployees() {
        return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewEmployee(@RequestBody EmployeeRequest request) {
        employeeService.addEmployee(request);
    }
    @GetMapping
    public ResponseEntity<List<Employee>> findByDepartment(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.findByDepartment(id), HttpStatus.OK);
    }
}
