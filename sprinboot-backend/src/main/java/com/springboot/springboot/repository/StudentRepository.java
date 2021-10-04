package com.springboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
