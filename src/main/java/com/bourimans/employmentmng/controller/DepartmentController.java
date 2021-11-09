package com.bourimans.employmentmng.controller;

import com.bourimans.employmentmng.model.Departement;
import com.bourimans.employmentmng.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class DepartmentController {
    private IDepartmentService departmentService;
@Autowired
    public void setDepartmentService(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/AddDepartementForm")
    public String AddDepartmentForm(Departement departement, Model model){
    return "newDepartmentForm";
    }
    @PostMapping("addDepartemnt")
        public String AddDepartment(@Valid Departement dp){
    departmentService.addDepartement(dp);
    return "redirect:/";
        }
}
