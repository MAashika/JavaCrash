package Conditional_statements;

public class Switch {
	public void res() {
		String Name="Anu";
		switch(Name) {
		case "Anu":
			System.out.println("Yes Correct");
        break;
		case "Dhivya":
			System.out.println("No that's Not Correct");
	        break;

		case "Hellen":
			System.out.println("No that's Not Correct");
	        break;

		case "Micheal":
			System.out.println("No that's Not Correct");
	        break;

		case "Priya":
			System.out.println("No that's Not Correct");
	        break;

		case "Karthika":
			System.out.println("No that's Not Correct");

		default:
			System.out.println("I Can't Remeber Your Name");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Switch obj=new Switch() ;
         obj.res();
        	 
         
	}

}
