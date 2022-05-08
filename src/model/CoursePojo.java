package model;

public class CoursePojo {
	// private variables
	// default constructore
	// parametrized constructor
	// public getters/setters
	// toString
	// equals - if required
	// hashCode - if required
	
		private int courseId;
		private String courseName;
		private String courseCode;
		private String courseDescription;
		private int courseCost;
		private int courseDuration;
		private String courseInstructorName;
		private String courseImageUrl;
		
		
		public CoursePojo(int courseId, String courseName, String courseCode, String courseDescription, int courseCost,
				int courseDuration, String courseInstructorName, String courseImageUrl) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.courseCode = courseCode;
			this.courseDescription = courseDescription;
			this.courseCost = courseCost;
			this.courseDuration = courseDuration;
			this.courseInstructorName = courseInstructorName;
			this.courseImageUrl = courseImageUrl;
		}


		public int getCourseId() {
				return courseId;
			}


		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}


		public String getCourseName() {
			return courseName;
		}


		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}


		public String getCourseCode() {
			return courseCode;
		}


		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}


		public String getCourseDescription() {
			return courseDescription;
		}


		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}


		public int getCourseCost() {
			return courseCost;
		}


		public void setCourseCost(int courseCost) {
			this.courseCost = courseCost;
		}


		public int getCourseDuration() {
			return courseDuration;
		}


		public void setCourseDuration(int courseDuration) {
			this.courseDuration = courseDuration;
		}


		public String getCourseInstructorName() {
			return courseInstructorName;
		}


		public void setCourseInstructorName(String courseInstructorName) {
			this.courseInstructorName = courseInstructorName;
		}


		public String getCourseImageUrl() {
			return courseImageUrl;
		}


		public void setCourseImageUrl(String courseImageUrl) {
			this.courseImageUrl = courseImageUrl;
		}


	@Override
		public String toString() {
			return "CoursePojo [courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode
					+ ", courseDescription=" + courseDescription + ", courseCost=" + courseCost + ", courseDuration="
					+ courseDuration + ", courseInstructorName=" + courseInstructorName + ", courseImageUrl="
					+ courseImageUrl + "]";
		}

	public CoursePojo() {

	}

}
