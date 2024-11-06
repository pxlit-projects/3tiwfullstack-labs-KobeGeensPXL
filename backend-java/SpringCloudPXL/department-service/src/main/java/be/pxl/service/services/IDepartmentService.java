package be.pxl.service.services;

import be.pxl.service.dto.DepartmentRequest;
import be.pxl.service.dto.DepartmentResponse;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentResponse> getAllDepartments();

    void addDepartment(DepartmentRequest departmentRequest);
}
