package com.atl.edusoftware.data.repository;

import com.atl.edusoftware.data.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,String>{
    Student findByUsername(String username);
}
