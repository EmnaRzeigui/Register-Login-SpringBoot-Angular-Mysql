package com.test1.Register_Login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.test1.Register_Login.entity.Employee;




@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	Optional <Employee> findOneByEmailAndPassword (String email, String password);
	
	Employee findByEmail(String email);
	
}
