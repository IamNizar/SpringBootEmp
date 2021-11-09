package com.bourimans.employmentmng.repository;

import com.bourimans.employmentmng.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer> {

}