package com.example.studentdal;

import com.example.studentdal.entities.Student;
import com.example.studentdal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent() {

        Student student = new Student();
        student.setName("John");
        student.setCourse("Java");
        student.setFee(100);

        studentRepository.save(student);
    }

    @Test
    public void testFindStudentById() {
        Student student = studentRepository.findById(1l).get();
        System.out.println(student);
    }

    @Test
    public void testUpdateStudentById() {
        Student student = studentRepository.findById(1l).get();
        student.setFee(40d);
        studentRepository.save(student);
        System.out.println(student);
    }

    @Test
    public void testDeleteStudent() {
        Student student = new Student();
        student.setId(1l);
        studentRepository.delete(student);
    }

}
