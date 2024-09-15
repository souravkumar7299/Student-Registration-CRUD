package com.studentCRUD.StudentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentCRUD.StudentCRUD.domain.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {

}
