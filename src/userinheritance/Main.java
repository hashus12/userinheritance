package userinheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("engin");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(instructor);
	}

}
