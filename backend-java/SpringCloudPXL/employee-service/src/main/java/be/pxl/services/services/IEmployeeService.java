package be.pxl.services.services;

import be.pxl.services.domain.Employee;
import be.pxl.services.dto.EmployeeRequest;
import be.pxl.services.dto.EmployeeResponse;

import java.util.List;

public interface IEmployeeService {
    List<EmployeeResponse> getAllEmployees();

    void addEmployee(EmployeeRequest request);
}
