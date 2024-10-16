package be.pxl.services.services;

import be.pxl.services.dto.OrganizationRequest;
import be.pxl.services.dto.OrganizationResponse;

import java.util.List;

public interface IOrganizationService {
    List<OrganizationResponse> getAllOrganizations();

    void addOrganization(OrganizationRequest organizationRequest);
}
