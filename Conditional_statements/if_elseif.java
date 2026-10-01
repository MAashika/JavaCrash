package Conditional_statements;

import java.util.Scanner;

public class if_elseif {
	public if_elseif() {
		   Scanner scan=new Scanner(System.in);
		   int Result=scan.nextInt();
		   int Mark_Obtained=Result;
				   
	   
	    	if(Mark_Obtained>35 && Mark_Obtained<80 ) {
				System.out.println("You have passed");
			}
			else if(Mark_Obtained<35 ) {
				System.out.println("Sorry,You're failed");
			}
			else if(Mark_Obtained==100)
			{
				System.out.println("You have got full marks!!Congratulations");
			}
			else{
				System.out.println("You're just passed");
			}
	   
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          if_elseif obj=new if_elseif();
	}

}
