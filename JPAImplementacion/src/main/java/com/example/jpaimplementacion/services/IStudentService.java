package com.example.jpaimplementacion.services;

import com.example.jpaimplementacion.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService{

    public List<StudentDto> obtenerEstudiantes();
}
