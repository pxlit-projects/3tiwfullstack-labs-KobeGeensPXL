package be.pxl.services.controller;

import be.pxl.services.dto.EmployeeRequest;
import be.pxl.services.services.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}