package model;

public class FacultyPojo {
	
	private int facultyId;
	private String facultyFirstName;
	private String facultyLastName;
	private String facultyDepartment;
	private String facultyDesignation;
	private String facultyAddress;
	private String facultyEmailId;
	private long facultyPhoneNumber;
	
	public FacultyPojo(int facultyId, String facultyFirstName, String facultyLastName, String facultyDepartment,
			String facultyDesignation, String facultyAddress, String facultyEmailId, long facultyPhoneNumber) {
		super();
		this.facultyId = facultyId;
		this.facultyFirstName = facultyFirstName;
		this.facultyLastName = facultyLastName;
		this.facultyDepartment = facultyDepartment;
		this.facultyDesignation = facultyDesignation;
		this.facultyAddress = facultyAddress;
		this.facultyEmailId = facultyEmailId;
		this.facultyPhoneNumber = facultyPhoneNumber;
	}
	
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyFirstName() {
		return facultyFirstName;
	}
	public void setFacultyFirstName(String facultyFirstName) {
		this.facultyFirstName = facultyFirstName;
	}
	public String getFacultyLastName() {
		return facultyLastName;
	}
	public void setFacultyLastName(String facultyLastName) {
		this.facultyLastName = facultyLastName;
	}
	public String getFacultyDepartment() {
		return facultyDepartment;
	}
	public void setFacultyDepartment(String facultyDepartment) {
		this.facultyDepartment = facultyDepartment;
	}
	public String getFacultyDesignation() {
		return facultyDesignation;
	}
	public void setFacultyDesignation(String facultyDesignation) {
		this.facultyDesignation = facultyDesignation;
	}
	public String getFacultyAddress() {
		return facultyAddress;
	}
	public void setFacultyAddress(String facultyAddress) {
		this.facultyAddress = facultyAddress;
	}
	public String getFacultyEmailId() {
		return facultyEmailId;
	}
	public void setFacultyEmailId(String facultyEmailId) {
		this.facultyEmailId = facultyEmailId;
	}
	public long getFacultyPhoneNumber() {
		return facultyPhoneNumber;
	}
	public void setFacultyPhoneNumber(long facultyPhoneNumber) {
		this.facultyPhoneNumber = facultyPhoneNumber;
	}

	@Override
	public String toString() {
		return "FacultyPojo [facultyId=" + facultyId + ", facultyFirstName=" + facultyFirstName + ", facultyLastName="
				+ facultyLastName + ", facultyDepartment=" + facultyDepartment + ", facultyDesignation="
				+ facultyDesignation + ", facultyAddress=" + facultyAddress + ", facultyEmailId=" + facultyEmailId
				+ ", facultyPhoneNumber=" + facultyPhoneNumber + "]";
	}

}
