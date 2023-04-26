package mw.training.mongoapp.service;

import lombok.AllArgsConstructor;
import mw.training.mongoapp.model.Student;
import mw.training.mongoapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
