package be.pxl.service.services;

import be.pxl.service.dto.OrganizationRequest;
import be.pxl.service.dto.OrganizationResponse;

import java.util.List;

public interface IOrganizationService {
    List<OrganizationResponse> getAllOrganizations();

    void addOrganization(OrganizationRequest organizationRequest);
}
