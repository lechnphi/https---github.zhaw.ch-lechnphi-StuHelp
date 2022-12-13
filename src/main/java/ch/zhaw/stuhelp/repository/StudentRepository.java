package ch.zhaw.stuhelp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ch.zhaw.stuhelp.model.Student;


public interface StudentRepository extends MongoRepository<Student,String>{
    List<Student> findByEmail(String email);


}
