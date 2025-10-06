package java_assignment.AssignmentOne.employees;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 private String programmingLanguage;

		    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
		        super(name, employeeId, salary);
		        this.programmingLanguage = programmingLanguage;
		    }

		    public String getProgrammingLanguage() {
		        return programmingLanguage;
		    }

		    public void setProgrammingLanguage(String programmingLanguage) {
		        this.programmingLanguage = programmingLanguage;
		    }
	}

}
