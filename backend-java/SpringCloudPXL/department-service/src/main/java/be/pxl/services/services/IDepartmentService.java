package be.pxl.services.services;

import be.pxl.services.domain.Department;
import be.pxl.services.dto.DepartmentRequest;
import be.pxl.services.dto.DepartmentResponse;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentResponse> getAllDepartments();

    void addDepartment(DepartmentRequest departmentRequest);
}
