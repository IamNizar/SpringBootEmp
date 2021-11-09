package com.bourimans.employmentmng.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Column(name="dept_name",length = 25)
    private String deptname;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "departement")
    private Set<Employee> employees;
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
