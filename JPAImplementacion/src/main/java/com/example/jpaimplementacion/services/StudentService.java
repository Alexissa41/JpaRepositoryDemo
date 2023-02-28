package com.example.jpaimplementacion.services;

import com.example.jpaimplementacion.dto.StudentDto;
import com.example.jpaimplementacion.entities.Student;
import com.example.jpaimplementacion.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService{
    private IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

@Override
    public List<StudentDto> obtenerEstudiantes(){
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students.stream().map( stu -> {
          return new StudentDto(stu.getDni(), stu.getName(), stu.getLastname());
        }).collect(Collectors.toList());

        return studentDtoList;
    }
}
