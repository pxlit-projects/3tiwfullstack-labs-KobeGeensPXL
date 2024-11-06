package be.pxl.service.services;

import be.pxl.service.client.NotificationClient;
import be.pxl.service.domain.Employee;
import be.pxl.service.dto.EmployeeRequest;
import be.pxl.service.dto.EmployeeResponse;
import be.pxl.service.model.NotificationRequest;
import be.pxl.service.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements  IEmployeeService{
    private final EmployeeRepository employeeRepository;
    private final NotificationClient notificationClient;

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(this::mapToEmployeeResponse)
                .toList();
    }
    private EmployeeResponse mapToEmployeeResponse(Employee employee) {
        return EmployeeResponse.builder()
                .organizationId(employee.getOrganizationId())
                .departmentId(employee.getDepartmentId())
                .name(employee.getName())
                .age(employee.getAge())
                .position(employee.getPosition())
                .build();
    }

    @Override
    public void addEmployee(EmployeeRequest request) {
        Employee employee = Employee.builder()
                .organizationId(request.getOrganizationId())
                .departmentId(request.getDepartmentId())
                .name(request.getName())
                .age(request.getAge())
                .position(request.getPosition())
                .build();
        employeeRepository.save(employee);
        NotificationRequest notificationRequest = NotificationRequest.builder()
                        .message("Employee created")
                        .sender("Kobe").build();

        notificationClient.sendNotification(notificationRequest);
    }

    @Override
    public List<Employee> findByDepartment(Long id) {
        return employeeRepository.findByDepartmentId(id);
    }
}
