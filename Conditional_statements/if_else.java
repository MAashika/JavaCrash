package Conditional_statements;

public class if_else {
	Integer Mark_Obtained=200;
    public void result() {
    	if(Mark_Obtained.equals(100)) {
			System.out.println("Yes,You have passed");
		}
		else {
			System.out.println("Sorry,You're failed");
		}
   
	}

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if_else obj=new if_else();
		obj.result();
	}
}
