package com.example.jpaimplementacion.repository;

import com.example.jpaimplementacion.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}
