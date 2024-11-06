package be.pxl.service.controller;

import be.pxl.service.dto.OrganizationRequest;
import be.pxl.service.dto.OrganizationResponse;
import be.pxl.service.services.IOrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organisation")
@RequiredArgsConstructor
public class OrganizationController {
    private final IOrganizationService organizationService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrganizationResponse> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewOrganization(@RequestBody OrganizationRequest organizationRequest) {
        organizationService.addOrganization(organizationRequest);
    }
}
