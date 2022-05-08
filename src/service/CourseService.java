package service;

import java.util.List;

import exception.EmptyCourseCatalogException;
import model.CoursePojo;

public interface CourseService {

	CoursePojo addCourse(CoursePojo coursePojo);
	
	CoursePojo updateCourse(CoursePojo coursePojo);
	
	void deleteCourse(int courseId);
	
	List <CoursePojo> getAllCourses() throws EmptyCourseCatalogException;
	
	CoursePojo getACourse(int courseId);
}
