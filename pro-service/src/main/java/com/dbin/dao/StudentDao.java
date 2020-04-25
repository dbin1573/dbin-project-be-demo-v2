package com.dbin.dao;


import com.dbin.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

//@Repository
@Component
public interface StudentDao extends JpaRepository<Long, Student> {

//    int insertStudent(Student student);
//
//    int deleteStudent(int studentId);
//
//    int updateStudent(Student student);
//
//    List<Student> searchFromStudent(String s);
//
//    Student selectStudentById(int studentId);
//
//    List<Student> selectAllStudents();

}
