package be.pxl.services.dto;

import be.pxl.services.domain.Department;
import be.pxl.services.domain.Employee;

import java.util.List;

import jakarta.persistence.ElementCollection;
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
