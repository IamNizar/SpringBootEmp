package com.bourimans.employmentmng.repository;

import com.bourimans.employmentmng.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value = "select * from Employee where governmentID = ?1",nativeQuery = true)
Employee findEmployeeByGovernmentID(String govID);
}
