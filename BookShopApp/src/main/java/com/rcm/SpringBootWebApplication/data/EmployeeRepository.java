package com.rcm.SpringBootWebApplication.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcm.SpringBootWebApplication.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
