package com.dbin.dao;

import com.dbin.entity.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import java.util.List;

//@Repository
@Component
@Mapper
public interface CourseDao extends JpaRepository<Long, Course> {
    /**//*insert into courses (courseName,teacherId,courseCredit) value-->
<!--        (#{courseName},#{teacher.teacherId},#{courseCredit})*/
    @Insert("insert into course value #{name},#{teacherId},#{courseCredit}")
    int insertCourse(@Param("course") Course course);

    @Delete("delete from courses where id=#{id}")
    int deleteCourse(@Param("id") int Id);

    @Select("update courses set courseName=#{name},teacherId=#{teacherId},courseCredit=#{courseCredit} where id=#{id}")
    int updateCourse(@Param("course") Course course);

//    List<Course> searchFromCourse(String s);

    @Select("select id,name,teacherId,courseCredit from courses where courseId=#{id}")
    Course selectCourseById(@Param("id")int id);

    @Select("select id,name,teacherId,courseCredit from courses")
    List<Course> selectAllCourses();

}
