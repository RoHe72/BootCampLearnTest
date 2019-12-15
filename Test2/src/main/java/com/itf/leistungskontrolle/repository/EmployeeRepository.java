package com.itf.leistungskontrolle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itf.leistungskontrolle.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
