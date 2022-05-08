package presentation;

import java.util.List;
import java.util.Scanner;

import exception.EmptyCourseCatalogException;
import model.CoursePojo;
import service.CourseService;
import service.CourseServiceImpl;

public class CourseRegistrationSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CourseService courseService = new CourseServiceImpl();
		char proceed = 'y';
		
		while(proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("COURSE REGISTRATION SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. List all Courses");
			System.out.println("2. Add a new Course");
			System.out.println("3. Delete a Course");
			System.out.println("4. Update a Course");
			System.out.println("5. Exit");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");
			switch(option) {
				case 1:
					List<CoursePojo> everyCourse;
					try {
						everyCourse = courseService.getAllCourses();
					} catch (EmptyCourseCatalogException e) {
						System.out.println(e.getMessage());
						break;
					}
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME\tCode\tDESCRIPTION\tCOST\tDuration\tInstructor Name");
					System.out.println("***************************************************************************************");
					everyCourse.forEach((item)-> System.out.println(item.getCourseId() + "\t" + item.getCourseName() + "\t" +  item.getCourseCode() + "\t" + item.getCourseDescription() + "\t" + item.getCourseCost() + "\t" + item.getCourseDuration() + "\t\t" + item.getCourseInstructorName()));
					System.out.println("***************************************************************************************");
					System.out.println("Do you want to continue?(y/n)");
					proceed = scan.next().charAt(0);
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					System.out.println("***************************************************************************************");
					System.out.println("Thank you for using Course Registration System!!");
					System.out.println("***************************************************************************************");
					System.exit(0);
				default:
					
			}
			
		}
		System.out.println("***************************************************************************************");
		System.out.println("Thank you for using Course Registration System!!");
		System.out.println("***************************************************************************************");
		System.exit(0);
	}

}
