package com.dbin.dao;

import com.dbin.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

//@Repository
@Component
public interface TeacherDao extends JpaRepository<Long, Teacher> {

//    int insertTeacher(Teacher teacher);
//
//    int deleteTeacher(int teacherId);
//
//    int updateTeacher(Teacher teacher);
//
//    List<Teacher> searchFromTeacher(String s);
//
//    Teacher selectTeacherById(int teacherId);
//
//    List<Teacher> selectAllTeachers();

}
