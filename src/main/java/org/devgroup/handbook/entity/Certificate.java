package org.devgroup.handbook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table(name = "certificate")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee")
    private Employee employee;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "company")
    private String nameCompany;
    @Column(name = "certificate_name")
    private String nameCertificate;
    @Column(name = "number")
    private String number;
    @Column(name = "scan")
    @Lob
    private Blob scan;
}
