package org.devgroup.handbook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "gender", nullable = false)
    private Gender gender;
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department", nullable = false)
    private Department department;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position", nullable = false)
    private Position position;
    @Column(name = "salary", nullable = false)
    private Integer salary;
    @Column(name = "grade", nullable = false)
    private Integer grade;
}
