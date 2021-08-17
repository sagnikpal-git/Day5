package com.app.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {

}
