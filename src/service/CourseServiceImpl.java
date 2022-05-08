package service;

import java.util.List;

import dao.CourseDao;
import dao.CourseDaoCollectionImpl;
import exception.EmptyCourseCatalogException;
import model.CoursePojo;

public class CourseServiceImpl implements CourseService{
	
	CourseDao courseDao;

	public CourseServiceImpl() {
		courseDao = new CourseDaoCollectionImpl();
	}

	@Override
	public CoursePojo addCourse(CoursePojo coursePojo) {
		return courseDao.addCourse(coursePojo);
	}

	@Override
	public CoursePojo updateCourse(CoursePojo coursePojo) {
		return courseDao.updateCourse(coursePojo);
	}

	@Override
	public void deleteCourse(int courseId) {
		courseDao.deleteCourse(courseId);
	}
	
	@Override
	public List<CoursePojo> getAllCourses()throws EmptyCourseCatalogException{
		return courseDao.getAllCourses();
	}

	@Override
	public CoursePojo getACourse(int courseId) {
		return courseDao.getACourse(courseId);
	}

	
}
