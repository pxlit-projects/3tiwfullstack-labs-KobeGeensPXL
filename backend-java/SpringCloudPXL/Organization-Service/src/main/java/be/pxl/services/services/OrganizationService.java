package be.pxl.services.services;


import be.pxl.services.domain.Organization;
import be.pxl.services.dto.OrganizationRequest;
import be.pxl.services.dto.OrganizationResponse;
import be.pxl.services.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService {
    private final OrganizationRepository organizationRepository;
    @Override
    public List<OrganizationResponse> getAllOrganizations() {
        return organizationRepository.findAll().stream().map(this::mapToOrganizationResponse).toList();
    }
    private OrganizationResponse mapToOrganizationResponse(Organization entity) {
        return OrganizationResponse.builder()
                .name(entity.getName())
                .address(entity.getAddress())
                .departments(entity.getDepartments())
                .build();
    }
    @Override
    public void addOrganization(OrganizationRequest request) {
        Organization organization = Organization.builder()
                .name(request.getName())
                .address(request.getAddress())
                .departments(request.getDepartments())
                .build();
        organizationRepository.save(organization);
    }
}
