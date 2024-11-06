package be.pxl.service.controller;

import be.pxl.service.dto.DepartmentRequest;
import be.pxl.service.dto.DepartmentResponse;
import be.pxl.service.services.IDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {
    @Autowired
    private final IDepartmentService departmentService;



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DepartmentResponse> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDepartment(@RequestBody final DepartmentRequest departmentRequest) {
        departmentService.addDepartment(departmentRequest);
    }
}
