package com.bourimans.employmentmng.service;

import com.bourimans.employmentmng.model.Departement;
import com.bourimans.employmentmng.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
private DepartementRepository departementRepository;
    @Override
    public void addDepartement(Departement departement) {
        departementRepository.save(departement);
    }
}
