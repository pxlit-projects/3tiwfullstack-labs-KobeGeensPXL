package be.pxl.service.services;

import be.pxl.service.domain.Employee;
import be.pxl.service.dto.EmployeeRequest;
import be.pxl.service.dto.EmployeeResponse;

import java.util.List;

public interface IEmployeeService {
    List<EmployeeResponse> getAllEmployees();

    void addEmployee(EmployeeRequest request);

    List<Employee> findByDepartment(Long id);
}
