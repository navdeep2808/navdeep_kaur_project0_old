package dao;

import java.util.List;

import model.CoursePojo;
import exception.EmptyCourseCatalogException;

public interface CourseDao {
	
	CoursePojo addCourse(CoursePojo coursePojo);
	
	CoursePojo updateCourse(CoursePojo coursePojo);
	
	void deleteCourse(int courseId);
	
	List <CoursePojo> getAllCourses() throws EmptyCourseCatalogException;
	
	CoursePojo getACourse(int courseId);

}
