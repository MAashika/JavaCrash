package Constructor;

public class Parameterized {
	String Student_Name;
	int Student_Mark;
	public Parameterized(String Name,int TotalMarks) {
	       Student_Name=Name;
	       Student_Mark=TotalMarks;
		
	}
	public void info() {
		System.out.println("Student Name : "+ Student_Name);
		System.out.println("Student Mark : "+ Student_Mark);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized obj=new Parameterized("Divya",95);
	    obj.info();

	}

}
