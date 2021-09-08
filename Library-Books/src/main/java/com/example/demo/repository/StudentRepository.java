package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository <Student, Long>{
	public List<Student> findBySchoolId(long schoolId);
}
