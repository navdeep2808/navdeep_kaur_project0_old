package presentation;

import java.util.List;
import java.util.Scanner;

import exception.EmptyCourseCatalogException;
import model.CoursePojo;
import service.CourseService;
import service.CourseServiceImpl;
import dao.CourseDao;
import dao.CourseDaoCollectionImpl;


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
			List<CoursePojo> everyCourse;
			String userInput;
			int userInputCourseId;

			switch(option) {
				case 1:
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
					//CourseService addCourseService=courseService.addCourse(CourseDao);
					System.out.println("***************************************************************************************");
					System.out.println(" Add a new Course");
					userInput = scan.nextLine();
					System.out.println(" Input the Name of Course");
					userInput = scan.nextLine();
					System.out.println(" Input the Course code");
					userInput = scan.nextLine();
					System.out.println(" Input the Course Description");
					userInput = scan.nextLine();
					System.out.println(" Input the Cost of Course in USD");
					userInput = scan.nextLine();
					System.out.println(" Input the Duration of Course in Hours");
					userInput = scan.nextLine();
					System.out.println(" Input the Name of Course Instructor");
					userInput = scan.nextLine();
					System.out.println("***************************************************************************************");
					System.out.println(" Below are the details of Course added by you:");
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME\tCode\tDESCRIPTION\tCOST\tDuration\tInstructor Name");
					System.out.println("***************************************************************************************");
					//addCourseService.forEach((newItem)-> System.out.println(newItem.getCourseId() + "\t" + newItem.getCourseName() + "\t" +  newItem.getCourseCode() + "\t" + newItem.getCourseDescription() + "\t" + newItem.getCourseCost() + "\t" + newItem.getCourseDuration() + "\t\t" + newItem.getCourseInstructorName()));
					break;
					
				case 3:
					System.out.println("***************************************************************************************");
					System.out.println(" Delete a  Course");
					System.out.println(" Input the course ID of the Course that you want to delete");
					userInputCourseId = scan.nextInt();
					//CourseService deletedCourse = new CourseServiceImpl();
					courseService.deleteCourse(userInputCourseId);
					break;
					
				case 4:
					System.out.println("***************************************************************************************");
					System.out.println(" Update a  Course");
					System.out.println(" Input the course ID of the Course that you want to update");
					userInput = scan.nextLine();
					System.out.println("***************************************************************************************");
					System.out.println(" Select from the options below the data that you want to update in a Course");
					System.out.println(" 1. Name of Course ");
					System.out.println(" 2. Course Code of Course ");
					System.out.println(" 3. Description of Course ");
					System.out.println(" 4. Cost of Course ");
					System.out.println(" 5. Duration of Course ");
					System.out.println(" 6. Name of Instructor of Course ");
					int updationChoice;
					updationChoice = scan.nextInt();
					switch(updationChoice){
					case 1: 
						System.out.println(" Input the New Name of Course");
						userInput = scan.nextLine();
						break;
						
					case 2:
						System.out.println(" Input the New Course code");
						userInput = scan.nextLine();
						break;
						
					case 3:
						System.out.println(" Input the New Course Description");
						userInput = scan.nextLine();
						break;
						
					case 4:
						System.out.println(" Input the New Cost of Course in USD");
						userInput = scan.nextLine();
						break;
						
					case 5:						
						System.out.println(" Input the New Duration of Course in Hours");
						userInput = scan.nextLine();
						break;
					
					case 6:
						System.out.println(" Input the Name of Course Instructor");
						userInput = scan.nextLine();
						break;
						
					default:
						System.out.println(" Input the correct option");
						break;
					}
					System.out.println("***************************************************************************************");
					System.out.println(" Below are the details of Course added by you:");
					System.out.println("***************************************************************************************");
					System.out.println("ID\tNAME\tCode\tDESCRIPTION\tCOST\tDuration\tInstructor Name");
					System.out.println("***************************************************************************************");
					//addCourseService.forEach((newItem)-> System.out.println(newItem.getCourseId() + "\t" + newItem.getCourseName() + "\t" +  newItem.getCourseCode() + "\t" + newItem.getCourseDescription() + "\t" + newItem.getCourseCost() + "\t" + newItem.getCourseDuration() + "\t\t" + newItem.getCourseInstructorName()));
					
				//	courseService.updateCourse(CoursePojo);
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
