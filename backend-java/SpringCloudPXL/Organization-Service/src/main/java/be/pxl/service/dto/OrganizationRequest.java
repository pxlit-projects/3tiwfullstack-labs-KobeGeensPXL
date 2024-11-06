package be.pxl.service.dto;

import be.pxl.service.domain.Department;
import be.pxl.service.domain.Employee;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationRequest {
    private String name;
    private String address;
    private List<Employee> employees;
    private List<Department> departments;
}
