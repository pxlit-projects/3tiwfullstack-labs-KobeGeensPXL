package be.pxl.services.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Employee {
    private Long id;
    @Column(name = "organization_id")
    private Long organizationId;
    @Column(name = "department_id")
    private Long departmentId;
    private String name;
    private int age;
    private String position;
}
