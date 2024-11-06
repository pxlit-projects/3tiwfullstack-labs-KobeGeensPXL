package be.pxl.service.services;

import be.pxl.service.domain.Department;
import be.pxl.service.dto.DepartmentRequest;
import be.pxl.service.dto.DepartmentResponse;
import be.pxl.service.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService{
    private DepartmentRepository departmentRepository;

    public List<DepartmentResponse> getAllDepartments() {
        return departmentRepository.findAll().stream().map(this::mapToDepartmentResponse).toList();
    }
    private DepartmentResponse mapToDepartmentResponse(Department department) {
        return DepartmentResponse.builder()
                .organizationId(department.getOrganizationId())
                .name(department.getName())
                .employees(department.getEmployees())
                .build();
    }
    public void addDepartment(DepartmentRequest request) {
        Department newDepartment = Department.builder()
                .organizationId(request.getOrganizationId())
                .name(request.getName())
                .employees(request.getEmployees())
                .build();
        departmentRepository.save(newDepartment);
    }
}
