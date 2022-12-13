package ch.zhaw.stuhelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.stuhelp.model.Student;
import ch.zhaw.stuhelp.model.StudentCreateDTO;
import ch.zhaw.stuhelp.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@RequestBody StudentCreateDTO sDTO) {
        Student sDAO = new Student(sDTO.getEmail(), sDTO.getName(), sDTO.getPrename(), sDTO.getTelephone(),
                sDTO.getSchool(), sDTO.getStudy(), sDTO.getMatrikel() );
        Student s = studentRepository.save(sDAO);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStu = studentRepository.findAll();
        return new ResponseEntity<>(allStu, HttpStatus.OK);

    }

}