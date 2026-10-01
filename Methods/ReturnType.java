package Methods;

public class ReturnType {
	int age=23;
	String Name="Aashika";
	String Address="Nagercoil";
	public String Emp() {
		System.out.println("Emp Name :"+ Name);
		System.out.println("Emp Age :" + age);
		System.out.println("Emp Address :" + Address);
		return Name;
	}
	public static void main(String [] args) {
		ReturnType obj=new ReturnType();
		String Result=obj.Emp();
		System.out.println("Name is "+ Result);
	}

}
