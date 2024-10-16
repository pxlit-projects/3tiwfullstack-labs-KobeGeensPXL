package be.pxl.services.controller;

import be.pxl.services.dto.OrganizationRequest;
import be.pxl.services.dto.OrganizationResponse;
import be.pxl.services.services.IOrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
