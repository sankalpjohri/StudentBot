package com.techie.project.StudentBot.Repository;

import com.techie.project.StudentBot.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("com.techie.project.StudentBot.Repository.StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findByRollNo(String rollNo);

}
