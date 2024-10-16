package be.pxl.services.domain;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Department {
    private Long id;
    @Column(name = "organization_id")
    private Long organizationId;
    private String name;
    @ElementCollection
    private List<Employee> employees;
    private String position;
}
