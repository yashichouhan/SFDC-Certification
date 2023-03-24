package com.nagarro.sfdcCertification.repository;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

        @Id
        private long id;
        @Column(name="sno")
        private long sno;
        @Column(name="name")
        private String name;
        @Column(name="squad")
        private String squad;
        @Column(name="role")
        private String role;
        @Column(name="recommendedCertification")
        private String recommendedCertification;
        @Column(name="additionalCertificates")
        private String additionalCertificates;
        @Column(name="upskillingPlanTarget")
        private String upskillingPlanTarget;
    }
