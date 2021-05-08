package userinheritance;

public class StudentManager extends UserManager {
	public void courseRegister(Student student) {
		System.out.println(student.getFirstName() + " course register");
	}
}
